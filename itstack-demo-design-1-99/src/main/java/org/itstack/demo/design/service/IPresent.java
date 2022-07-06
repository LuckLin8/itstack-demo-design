package org.itstack.demo.design.service;

import org.itstack.demo.design.dto.PresentReq;
import org.itstack.demo.design.dto.PresentResult;

public interface IPresent {

    PresentResult sendPresent(PresentReq req);
}
