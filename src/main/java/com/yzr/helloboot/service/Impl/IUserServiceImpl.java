package com.yzr.helloboot.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.yzr.helloboot.dao.RoleMapper;
import com.yzr.helloboot.dao.UuuuuuuuuuuuuuuserMapper;
import com.yzr.helloboot.vo.Role;
import com.yzr.helloboot.vo.Uuuuuuser;
import com.yzr.helloboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class IUserServiceImpl implements IUserService {
	
	@Autowired
	private UuuuuuuuuuuuuuuserMapper userDao;
	
	@Autowired
	private RoleMapper roleDao;

	public Map<String,Object> selectALLUser(Map<String, Object> maps) throws Exception {
		List<Uuuuuuser> uuuuuusers =new ArrayList<Uuuuuuser>();
		List<Role> roles=new ArrayList<Role>();
		int account=userDao.selectCount(maps);
		uuuuuusers =userDao.selectALLUser(maps);
		for(Uuuuuuser uuuuuuser : uuuuuusers) {
		  roles=roleDao.selectRolesByUserId(uuuuuuser.getId());
		  uuuuuuser.setRoles(roles);
		}
		maps.put("users", uuuuuusers);
		maps.put("account",account);
		return maps;
	}

	public void insertUser(Uuuuuuser uuuuuuser)throws Exception{
		userDao.insertUser(uuuuuuser);
	}
	
	public void resetPassword(Uuuuuuser uuuuuuser)throws Exception{
		userDao.resetPassword(uuuuuuser);
	}
	
	//��������ѡ���û�
    public Uuuuuuser selectByPrimaryKey(Long id)throws Exception{
    	List<Role> roles=new ArrayList<Role>();
    	Uuuuuuser uuuuuuser = userDao.selectByPrimaryKey(id);
    	roles=roleDao.selectRolesByUserId(uuuuuuser.getId());
    	uuuuuuser.setRoles(roles);
    	return uuuuuuser;
    }

	public void updateUserTable(Uuuuuuser uuuuuuser) throws Exception {
		userDao.updateUserTable(uuuuuuser);
	}
    
	public void delete(Long id)throws Exception{
		userDao.delete(id);
	}
    
}
