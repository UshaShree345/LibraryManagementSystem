package com.capgemini.lmsspringrest.service;

import java.util.List;

import com.capgemini.lmsspringrest.dto.BookDetails;
import com.capgemini.lmsspringrest.dto.BookIssue;
import com.capgemini.lmsspringrest.dto.RequestDetails;
import com.capgemini.lmsspringrest.dto.User;


public interface LibrarianService {

	boolean addBook(BookDetails bookDetail);

	boolean removeBook(int bookId);

	boolean updateBook(BookDetails book);

	boolean bookIssue(int id, int bookId);
	
	List<RequestDetails> showRequests();

	List<BookIssue> showIssuedBooks();
	
	 List<User> showUsers();
}
