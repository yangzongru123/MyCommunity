package com.yzr.helloboot.dao;

import com.yzr.helloboot.vo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository("userDao")
@Mapper
public interface UserMapper {
    @Insert("insert into user (name,account,token,creatTime,modifiedTime) values (#{name},#{account},#{token},#{creatTime},#{modifiedTime})")
    void insert(User user);

    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);
}
