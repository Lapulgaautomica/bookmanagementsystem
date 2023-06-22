package com.Books.bookmangement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Books.bookmangement.beans.MyBooks;
@Repository
public interface MyBooksDAO  extends JpaRepository<MyBooks, Integer>{

}
