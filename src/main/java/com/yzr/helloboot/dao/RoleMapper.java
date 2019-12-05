package com.yzr.helloboot.dao;

import java.util.List;
import java.util.Map;

import com.yzr.helloboot.vo.Menu;
import com.yzr.helloboot.vo.MenuTree;
import com.yzr.helloboot.vo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("roleDao")
@Mapper
public interface RoleMapper {
    
    int insertSelective(Role record) ;
   
    int updateByPrimaryKey(Role record);
    
    public void insert(Role role) throws Exception;
    
    public List<Role> selectAllRoles(Map<String, Object> maps)throws Exception;
    
    public int selectCount(Map<String, Object> maps)throws Exception;
    
    public List<Role> selectRolesByUserId(Long userId);
    
    public List<Menu> selectMenusByRoleId(Long userId);
    
    public Role selectByPrimaryKey(Long roleId) throws Exception;
    
    public List<MenuTree> selectMenuTreesByRoleId(Long roleId)throws Exception;
    
    public void updateTable(Role role) throws Exception;
    
    public void deleteByPrimaryKey(Long id)throws Exception;
    
}