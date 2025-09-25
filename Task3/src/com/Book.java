package com;

public class Book {

	private int id;
	private String title;
	private String author;
	private boolean isIssued;
	public Book(int id, String title, String author, boolean isIssued) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.isIssued = isIssued;
	}

	public int getId() { 
		return id; 
	}
	public String getTitle() {
		return title; 
	}
	public String getAuthor() { 
		return author; 
	}
	public boolean isIssued() {
		return isIssued; 
	}

	public void issue() {
		isIssued = true;
	}
	public void returnBook() {
		isIssued = false; 
	}

	@Override
	public String toString() {
		return id + " | " + title + " | " + author + " | " + (isIssued ? "Issued" : "Available");
	}

}
