package com.yzr.helloboot.controller;

import com.yzr.helloboot.vo.Factory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Test {
    @Resource    // 自动注入，spring boot会帮我们实例化一个对象
    private JdbcTemplate jdbcTemplate;   // 一个通过JDBC连接数据库的工具类，可以通过这个工具类对数据库进行增删改查

    public void mySqlTest(){
        String sql = "select id,name from cx_factory";
        List<Factory> factoryList = jdbcTemplate.query(sql, new RowMapper<Factory>() {
            @Override
            public Factory mapRow(ResultSet resultSet, int i) throws SQLException {
                Factory factory = new Factory();
                factory.setId((long) resultSet.getInt("id"));
                factory.setName(resultSet.getString("name"));
                return factory;
            }
        });

        System.out.println("查询成功");
        for(Factory s : factoryList){
            System.out.println(s);
        }
    }
}
