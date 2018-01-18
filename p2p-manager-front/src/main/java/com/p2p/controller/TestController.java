package com.p2p.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/1/17 0017.
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    public  String test(){
         return "hello";
    }
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "index" ;
    }
}
