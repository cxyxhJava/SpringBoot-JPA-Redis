package com.frank.demo.web.controller;

import com.frank.demo.center.content.EnumRespCode;
import com.frank.demo.center.exception.BaseException;
import com.frank.demo.center.util.BeanValidators;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.Validator;

public abstract class BaseController{

    protected Logger logger = LoggerFactory.getLogger(BaseController.class);

    @Autowired
    protected Validator validator;

    /**
     * 验证请求参数
     * @param req
     * @throws BaseException
     */
    protected void valid(Object req) throws BaseException {
        try {
            BeanValidators.valid(validator,req);
        }catch (Exception e){
            throw new BaseException(EnumRespCode.PARAMS_ERROR.getValue(), e.getMessage());
        }
    }

    /**
     * 是否需要验证登录
     *
     * @return
     */
    protected boolean needLogin() {
        return true;
    }

    /**
     * 校验token
     * @param token
     * @return
     * @throws BaseException
     */
    protected String checkToken(String token) throws BaseException {

        return "success";
    }
}
