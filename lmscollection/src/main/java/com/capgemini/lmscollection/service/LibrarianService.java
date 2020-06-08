package com.capgemini.lmscollection.service;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.lmscollection.dto.BooksInfo;
import com.capgemini.lmscollection.dto.LibrarianInfo;
import com.capgemini.lmscollection.dto.BookRequestInfo;
import com.capgemini.lmscollection.dto.StudentInfo;

public interface LibrarianService {
	
	boolean registerLibrarian(LibrarianInfo librarian);
	LibrarianInfo authenticateLibrarian(String email,String password);
	boolean addBook(BooksInfo book);
	boolean removeBook(int id);
	ArrayList<BooksInfo> searchBookByTitle(String bookname);
	ArrayList<BooksInfo> searchBookByAuthor(String author);
	ArrayList<BooksInfo> searchBookByCategory(String category);
	ArrayList<BooksInfo> getBooksInfo();
	List<StudentInfo> showStudents();
	List<BookRequestInfo> showRequests();
	boolean bookIssue(StudentInfo student,BooksInfo book);
	boolean isBookReceived(StudentInfo student,BooksInfo book);
}
