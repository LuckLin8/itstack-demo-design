package org.itstack.demo.design.test;

import org.itstack.demo.design.LoginNameDecorator;
import org.itstack.demo.design.LoginSsoDecorator;
import org.itstack.demo.design.SsoInterceptor;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_LoginSsoDecorator() {
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator(new SsoInterceptor());
        String request = "1successhuahua";
//        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu", "t");
        LoginNameDecorator loginNameDecorator = new LoginNameDecorator(ssoDecorator);
//        System.out.println("登录校验：" + request + (success ? " 放行" : " 拦截"));
        System.out.println(loginNameDecorator.preHandle(request, "ewcdqwt40liuiu", "t"));
    }

}
