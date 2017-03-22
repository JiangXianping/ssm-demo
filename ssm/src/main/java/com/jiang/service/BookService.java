package com.jiang.service;

import java.util.List;

import com.jiang.entity.Book;

public interface BookService {
	
	//返回所有信息
	public List<Book> findAllBook();
	
	//删除图书信息
	public int deleteBook(String id);
	
	//更新图书信息
	public int updateBookByid(Book book);
	
	//根据id查询图书信息
	public Book selectBookById(int id);
	
	/**
	 * 查询所有图书信息
	 * @return
	 */
	public List<Book> selectAllBook();
	
}
