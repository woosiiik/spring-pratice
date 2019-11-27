package com.woosik.springpratice.jpa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jpa")
public class JpaController {

    @RequestMapping (value="/test0", method=RequestMethod.GET)
    public String test0() {
        return "JPA test !!";
    }
}
