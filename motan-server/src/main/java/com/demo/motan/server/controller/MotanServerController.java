package com.demo.motan.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/motanServer")
public class MotanServerController {

    @GetMapping("/hello")
    public Map<String, Object> hello(HttpServletRequest request) {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("code", 0);
        return resultMap;
    }

}
