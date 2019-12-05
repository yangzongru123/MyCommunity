package com.yzr.helloboot.service.Impl;

import com.yzr.helloboot.dao.UuuuuuuuuuuuuuuserMapper;
import com.yzr.helloboot.vo.Uuuuuuser;
import com.yzr.helloboot.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements ILoginService {
	
	@Autowired
	private UuuuuuuuuuuuuuuserMapper userDao;
	
	@Cacheable(value="xtkj",key="'LoginServiceImpl_selectByUserName_'+#userName")
	public Uuuuuuser selectByUserName(String userName) throws Exception {
		
		return userDao.selectByUserName(userName);
		
	}
	
}
