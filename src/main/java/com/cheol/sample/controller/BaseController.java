package com.cheol.sample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BaseController {

    @Value("${zone}")
    String zone;

    @RequestMapping("/")
    public String base() {
        log.debug("{}", zone);
        return zone;
    }

}
