package com.wintop.springcloudgateway.entity;

import lombok.Data;

@Data
public class TokenBean {
    private String id;
    private String userId;
    private String token;
    private String updatedate;
}
