package org.itstack.demo.design.service.impl;

import org.itstack.demo.design.card.IQiYiCardService;
import org.itstack.demo.design.dto.PresentReq;
import org.itstack.demo.design.dto.PresentResult;
import org.itstack.demo.design.service.IPresent;

public class IQiYiCardPresentServiceImpl implements IPresent {

    /**
     * 注入
     */
    private final IQiYiCardService iQiYiCardService = new IQiYiCardService();

    @Override
    public PresentResult sendPresent(PresentReq req) {
        try {
            iQiYiCardService.grantToken(req.getBindMobileNumber(), req.getCardId());
        }catch (Exception e){
            return new PresentResult(500);
        }
        return new PresentResult(200);
    }
}
