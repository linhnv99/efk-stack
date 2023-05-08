package com.linhnv.efkstack.app;

import com.linhnv.efkstack.logger.KibanaLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private KibanaLogger kibanaLogger;

    @GetMapping
    public String hello() {
        kibanaLogger.log("mydata");
        return "Hello";
    }
}
