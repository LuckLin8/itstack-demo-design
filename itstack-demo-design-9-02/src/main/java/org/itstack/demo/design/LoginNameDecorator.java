package org.itstack.demo.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author lbw
 * @Description
 * @date 2022/5/5 22:31
 */
public class LoginNameDecorator extends SsoDecorator{

    private Logger logger = LoggerFactory.getLogger(LoginNameDecorator.class);

    public LoginNameDecorator(HandlerInterceptor handlerInterceptor) {
        super(handlerInterceptor);
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        boolean success = super.preHandle(request, response, handler);
        if (!success){
            return false;
        }
        //校验登录名的业务逻辑
        return true;
    }
}
