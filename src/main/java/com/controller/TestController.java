package com.controller;


import com.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private EmpService empService;

    @RequestMapping("/ok")
    public String testMvc(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/getDept")
    public List getDept(){
        List dept = empService.getDept();
        return dept;
    }
}
