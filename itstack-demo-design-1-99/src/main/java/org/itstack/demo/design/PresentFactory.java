package org.itstack.demo.design;

import org.itstack.demo.design.service.IPresent;
import org.itstack.demo.design.service.impl.CouponPresentServiceImpl;
import org.itstack.demo.design.service.impl.GoodsPresentServiceImpl;
import org.itstack.demo.design.service.impl.IQiYiCardPresentServiceImpl;

public class PresentFactory {

    public static IPresent getPresent(PresentEnum presentEnum){
        if (presentEnum.equals(PresentEnum.IQIYI)){
            return new IQiYiCardPresentServiceImpl();
        }else if (presentEnum.equals(PresentEnum.Coupon)){
            return new CouponPresentServiceImpl();
        }else {
            return new GoodsPresentServiceImpl();
        }
    }
}
