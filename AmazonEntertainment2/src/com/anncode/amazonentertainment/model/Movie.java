package com.anncode.amazonentertainment.model;

public class Movie extends Film{
	private int id = 0;
	private int year;
	
	public Movie(String title, int duration, int year) {
		super(title, duration);
		// TODO Auto-generated constructor stub
		this.id++;
		this.setYear(year);
	}
	
	public Movie(String title, String genre, String creator, int duration, int year) {
		super(title, genre, creator, duration);
		// TODO Auto-generated constructor stub
		this.id++;
		this.setYear(year);
	}

	public int getId() {
		return id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return 	 "\n" + 
				 "\n Id: " + getId() +  
				 "\n Title: " + getTitle() + 
				 "\n Genre: " + getGenre() +
				 "\n Year: " + getYear() +
				 "\n Creator: " + getCreator() +
				 "\n Duration: " + getDuration();
	}
	
	
}
