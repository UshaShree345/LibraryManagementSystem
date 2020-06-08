package com.capgemini.lmsjdbc.dto;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class BookIssueInfo implements Serializable {
	
	private int bookId;
	private int userId;
	private Date issueDate;
	private Date returnDate;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
	@Override
	public String toString() {
		return String.format("%-10s %-10s %-10s %s", bookId, userId, issueDate, returnDate); 
	}
	
	
}
