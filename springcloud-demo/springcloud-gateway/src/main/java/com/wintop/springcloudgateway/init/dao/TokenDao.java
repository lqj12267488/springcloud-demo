package com.wintop.springcloudgateway.init.dao;

import com.wintop.springcloudgateway.entity.TokenBean;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface TokenDao {
    TokenBean selectToken(String token);
}
