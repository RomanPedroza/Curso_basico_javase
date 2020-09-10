package com.titaniumsolutions.amazonviewer.model;

import java.util.Date;

public class Book extends Publication implements IVisualizable{
	

	private int id;
	private String isbn;
	private boolean read;
	private int timeRead;
	

	public Book(String title, Date editionDate, String editorial, String[] authors) {
		super(title, editionDate, editorial, authors);
		// TODO Auto-generated constructor stub
		setAuthors(authors);
	}


	public int getId() {
		return id;
	}

	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	


	public int getTimeRead() {
		return timeRead;
	}


	public void setTimeRead(int timeRead) {
		this.timeRead = timeRead;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}


	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if (dateF.getSeconds()> dateI.getSeconds()) {
			setTimeRead(dateF.getSeconds() - dateI.getSeconds());
		}else {
			setTimeRead(0);
		}
	}
	
	

}
