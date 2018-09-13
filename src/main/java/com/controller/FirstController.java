package com.controller;

/*
*@ClassName:FirstController
 @Description:TODO
 @Author:
 @Date:2018/9/10 16:13 
 @Version:v1.0fhg
 gddgft
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*1111表明这是一个controller*/
@Controller
@RequestMapping("/")
public class FirstController {
    //ResponseBody 以字符串响应 test connection
    @ResponseBody
    @RequestMapping("/hello.do")
    public String hello(){
            return "hello world";
    }


}
