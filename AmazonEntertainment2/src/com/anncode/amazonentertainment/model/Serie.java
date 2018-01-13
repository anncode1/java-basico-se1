package com.anncode.amazonentertainment.model;

public class Serie extends Film {
	private int id = 0;
	private int sessionsNumber;

	public Serie(String title, int duration, int sessionsNumber) {
		super(title, duration);
		// TODO Auto-generated constructor stub
		this.id++;
		this.sessionsNumber = sessionsNumber;
	}

	public Serie(String title, String genre, String creator, int duration, int sessionsNumber) {
		super(title, genre, creator, duration);
		// TODO Auto-generated constructor stub
		this.id++;
		this.sessionsNumber = sessionsNumber;
	}
	
	
	
	public int getId() {
		return id;
	}

	public int getSessionsNumber() {
		return sessionsNumber;
	}

	public void setSessionsNumber(int sessionsNumber) {
		this.sessionsNumber = sessionsNumber;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return 	 "\n" + 
				 "\n Id: " + getId() +  
				 "\n Title: " + getTitle() + 
				 "\n Genre: " + getGenre() +
				 "\n Creator: " + getCreator() + 
				 "\n Sessions: " + getSessionsNumber() + 
				 "\n Duration: " + getDuration();
	}
	
	

}
