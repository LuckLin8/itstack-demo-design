package org.itstack.demo.design.test;

import org.itstack.demo.design.PresentEnum;
import org.itstack.demo.design.PresentFactory;
import org.itstack.demo.design.dto.PresentReq;
import org.itstack.demo.design.dto.PresentResult;
import org.itstack.demo.design.service.IPresent;

public class ApiTest {

    public static void main(String[] args) {

        // 1. 优惠券
        IPresent present = PresentFactory.getPresent(PresentEnum.Coupon);
        PresentReq req = new PresentReq();
        req.setuId("10001");
        req.setCouponNumber("EGM1023938910232121323432");
        req.setUuid("791098764902132");
        PresentResult presentResult = present.sendPresent(req);
        System.out.println(presentResult.toString());
    }
}
