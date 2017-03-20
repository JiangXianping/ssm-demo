package com.jiang.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jiang.entity.Book;
import com.jiang.service.BookService;


/**
 * 
 * @author JiangXianping
 *
 */
@Controller
@RequestMapping("/book")
public class BookController {
	Logger logger = Logger.getLogger(BookController.class);
	
	@Resource
	private BookService bookService;
	
	//查找所有图书信息
	@RequestMapping("/findAllBook")
	public String findAllBook(Map<String,Object> map,Model model){
		List<Book> list = bookService.findAllBook();
		model.addAttribute("list", list);
		return "showAllBook.jsp";
	}
	
	//根据Book_code删除图书
	@RequestMapping("/deleteBookByCode/{bookCode}")
	public String deleteByCode(@PathVariable("bookCode") String bookCode){
		System.out.println(bookCode);
		int rs = this.bookService.deleteBook(bookCode);
		System.out.println(rs);
		if(rs!=0){
			return "redirect:/book/findAllBook"; 
		}
		return "redirect:/book/findAllBook"; 
	}
}
