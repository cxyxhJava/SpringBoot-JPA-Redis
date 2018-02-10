package com.frank.demo.web.controller;

import com.frank.demo.center.exception.BaseException;
import com.frank.demo.web.req.DemoReq;
import com.frank.demo.web.resp.DemoResp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangxb on 2018/2/10.
 */
@RestController
@RequestMapping("/demo")
public class DemoController extends BaseUsedController<DemoReq> {

    @RequestMapping("/hello")
    @Override
    protected DemoResp doService(String userId, String account, DemoReq req) throws BaseException {
        DemoResp demoResp = new DemoResp();
        return demoResp;
    }
}
