package org.itstack.demo.design.adapter;

import org.itstack.demo.design.result.ResultMsg;

import java.util.Map;

public interface LoginAdapter {
    boolean support(Object adapter);

    ResultMsg login(Map<String,String> keyMap, Object adapter);
}