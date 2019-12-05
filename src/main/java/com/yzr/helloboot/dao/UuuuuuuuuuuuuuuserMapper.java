package com.yzr.helloboot.dao;

import java.util.List;
import java.util.Map;

import com.yzr.helloboot.vo.Uuuuuuser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
public interface UuuuuuuuuuuuuuuserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Uuuuuuser record);

    int insertSelective(Uuuuuuser record);

    int updateByPrimaryKeySelective(Uuuuuuser record);

    int updateByPrimaryKey(Uuuuuuser record);
    
    //查询分页
    public List<Uuuuuuser> selectALLUser(Map<String, Object> maps)throws Exception;
    
    //查询总行数
    public int selectCount(Map<String, Object> maps)throws Exception;
    
    //插入用户
    public void insertUser(Uuuuuuser uuuuuuser)throws Exception;
    
    //重置密码
    public void resetPassword(Uuuuuuser uuuuuuser)throws Exception;
    
    //根据主键选出用户
    public Uuuuuuser selectByPrimaryKey(Long id)throws Exception;
    
    //根据用户名选出用户
    public Uuuuuuser selectByUserName(String userName)throws Exception;
    
    //更新用户
    public void updateUserTable(Uuuuuuser uuuuuuser)throws Exception;
    
    public void delete(Long id)throws Exception;
    
}