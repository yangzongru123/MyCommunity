package com.yzr.helloboot.service;

import com.yzr.helloboot.vo.Uuuuuuser;

import java.util.Map;



public interface IUserService {
	
	//��ѯ��ҳ
    public Map<String,Object> selectALLUser(Map<String, Object> maps)throws Exception;
    
    //�����û�
    public void insertUser(Uuuuuuser uuuuuuser)throws Exception;
    
    //��������
    public void resetPassword(Uuuuuuser uuuuuuser)throws Exception;
    
  //��������ѡ���û�
    public Uuuuuuser selectByPrimaryKey(Long id)throws Exception;
    
  //�����û�
    public void updateUserTable(Uuuuuuser uuuuuuser)throws Exception;
    
  //ɾ���û�
    public void delete(Long id)throws Exception;
    
}
