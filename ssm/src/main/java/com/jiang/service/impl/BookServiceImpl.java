package com.jiang.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.jiang.entity.Book;
import com.jiang.mapper.BookMapper;
import com.jiang.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService {
	
	@Resource
	private BookMapper bookMapper;
	
	@Override
	public List<Book> findAllBook() {
		return this.bookMapper.selectAll();
	}
	
	@Override
	public int deleteBook(String id) {
		return this.bookMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateBookById(Book book) {
		return this.bookMapper.updateByPrimaryKeySelective(book);
	}
	/**
	 * 根据bookCode查询
	 * @param id
	 * @return
	 */
	@Override
	public Book selectBookById(String id) {
		// TODO Auto-generated method stub
		return this.bookMapper.selectByPrimaryKey(id);
	}
	
	/**
	 * 查询所有图书信息
	 */
	@Override
	public List<Book> selectAllBook() {
		return bookMapper.selectAll();
		
	}
}
