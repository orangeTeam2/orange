package com.lhb.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 08:22 2019/11/13
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "main/index";
    }
}
