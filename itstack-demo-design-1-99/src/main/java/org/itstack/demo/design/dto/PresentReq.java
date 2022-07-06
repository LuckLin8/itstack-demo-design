package org.itstack.demo.design.dto;

import org.itstack.demo.design.goods.DeliverReq;

public class PresentReq {
    /**
     * iqiyi
     */
    private String bindMobileNumber;
    private String cardId;

    /**
     * coupon
     */
    private String uId;
    private String couponNumber;
    private String uuid;

    /**
     * goodsinfo
     */
    private DeliverReq deliverReq;


    public String getBindMobileNumber() {
        return bindMobileNumber;
    }

    public void setBindMobileNumber(String bindMobileNumber) {
        this.bindMobileNumber = bindMobileNumber;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getCouponNumber() {
        return couponNumber;
    }

    public void setCouponNumber(String couponNumber) {
        this.couponNumber = couponNumber;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public DeliverReq getDeliverReq() {
        return deliverReq;
    }

    public void setDeliverReq(DeliverReq deliverReq) {
        this.deliverReq = deliverReq;
    }
}
