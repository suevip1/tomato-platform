package com.tomato.seckill.manager;

import com.tomato.domain.resp.MultiResp;
import com.tomato.goods.domain.resp.GoodsInfoResp;
import com.tomato.goods.feign.RemoteGoodsService;
import com.tomato.seckill.constant.RedisConstant;
import com.tomato.seckill.dao.SeckillGoodsDao;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.scripting.support.ResourceScriptSource;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 秒杀活动商品缓存
 *
 * @author lizhifu
 * @since 2023/3/22
 */
@Service
@Slf4j
public class SeckillGoodsInfoCacheManager {
    /**
     * 定义脚本及其返回类型
     */
    private final DefaultRedisScript<Long> redisScript;

    private final RemoteGoodsService remoteGoodsService;
    private final SeckillGoodsDao seckillGoodsDao;
    private final StringRedisTemplate stringRedisTemplate;

    public SeckillGoodsInfoCacheManager(RemoteGoodsService remoteGoodsService, SeckillGoodsDao seckillGoodsDao, StringRedisTemplate stringRedisTemplate) {
        this.remoteGoodsService = remoteGoodsService;
        this.seckillGoodsDao = seckillGoodsDao;
        this.stringRedisTemplate = stringRedisTemplate;

        this.redisScript = new DefaultRedisScript<>();
        redisScript.setScriptSource(
                new ResourceScriptSource(new ClassPathResource("META-INF/scripts/goodsInfo.lua")));
        redisScript.setResultType(Long.class);

    }
    /**
     * 缓存
     * 秒杀的数据量不大，可以直接缓存到redis中
     * TODO 优化：秒杀的数据量大的时候，mongoDB,es 等等
     * @param seckillActivityId 秒杀活动id
     */
    public void cache(Long seckillActivityId){
        // 缓存秒杀商品信息
        String key = RedisConstant.SECKILL_GOODS_INFO + seckillActivityId;
        List<Long> idList = seckillGoodsDao.selectIdBySeckillActivityId(seckillActivityId);
        MultiResp<GoodsInfoResp> goodsInfoList = remoteGoodsService.queryGoodsInfoList(idList);
        if (Objects.nonNull(goodsInfoList) && goodsInfoList.isSuccess()){
            Map<String, Object> map = goodsInfoList.getData().stream()
                    .map(bean -> {
                        try {
                            return BeanUtils.describe(bean);
                        } catch (Exception e) {
                                log.error("缓存秒杀商品信息失败,seckillActivityId:{},e:{}",seckillActivityId,e);
                                return new HashMap<String, Object>();
                        }
                    })
                    .flatMap(m -> m.entrySet().stream())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            stringRedisTemplate.opsForHash().putAll(key,map);
            return;
        }
        log.error("缓存秒杀商品信息失败,seckillActivityId:{}",seckillActivityId);
    }
}