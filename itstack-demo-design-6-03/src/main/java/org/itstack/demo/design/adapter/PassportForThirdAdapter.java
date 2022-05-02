package org.itstack.demo.design.adapter;

import org.itstack.demo.design.SignInService;
import org.itstack.demo.design.adapter.impl.LoginForTelAdapter;
import org.itstack.demo.design.adapter.impl.LoginForWechatAdapter;
import org.itstack.demo.design.result.ResultMsg;

import java.util.HashMap;
import java.util.Map;

public class PassportForThirdAdapter extends SignInService implements IPassportForThird {
    @Override
    public ResultMsg loginForTel(String telephone, String code) {

        return procssLogin(new HashMap<String,String>(){{
            put("telephone", telephone);
            put("code", code);
        }}, LoginForTelAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return procssLogin(new HashMap<String,String>(){{
            put("id",id);
        }},LoginForWechatAdapter.class);
    }

    @Override
    public ResultMsg loginForResist(String userName, String passWord) {
        super.regist(userName, passWord);
        return super.login(userName, passWord);
    }

    //这里使用简单工厂及策略模式
    private ResultMsg procssLogin(Map<String,String> keyMap, Class<? extends LoginAdapter> clazz) {
        try {
            LoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)) {
                return adapter.login(keyMap, adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}