package com.wintop.springcloudgateway.init.service;

import com.wintop.springcloudgateway.entity.TokenBean;

public interface TokenService {
    TokenBean selectToken(String token);
}
