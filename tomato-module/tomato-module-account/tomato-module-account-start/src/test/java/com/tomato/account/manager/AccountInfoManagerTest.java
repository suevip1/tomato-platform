package com.tomato.account.manager;

import com.tomato.account.vo.enums.AccountTypeEnum;
import com.tomato.account.vo.req.AccountCreateReq;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * AccountManager
 *
 * @author lizhifu
 * @since 2023/1/1
 */
@SpringBootTest
public class AccountInfoManagerTest {
    @Resource
    AccountInfoManager accountInfoManager;

    @Test
    public void test(){
        AccountCreateReq accountCreateReq = new AccountCreateReq();
        accountCreateReq.setAccountType(AccountTypeEnum.SETTLEMENT.getValue());
        accountCreateReq.setMerchantNo("10202307240001001");
        accountCreateReq.setRemark("测试");
        accountInfoManager.create(accountCreateReq);
    }
}
