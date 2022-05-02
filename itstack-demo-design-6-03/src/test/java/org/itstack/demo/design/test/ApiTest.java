package org.itstack.demo.design.test;

import org.itstack.demo.design.adapter.IPassportForThird;
import org.itstack.demo.design.adapter.PassportForThirdAdapter;
import org.itstack.demo.design.result.ResultMsg;
import org.junit.Test;

/**
 * @Author lbw
 * @Description
 * @date 2022/5/2 15:01
 */
public class ApiTest {
    @Test
    public void loginTest(){
        IPassportForThird passportForThirdAdapter = new PassportForThirdAdapter();
        ResultMsg msg1 = passportForThirdAdapter.loginForTel("13728909878","9999");
        ResultMsg msg2 =passportForThirdAdapter.loginForWechat("98123891");
        ResultMsg msg3 =passportForThirdAdapter.loginForResist("alin","123456");
    }
}
