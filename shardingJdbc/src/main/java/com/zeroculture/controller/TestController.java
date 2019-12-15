package com.zeroculture.controller;

import com.zeroculture.model.TestBean;
import com.zeroculture.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping(value = "/home")
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping(value = "/homepage")
    @ResponseBody
    public List<TestBean> getHomePage(String name) throws Exception {
        return testService.getUserList();
    }

}
