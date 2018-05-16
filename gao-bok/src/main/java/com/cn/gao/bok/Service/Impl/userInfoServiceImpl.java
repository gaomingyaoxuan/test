package com.cn.gao.bok.Service.Impl;

import com.cn.gao.bok.Service.userInfoService;
import com.cn.gao.bok.mapper.UserInfoMapper;
import com.cn.gao.bok.entity.UserInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service
public class userInfoServiceImpl implements userInfoService {

	@Resource
	UserInfoMapper userInfoMapper;

	@Override
	public UserInfo selectByPk(String id) {
		return userInfoMapper.selectByPrimaryKey(id);
	}
}
