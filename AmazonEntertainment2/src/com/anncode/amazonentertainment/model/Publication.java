package com.anncode.amazonentertainment.model;

import java.util.Date;

public class Publication {
	
	private String title;
	private String editorial;
	private Date editionDate;
	private float price;
	
	
	
	public Publication(String title, String editorial, Date editionDate) {
		super();
		this.title = title;
		this.editorial = editorial;
		this.editionDate = editionDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public Date getEditionDate() {
		return editionDate;
	}
	public void setEditionDate(Date editionDate) {
		this.editionDate = editionDate;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	

}
