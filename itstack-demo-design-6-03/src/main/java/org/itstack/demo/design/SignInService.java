package org.itstack.demo.design;


import org.itstack.demo.design.entity.Member;
import org.itstack.demo.design.result.ResultMsg;

/**
 * 老版本的登陆注册代码
 * 现需要
 */
public class SignInService {
    public ResultMsg regist(String userName, String passWord) {
        return new ResultMsg(200, "注册成功", new Member());
    }

    public ResultMsg login(String userName, String passWord) {
        return new ResultMsg(200,"登陆成功："+ userName,new Member());
    }
}