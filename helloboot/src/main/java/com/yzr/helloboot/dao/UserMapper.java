package com.yzr.helloboot.dao;

import java.util.List;
import java.util.Map;

import com.yzr.helloboot.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("userDao")
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    //查询分页
    public List<User> selectALLUser(Map<String, Object> maps)throws Exception;
    
    //查询总行数
    public int selectCount(Map<String, Object> maps)throws Exception;
    
    //插入用户
    public void insertUser(User user)throws Exception;
    
    //重置密码
    public void resetPassword(User user)throws Exception;
    
    //根据主键选出用户
    public User selectByPrimaryKey(Long id)throws Exception;
    
    //根据用户名选出用户
    public User selectByUserName(String userName)throws Exception;
    
    //更新用户
    public void updateUserTable(User user)throws Exception;
    
    public void delete(Long id)throws Exception;
    
}