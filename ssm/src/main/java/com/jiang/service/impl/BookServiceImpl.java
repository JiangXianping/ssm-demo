package com.jiang.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jiang.entity.Book;
import com.jiang.mapper.BookMapper;
import com.jiang.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService {
	
	@Resource
	private BookMapper bookMapper;
	
	@Override
	public List<Book> findAllBook() {
		return this.bookMapper.selectAllBook();
	}
	
	@Override
	public int deleteBook(String id) {
		return this.bookMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateBookByid(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Book selectBookById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
