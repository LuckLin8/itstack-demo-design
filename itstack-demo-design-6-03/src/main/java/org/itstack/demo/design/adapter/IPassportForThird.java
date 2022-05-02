package org.itstack.demo.design.adapter;

import org.itstack.demo.design.result.ResultMsg;

public interface IPassportForThird {
    ResultMsg loginForTel(String telephone, String code);

    ResultMsg loginForWechat(String id);

    ResultMsg loginForResist(String userName, String passWord);
}