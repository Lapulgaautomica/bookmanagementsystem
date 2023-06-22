package com.Books.bookmangement.Controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Books.bookmangement.beans.BookDTO;
import com.Books.bookmangement.beans.MyBooks;
import com.Books.bookmangement.service.BookService;
import com.Books.bookmangement.service.MyBooksService;

@Controller
public class MyBooksController 
{
	@Autowired
	private MyBooksService service;
	@Autowired
	private BookService bookService;
	@GetMapping("mybooks")
	public String getMyBooks(Model m){
		List<MyBooks> list=service.getAll();
		m.addAttribute("list", list);
		return "mybooks";
	}
	@RequestMapping("/book")
	public String saveMyBooks(@RequestParam(value = "id",required = false) int id ,Model m)
	{	
		System.out.println(id);
		BookDTO dto=bookService.getById(id);
		System.out.println(dto);
		MyBooks mdto=new MyBooks();
		mdto.setId(dto.getId());
		mdto.setBookName(dto.getBookName());
		mdto.setAuthersName(dto.getAuthersName());
		mdto.setBookPrice(dto.getBookPrice());
		service.saveMyBooks(mdto);
		return"redirect:/mybooks";
	}
	@RequestMapping("delete")
	public String delete(@RequestParam(value = "id",required = false) int id,Model m) {
		service.deleteByid( id);
		return"redirect:/mybooks";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
