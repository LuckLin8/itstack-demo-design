package org.itstack.demo.design.adapter.impl;

import com.alibaba.fastjson.JSONObject;
import org.itstack.demo.design.adapter.LoginAdapter;
import org.itstack.demo.design.entity.Member;
import org.itstack.demo.design.result.ResultMsg;

import java.util.Map;

public class LoginForWechatAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }

    @Override
    public ResultMsg login(Map<String,String> keyMap, Object adapter) {
        return new ResultMsg(200,"登陆成功："+ JSONObject.toJSONString(keyMap),new Member());
    }
}