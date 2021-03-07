package com.wintop.springcloudgateway.init.service.impl;

import com.wintop.springcloudgateway.entity.TokenBean;
import com.wintop.springcloudgateway.init.dao.TokenDao;
import com.wintop.springcloudgateway.init.service.TokenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TokenServiceImpl implements TokenService {

    @Resource
    private TokenDao tokenDao;

    @Override
    public TokenBean selectToken(String token) {
        return tokenDao.selectToken(token);
    }
}
