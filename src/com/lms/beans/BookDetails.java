package com.lms.beans;

public class BookDetails {
	private String bookId;
	private String bookName; 
	private String author; 
	private String publication;
	private String numbeOfBooksAvailable;

	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getNumbeOfBooksAvailable() {
		return numbeOfBooksAvailable;
	}
	public void setNumbeOfBooksAvailable(String numbeOfBooksAvailable) {
		this.numbeOfBooksAvailable = numbeOfBooksAvailable;
	}
	
	
	
	public BookDetails(){
	}
}
