package com.kun.demo.cloud.feign.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-client")
public interface CallClientService {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String callHello(@RequestParam(value = "name") String name);
}
