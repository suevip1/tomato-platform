package com.tomato.reconciliation.utils;

import com.tomato.mybatis.domain.Sort;
import com.tomato.reconciliation.dbinfo.internal.domain.DbInfo;
import com.tomato.reconciliation.dbinfo.internal.mapper.DbInfoMapper;
import com.tomato.reconciliation.task.internal.Task;
import com.tomato.reconciliation.task.internal.mapper.TaskMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * ReconciliationUtil
 *
 * @author lizhifu
 * @since 2023/5/27
 */
@SpringBootTest
public class ReconciliationUtilTest {
    @Resource
    TaskMapper taskMapper;
    @Resource
    DbInfoMapper dbInfoMapper;
    @Test
    public void test(){
        Sort sort = Sort.by("id", Sort.Direction.ASC).and("create_time", Sort.Direction.DESC);
        List<Task> taskList = taskMapper.selectAll(sort);
        taskList.forEach(task -> {
            Optional<DbInfo> upDbInfo = dbInfoMapper.selectByPrimaryKey(task.getUpDbInfoId());
            Optional<DbInfo> downDbInfo = dbInfoMapper.selectByPrimaryKey(task.getDownDbInfoId());
            List<Map<String, Object>> upList = ExecuteQueryUtil.query(upDbInfo.get(), task.getUpTableSql());
            System.out.println("上游:"+upList);

            List<Map<String, Object>> downList = ExecuteQueryUtil.query(downDbInfo.get(), task.getDownTableSql());
            System.out.println("下游:"+downList);

            ReconciliationUtil reconciliationUtil = new ReconciliationUtil(upList,downList,task);
            reconciliationUtil.reconciliation();
            System.out.println("对账结果上游："+reconciliationUtil.getUpMap());
            System.out.println("对账结果下游"+reconciliationUtil.getDownMap());
        });
    }
}
