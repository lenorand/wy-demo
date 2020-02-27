package com.kun.demo.cloud.feign.controller;

import com.kun.demo.cloud.feign.server.CallClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Autowired
    private CallClientService callClientService;

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "demo") String name) {
        return callClientService.callHello(name);
    }
}
