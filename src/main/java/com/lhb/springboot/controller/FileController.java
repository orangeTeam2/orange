package com.lhb.springboot.controller;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 08:55 2019/11/13
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.UUID;

/**
 * 文件上传
 */
@Controller
public class FileController {

    @GetMapping(value = "/file")
    public String file() {
        return "file";
    }


}
