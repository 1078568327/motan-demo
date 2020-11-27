package com.demo.motan.server.rpcimpl;

import com.demo.motan.api.rpcapi.FirstRpcApiService;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

@MotanService
public class FirstRpcApiServiceImpl implements FirstRpcApiService {
    @Override
    public String hello(String name) {
        return "hello " + name + "!!!";
    }
}
