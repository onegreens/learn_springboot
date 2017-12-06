package com.cl.controller;

import com.cl.po.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cl on 2017/12/2.
 */
@RestController
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "say", method = RequestMethod.GET)
    public String say() {
        return girlProperties.getCupSize();
    }

    @RequestMapping(value = "/testPathVariable/{id}", method = RequestMethod.GET)
    public Integer testPathVariable(@PathVariable Integer id) {
        return id;
    }

    @Value("${testName}")
    private String testName;

    @Value("${testContent}")
    private String testContent;
}
