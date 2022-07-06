package org.itstack.demo.design.service.impl;

import org.itstack.demo.design.dto.PresentReq;
import org.itstack.demo.design.dto.PresentResult;
import org.itstack.demo.design.goods.GoodsService;
import org.itstack.demo.design.service.IPresent;

public class GoodsPresentServiceImpl implements IPresent {

    private final GoodsService goodsService = new GoodsService();

    @Override
    public PresentResult sendPresent(PresentReq req) {
        boolean result;
        try {
            result = goodsService.deliverGoods(req.getDeliverReq());
        } catch (Exception e) {
            return new PresentResult(500);
        }
        return result ? new PresentResult(200) : new PresentResult(500);
    }
}
