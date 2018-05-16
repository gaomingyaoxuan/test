package com.cn.gao.bok.Service.Impl;

import com.cn.gao.bok.Service.userInfoService;

import com.cn.gao.bok.entity.Userinfo;
import com.cn.gao.bok.mapper.UserinfoMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service
public class userInfoServiceImpl implements userInfoService {

	@Resource
	UserinfoMapper userInfoMapper;

	@Override
	public Userinfo selectByPk(String id) {
		return userInfoMapper.selectByPrimaryKey(id);
	}
}
