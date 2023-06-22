package com.Books.bookmangement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Books.bookmangement.beans.BookDTO;
import com.Books.bookmangement.beans.MyBooks;
import com.Books.bookmangement.repository.BookDAO;

@Service
public class BookService {

	@Autowired
	private BookDAO dao;
	public void saveBook(BookDTO dto)
	{
		dao.save(dto);
		System.out.println("save sccess");
	}
	
	public List<BookDTO>getAllBooks(){
	
		List<BookDTO> list=dao.findAll();
		return list;
	}
	
	public BookDTO getById(int id)
	{
		BookDTO dto=dao.findById(id).orElse(null);
		
		return dto;
	}
	
	
}
