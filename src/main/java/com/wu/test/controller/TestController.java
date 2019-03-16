package com.wu.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class TestController {
    @RequestMapping(value = "indexTest")
    @ResponseBody
    public String indexTest(String name){
        log.info("---------------->>hello:{}",name);
        return "{'nihao':'你是谁'}";
    }
}
