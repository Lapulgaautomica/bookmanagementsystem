package com.Books.bookmangement.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookDTO implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public BookDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthersName() {
		return authersName;
	}
	public void setAuthersName(String authersName) {
		this.authersName = authersName;
	}
	public float getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}
	private String bookName;
	private String authersName;
	@Override
	public String toString() {
		return "BookDTO [id=" + id + ", bookName=" + bookName + ", authersName=" + authersName + ", bookPrice="
				+ bookPrice + "]";
	}
	private float bookPrice;
}
