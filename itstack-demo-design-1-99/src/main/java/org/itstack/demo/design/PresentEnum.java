package org.itstack.demo.design;

public enum PresentEnum {
    IQIYI(1), Coupon(2), Goods(3);
    private Integer type;

    PresentEnum(int i) {

    }

    public Integer getType() {
        return type;
    }
}
