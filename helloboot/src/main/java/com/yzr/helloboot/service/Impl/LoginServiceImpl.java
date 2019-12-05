package com.yzr.helloboot.service.Impl;

import com.yzr.helloboot.dao.UserMapper;
import com.yzr.helloboot.dto.User;
import com.yzr.helloboot.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements ILoginService {
	
	@Autowired
	private UserMapper userDao;
	
	@Cacheable(value="xtkj",key="'LoginServiceImpl_selectByUserName_'+#userName")
	public User selectByUserName(String userName) throws Exception {
		
		return userDao.selectByUserName(userName);
		
	}
	
}
