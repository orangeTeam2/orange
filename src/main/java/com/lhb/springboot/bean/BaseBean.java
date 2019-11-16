package com.lhb.springboot.bean;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;

import javax.servlet.MultipartConfigElement;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 07:44 2019/11/16
 */
public class BaseBean {
    @Bean
    MultipartConfigElement multipartConfigElement() {
             MultipartConfigFactory factory = new MultipartConfigFactory();
             factory.setLocation("/app/tmp");
             return factory.createMultipartConfig();
         }
}
