package com.demo.motan.client.controller;

import com.demo.motan.api.rpcapi.FirstRpcApiService;
import com.weibo.api.motan.config.springsupport.annotation.MotanReferer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/motanClient")
public class MotanClientController {

    @MotanReferer
    private FirstRpcApiService firstRpcApiService;

    @GetMapping("/hello")
    public Map<String, Object> hello(HttpServletRequest request) {
        Map<String, Object> resultMap = new HashMap<>();
        String data = firstRpcApiService.hello("qinxi");
        resultMap.put("code", 0);
        resultMap.put("data", data);
        return resultMap;
    }

}
