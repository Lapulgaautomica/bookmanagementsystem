package com.Books.bookmangement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Books.bookmangement.beans.BookDTO;
import com.Books.bookmangement.repository.BookDAO;
import com.Books.bookmangement.service.BookService;

@Controller
public class BookController 
{
	@Autowired
	private BookService service;;
	@PostMapping("/savebook")
	public String saveBook(BookDTO dto,Model m) {
		service.saveBook(dto);
		m.addAttribute("msg", "book saved sucessfully");
		return"registerbook";
	}
	
	@GetMapping("getbooks")
	public String getAllBooks(Model m){
		
		List<BookDTO> list=service.getAllBooks();
		m.addAttribute("list", list);
		return  "availbooks";
	}
	
	
}
