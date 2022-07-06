package org.itstack.demo.design.service.impl;

import org.itstack.demo.design.coupon.CouponResult;
import org.itstack.demo.design.coupon.CouponService;
import org.itstack.demo.design.dto.PresentReq;
import org.itstack.demo.design.dto.PresentResult;
import org.itstack.demo.design.service.IPresent;

public class CouponPresentServiceImpl implements IPresent {

    private final CouponService couponService = new CouponService();

    @Override
    public PresentResult sendPresent(PresentReq req) {
        PresentResult presentResult = new PresentResult(200);
        try {
            CouponResult couponResult = couponService.sendCoupon(req.getuId(), req.getCouponNumber(), req.getUuid());
            presentResult.setCouponResult(couponResult);
        } catch (Exception e) {
            return new PresentResult(500);
        }
        return presentResult;
    }
}
