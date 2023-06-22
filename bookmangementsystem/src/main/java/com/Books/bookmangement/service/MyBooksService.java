package com.Books.bookmangement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Books.bookmangement.beans.MyBooks;
import com.Books.bookmangement.repository.MyBooksDAO;

@Service
public class MyBooksService {
	@Autowired
	private MyBooksDAO dao;
	
	public void  saveMyBooks(MyBooks dto) {
		
		dao.save(dto);
		System.out.println("my books savesd");
	}

	public List<MyBooks> getAll() {
		List<MyBooks> list=dao.findAll();
		return list;
	}

	public void deleteByid(int id) {
		dao.deleteById(id);
		System.out.println("deldete complete");
		
	}
	
}
