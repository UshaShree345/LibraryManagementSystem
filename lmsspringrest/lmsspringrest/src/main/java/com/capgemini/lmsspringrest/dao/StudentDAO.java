 package com.capgemini.lmsspringrest.dao;

import java.util.LinkedList;
import java.util.List;

import com.capgemini.lmsspringrest.dto.BooksBorrowed;

public interface StudentDAO {

	boolean request(int bookId, int id);

	boolean returnBook(int bId, int uId);
	
	LinkedList<Integer> bookHistoryDetails(int id);
	
	List<BooksBorrowed> borrowedBook(int id);
	
}
