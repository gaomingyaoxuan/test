package com.cn.gao.bok.controller;

import com.cn.gao.bok.Service.userInfoService;
import com.cn.gao.bok.entity.UserInfo;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("test")
public class testController {

	@Resource
	private userInfoService userinfoService;
	@Resource
	private StringRedisTemplate stringRedisTemplate;

	@RequestMapping("testSpringBoot")
	public UserInfo test(String id){
		return userinfoService.selectByPk(id);
	}

	@RequestMapping("testredis")
	public String testredis() {
	String name = stringRedisTemplate.opsForValue().get("name");
		return name;
	}

	@RequestMapping("login")
	public String login() {
		return "login.html";
	}
}
