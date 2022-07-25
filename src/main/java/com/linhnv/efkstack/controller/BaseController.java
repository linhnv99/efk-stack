package com.linhnv.efkstack.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/health-check")
    public String healthCheck() {
        logger.info("Call api health-check");
        return "OK";
    }
}
