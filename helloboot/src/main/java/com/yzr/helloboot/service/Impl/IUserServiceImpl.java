package com.yzr.helloboot.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.yzr.helloboot.dao.RoleMapper;
import com.yzr.helloboot.dao.UserMapper;
import com.yzr.helloboot.dto.Role;
import com.yzr.helloboot.dto.User;
import com.yzr.helloboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class IUserServiceImpl implements IUserService {
	
	@Autowired
	private UserMapper userDao;
	
	@Autowired
	private RoleMapper roleDao;

	public Map<String,Object> selectALLUser(Map<String, Object> maps) throws Exception {
		List<User> users=new ArrayList<User>();
		List<Role> roles=new ArrayList<Role>();
		int account=userDao.selectCount(maps);
		users=userDao.selectALLUser(maps);
		for(User user:users) {
		  roles=roleDao.selectRolesByUserId(user.getId());
		  user.setRoles(roles);
		}
		maps.put("users", users);
		maps.put("account",account);
		return maps;
	}

	public void insertUser(User user)throws Exception{
		userDao.insertUser(user);
	}
	
	public void resetPassword(User user)throws Exception{
		userDao.resetPassword(user);
	}
	
	//��������ѡ���û�
    public User selectByPrimaryKey(Long id)throws Exception{
    	List<Role> roles=new ArrayList<Role>();
    	User user= userDao.selectByPrimaryKey(id);
    	roles=roleDao.selectRolesByUserId(user.getId());
    	user.setRoles(roles);
    	return user;
    }

	public void updateUserTable(User user) throws Exception {
		userDao.updateUserTable(user);
	}
    
	public void delete(Long id)throws Exception{
		userDao.delete(id);
	}
    
}
