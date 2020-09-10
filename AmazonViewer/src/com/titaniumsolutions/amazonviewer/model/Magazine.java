package com.titaniumsolutions.amazonviewer.model;

import java.util.Date;

public class Magazine extends Publication {

	private int id;
	
	public Magazine(String title, Date editionDate, String editorial, String[] authors) {
		super(title, editionDate, editorial, authors);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n :: MAGAZINES :: " + 
				"\n Title: " + getTitle() +
				"\n Editorial: " + getEditorial() + 
				"\n Edition Date: " + getEditionDate(); 
	}

	
}
