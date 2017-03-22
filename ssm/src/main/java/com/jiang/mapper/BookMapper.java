package com.jiang.mapper;

import java.util.List;

import com.jiang.entity.Book;

public interface BookMapper {
	
	
    int deleteByPrimaryKey(String bookCode);
    
    int insert(Book record);

    int insertSelective(Book record);
    
    //根据id查询
    Book selectByPrimaryKey(String bookCode);

    int updateByPrimaryKeySelective(Book record);
    
    int updateByPrimaryKey(Book record);
    
    /**查询所有信息*/
    List<Book> selectAll();
    
}