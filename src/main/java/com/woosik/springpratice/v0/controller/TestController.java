package com.woosik.springpratice.v0.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/ping", method= RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String ping() {
        return "ping result";
    }
}
