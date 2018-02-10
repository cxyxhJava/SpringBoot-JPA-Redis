package com.frank.demo.web.controller;

/**
 * Created by yangxb on 2018/2/10.
 */

import com.frank.demo.center.content.EnumRespCode;
import com.frank.demo.center.exception.BaseException;
import com.frank.demo.web.resp.WebResp;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public abstract class BaseUsedController<P> extends BaseController{

    @RequestMapping(method = RequestMethod.POST, value = "", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object request(@RequestBody(required = false) P req, HttpServletRequest request, HttpServletResponse response) {
        try {
            // 验证请求参数
            valid(req);

            String userId = "";
            String account = "";

            // 验证登录
            if (needLogin()) {
            }


            // 处理业务
            Object res = doService(userId, account, req);
            return new WebResp<>(res);

        }catch (BaseException e){
            return new WebResp(e.getCode() , e.getErrorMsg());
        }catch (Exception e){
            logger.error("{}",e);
            return new WebResp(EnumRespCode.BUSY.getValue() , EnumRespCode.BUSY.getDesc());
        }

    }

    /**
     * 业务处理
     * @param req
     * @return 正常处理完成之后正常返回
     */
    protected abstract Object doService(String userId, String account, P req) throws BaseException;

}

