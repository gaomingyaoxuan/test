package com.cn.gao.bok.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("base")
public class BaseController {

    @RequestMapping("test")
    public String test(){
        return "这是测试aaaaa";
    }
}
