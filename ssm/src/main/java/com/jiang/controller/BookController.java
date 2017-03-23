package com.jiang.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
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
		logger.info(bookCode);
		int rs = this.bookService.deleteBook(bookCode);
		logger.info(rs);
		if(rs!=0){
			return "redirect:/book/findAllBook"; 
		}
		return "redirect:/book/findAllBook"; 
	}

	//根据Book_code查找图书
	@RequestMapping("/selectBookById/{bookCode}")
	public ModelAndView selectBookById(ModelAndView mv,@PathVariable("bookCode") String bookCode){
		Book book = this.bookService.selectBookById(bookCode);
		Gson gson = new Gson();
		System.out.println(gson.toJson(book));
		mv.addObject("list",book);
		logger.info(book);
		mv.setViewName("editBook.jsp");
		return mv;
	}
	//修改图书信息
	@RequestMapping(value="/updateBookById",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView updateBookById(Book book){
		Gson gson = new Gson();
		System.out.println(gson.toJson(book));
		ModelAndView mv = new ModelAndView("redirect:findByPage");
		if(book.getBookCode()!=null){
			this.bookService.updateBookById(book);
		}
		return mv;
	}
	
	//分页功能
	@RequestMapping("/findByPage")
	public ModelAndView findByPage(ModelAndView mv,
				@RequestParam(required=true,defaultValue="1") Integer page,
				@RequestParam(required=true,defaultValue="10") Integer pageSize
				){
		PageHelper.startPage(page,pageSize);
		List<Book> list = bookService.selectAllBook();
		PageInfo<Book> pageInfo = new PageInfo<Book>(list);
		mv.addObject("list",list);
		mv.addObject("pageInfo",pageInfo);
		mv.setViewName("showAllBook.jsp");
		System.out.println(pageInfo.toString());
		return mv;
	}
}
