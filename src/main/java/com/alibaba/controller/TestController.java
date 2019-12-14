package com.alibaba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value = "/home")
@Controller
public class TestController {

    @GetMapping(value = "/homepage")
    @ResponseBody
    public String getHomePage(String name) throws Exception {
        return "成功";
    }
}
