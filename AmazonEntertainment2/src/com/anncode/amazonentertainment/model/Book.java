package com.anncode.amazonentertainment.model;

import java.util.Date;

public class Book extends Publication {
	private String author;
	private String isbn;
	private boolean readed;

	public Book(String title, String editorial, Date editionDate, String author, String isbn) {
		super(title, editorial, editionDate);
		// TODO Auto-generated constructor stub
		this.author = author;
		this.isbn = isbn;
		this.readed = false;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isReaded() {
		return readed;
	}

	public void setReaded(boolean readed) {
		this.readed = readed;
	}
	
	

}
