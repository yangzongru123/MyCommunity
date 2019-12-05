package com.yzr.helloboot.service;

import com.yzr.helloboot.dto.User;

public interface ILoginService {
	
	public User selectByUserName(String UserName) throws Exception;
	
}
