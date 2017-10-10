package com.soecode.lyf.service;

import com.soecode.lyf.entity.VidePathEntity;
import retrofit2.http.Body;
import retrofit2.http.POST;


/**
 * Created by fengtiepeng on 2017/10/10.
 */
public interface IpServer {

    @POST("/v1/addIpServer")
    Integer addIpServer(@Body VidePathEntity videPathEntity);
}
