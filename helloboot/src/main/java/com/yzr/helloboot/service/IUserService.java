package com.yzr.helloboot.service;

import com.yzr.helloboot.dto.User;

import java.util.Map;



public interface IUserService {
	
	//��ѯ��ҳ
    public Map<String,Object> selectALLUser(Map<String, Object> maps)throws Exception;
    
    //�����û�
    public void insertUser(User user)throws Exception;
    
    //��������
    public void resetPassword(User user)throws Exception;
    
  //��������ѡ���û�
    public User selectByPrimaryKey(Long id)throws Exception;
    
  //�����û�
    public void updateUserTable(User user)throws Exception;  
    
  //ɾ���û�
    public void delete(Long id)throws Exception;
    
}
