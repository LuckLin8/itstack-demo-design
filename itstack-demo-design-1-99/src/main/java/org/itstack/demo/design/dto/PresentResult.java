package org.itstack.demo.design.dto;

import org.itstack.demo.design.coupon.CouponResult;

public class PresentResult {
    private CouponResult couponResult;

    private Integer code;

    @Override
    public String toString() {
        return "PresentResult{" +
                "couponResult=" + couponResult +
                ", code=" + code +
                '}';
    }

    public PresentResult() {
    }

    public PresentResult(Integer code) {
        this.code = code;
    }

    public CouponResult getCouponResult() {
        return couponResult;
    }

    public void setCouponResult(CouponResult couponResult) {
        this.couponResult = couponResult;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
