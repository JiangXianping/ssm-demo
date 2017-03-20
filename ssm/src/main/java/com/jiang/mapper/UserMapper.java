package com.jiang.mapper;

import java.util.List;

import com.jiang.entity.User;

public interface UserMapper {
	
	//根据id删除
    int deleteByPrimaryKey(Integer id);
    
    //新增对象
    int insert(User record);
    
    
    int insertSelective(User record);
    
    //根据id查询
    User selectByPrimaryKey(Integer id);
    
    
    int updateByPrimaryKeySelective(User record);
    
    //更新对象
    int updateByPrimaryKey(User record);
    
    //根据username查询
    User selectByName(String username);
    

    List<User> selectAll();
}