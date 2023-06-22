package com.Books.bookmangement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Books.bookmangement.beans.BookDTO;

public interface BookDAO extends JpaRepository<BookDTO, Integer> {

	
}
