package com.yzr.helloboot.service;

import com.yzr.helloboot.vo.Uuuuuuser;

public interface ILoginService {
	
	public Uuuuuuser selectByUserName(String UserName) throws Exception;
	
}
