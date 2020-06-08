package com.capgemini.lmscollection.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.capgemini.lmscollection.db.LibraryDB;
import com.capgemini.lmscollection.dto.BooksInfo;
import com.capgemini.lmscollection.dto.LibrarianInfo;
import com.capgemini.lmscollection.dto.BookRequestInfo;
import com.capgemini.lmscollection.dto.StudentInfo;
import com.capgemini.lmscollection.exception.LMSException;
import com.capgemini.lmscollection.factory.Factory;
import com.capgemini.lmscollection.service.LibrarianService;
import com.capgemini.lmscollection.service.StudentService;
import com.capgemini.lmscollection.validation.Validation;

public class SubLibraryMain {

	public static void LibraryOperations() {

		LibraryDB.defaultDB();

		boolean flag = false;
		int checkId = 0;
		String checkName = null;
		long checkMobile = 0;
		String checkEmail = null;
		String checkPassword = null;
		int bookId = 0;
		String bookAuthor = null;
		String bookName = null;
		String bookCategory = null;
		String bookPublisherName = null;

		Validation validation = new Validation();

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		do {
			try {
				System.out.println("<----------------------<<< WELCOME TO LIBRARY >>>--------------------->");
				System.out.println("[1] LIBRARIAN PAGE");
				System.out.println("[2] STUDENT PAGE");
				System.out.println("<--------------------------------------------------------------------->");
				int i = scanner.nextInt();
				switch (i) {
				case 1:
					LibrarianService service = Factory.getLibrarianService();
					do {
						try {
							System.out
									.println("<--------------------------------------------------------------------->");
							System.out.println("[1] LIBRARIAN REGISTER");
							System.out.println("[2] LIBRARIAN LOGIN");
							System.out.println("[3] EXIT");
							System.out
									.println("<--------------------------------------------------------------------->");
							int choice = scanner.nextInt();
							switch (choice) {
							case 1:
								do {
									try {
										System.out.println("Enter ID to Register as Librarian : ");
										checkId = scanner.nextInt();
										validation.validatedId(checkId);
										flag = true;
									} catch (InputMismatchException e) {
										System.err.println("ID should consist of only digits");
										flag = false;
										scanner.next();
									} catch (LMSException e) {
										flag = false;
										System.err.println(e.getMessage());
									}
								} while (!flag);

								do {
									try {
										System.out.println("Enter Name to Register : ");
										checkName = scanner.next();
										validation.validatedName(checkName);
										flag = true;
									} catch (InputMismatchException e) {
										flag = false;
										System.err.println("Name should consists of only Alphabates");
									} catch (LMSException e) {
										flag = false;
										System.err.println(e.getMessage());
									}
								} while (!flag);

								do {
									try {
										System.out.println("Enter MobileNumber to Register : ");
										checkMobile = scanner.nextLong();
										validation.validatedMobile(checkMobile);
										flag = true;
									} catch (InputMismatchException e) {
										System.err.println("Mobile Number  should consists of only numbers");
										flag = false;
										scanner.next();
									} catch (LMSException e) {
										flag = false;
										System.err.println(e.getMessage());
									}
								} while (!flag);

								do {
									try {
										System.out.println("Enter Email to Register : ");
										checkEmail = scanner.next();
										validation.validatedEmail(checkEmail);
										flag = true;
									} catch (InputMismatchException e) {
										flag = false;
										System.err.println(
												"Enter proper email such that it should consist of numbers and alphabets");
									} catch (LMSException e) {
										flag = false;
										System.err.println(e.getMessage());
									}
								} while (!flag);

								do {
									try {
										System.out.println("Enter Password :");
										checkPassword = scanner.next();
										validation.validatedPassword(checkPassword);
										flag = true;
									} catch (InputMismatchException e) {
										flag = false;
										System.err.println("Password doesnt accept spaces ");
									} catch (LMSException e) {
										flag = false;
										System.err.println(e.getMessage());
									}
								} while (!flag);

								LibrarianInfo bean = new LibrarianInfo();
								bean.setId(checkId);
								bean.setName(checkName);
								bean.setMobileNo(checkMobile);
								bean.setEmail(checkEmail);
								bean.setPassword(checkPassword);

								boolean check = service.registerLibrarian(bean);
								if (check) {
									System.out.println("You have registered Successfully");
								} else {
									System.out.println("Already registered");
								}
								break;

							case 2:
								System.out.println("Enter registered email to login : ");
								String email = scanner.next();
								System.out.println("Enter registered Password to login : ");
								String password = scanner.next();
								try {
									@SuppressWarnings("unused")
									LibrarianInfo authBean = service.authenticateLibrarian(email, password);
									System.out.println("You have logged in successfully");
									System.out.println("Now you can perform the following operations:-");

									do {
										try {
											System.out.println(
													"<--------------------------------------------------------------------->");
											System.out.println("[1]  ADD BOOK");
											System.out.println("[2]  SEARCH BOOK BY AUTHOR NAME");
											System.out.println("[3]  SEARCH BOOK BY BOOK TITLE");
											System.out.println("[4]  SEARCH BOOK BY BOOK CATEGORY");
											System.out.println("[5]  REMOVE BOOK");
											System.out.println("[6]  VIEW ALL BOOKS");
											System.out.println("[7]  ISSUE BOOK");
											System.out.println("[8]  VIEW ALL STUDENTS");
											System.out.println("[9] VIEW ALL REQUESTS");
											System.out.println("[10] VIEW RETURNED BOOKS");
											System.out.println("[11] LOGOUT");
											System.out.println(
													"<--------------------------------------------------------------------->");
											int choice1 = scanner.nextInt();
											switch (choice1) {
											case 1:

												do {
													System.out.println("Enter BookID to add : ");
													bookId = scanner.nextInt();
													try {
														validation.validatedId(bookId);
														flag = true;
													} catch (InputMismatchException e) {
														flag = false;
														System.err.println("Id should contains only digits");
													} catch (LMSException e) {
														flag = false;
														System.err.println(e.getMessage());
													}
												} while (!flag);

												do {
													System.out.println("Enter BookName : ");
													bookName = scanner.next();
													try {
														validation.validatedName(bookName);
														flag = true;
													} catch (InputMismatchException e) {
														flag = false;
														System.err.println("BookName should contains only Alphabets");
													} catch (LMSException e) {
														flag = false;
														System.err.println(e.getMessage());
													}
												} while (!flag);

												do {
													System.out.println("Enter AuthorName : ");
													bookAuthor = scanner.next();
													try {
														validation.validatedName(bookAuthor);
														flag = true;
													} catch (InputMismatchException e) {
														flag = false;
														System.err
																.println("AuthorName should contains only Alphabates");
													} catch (LMSException e) {
														flag = false;
														System.err.println(e.getMessage());
													}
												} while (!flag);

												do {
													System.out.println("Enter Category : ");
													bookCategory = scanner.next();
													try {
														validation.validatedName(bookCategory);
														flag = true;
													} catch (InputMismatchException e) {
														flag = false;
														System.err.println(
																"BookCategory should contains only Alphabates");
													} catch (LMSException e) {
														flag = false;
														System.err.println(e.getMessage());
													}
												} while (!flag);

												do {
													System.out.println("Enter PublisherName : ");
													bookPublisherName = scanner.next();
													try {
														validation.validatedName(bookPublisherName);
														flag = true;
													} catch (InputMismatchException e) {
														flag = false;
														System.err.println(
																"BookPublisherName should contains only Alphabates");
													} catch (LMSException e) {
														flag = false;
														System.err.println(e.getMessage());
													}
												} while (!flag);

												BooksInfo bean1 = new BooksInfo();
												bean1.setBookId(bookId);
												bean1.setBookName(bookName);
												bean1.setBookAuthor(bookAuthor);
												bean1.setBookPublisherName(bookPublisherName);
												bean1.setBookCategory(bookCategory);
												boolean check2 = service.addBook(bean1);
												if (check2) {
													System.out.println("Book added of id = " + bookId);
												} else {
													System.out.println("Book already exist of id = " + bookId);
												}
												break;

												
											case 2:
												System.out.println("Search book by AuthorName : ");
												String author = scanner.next();

												BooksInfo bean3 = new BooksInfo();
												bean3.setBookAuthor(author);
												List<BooksInfo> bookauthor = service.searchBookByAuthor(author);
												System.out.println(
														"<--------------------------------------------------------------------->");
												System.out.println(String.format("%-10s %-10s %-13s %-15s %s", "BookId",
														"BookName", "BookAuthor", "BookCategory", "BookPublisherName"));
												for (BooksInfo bookBean : bookauthor) {
													if (bookBean != null) {
														System.out.println(bookBean.toString());
													} else {
														System.out
																.println("No books are available with this authorname");
													}
												}
												break;

											case 3:
												System.out.println("Search book by Title : ");
												String bookTitle = scanner.next();

												BooksInfo bean4 = new BooksInfo();
												bean4.setBookName(bookTitle);
												List<BooksInfo> booktitle = service.searchBookByTitle(bookTitle);
												System.out.println(
														"<<--------------------------------------------------------------------->>");
												System.out.println(String.format("%-10s %-10s %-13s %-15s %s", "BookId",
														"BookName", "BookAuthor", "BookCategory", "BookPublisherName"));
												for (BooksInfo bookBean : booktitle) {
													if (bookBean != null) {
														System.out.println(bookBean.toString());
													} else {
														System.out.println("No books are available with this title");
													}
												}
												break;

											case 4:
												System.out.println("Search book by Book Category : ");
												String category = scanner.next();

												BooksInfo bean5 = new BooksInfo();
												bean5.setBookCategory(category);
												List<BooksInfo> bookIds = service.searchBookByCategory(category);
												System.out.println(
														"<--------------------------------------------------------------------->");
												System.out.println(String.format("%-10s %-10s %-13s %-15s %s", "BookId",
														"BookName", "BookAuthor", "BookCategory", "BookPublisherName"));
												for (BooksInfo bookBean : bookIds) {
													if (bookBean != null) {
														System.out.println(bookBean.toString());
													} else {
														System.out.println("No books are available with this Category");
													}
												}
												break;

											case 5:
												System.out.println("Enter the BookId to delete : ");
												int bookId3 = scanner.nextInt();
												if (bookId3 == 0) {
													System.out.println("Please Enter the Valid BookId");
												} else {
													BooksInfo bean6 = new BooksInfo();
													bean6.setBookId(bookId3);
													boolean remove = service.removeBook(bookId3);
													if (remove) {
														System.out.println("The Book is removed of Id = " + bookId3);
													} else {
														System.out
																.println("The Book is not removed of Id = " + bookId3);
													}
												}
												break;

											case 6:
												ArrayList<BooksInfo> info = service.getBooksInfo();
												System.out.println(
														"<--------------------------------------------------------------------->");
												System.out.println(String.format("%-10s %-10s %-13s %-15s %s", "BookId",
														"BookName", "BookAuthor", "BookCategory", "BookPublisherName"));
												for (BooksInfo bookBean : info) {
													if (bookBean != null) {
														System.out.println(bookBean.toString());
													} else {
														System.out.println("No books are available in the library");
													}
												}
												break;

											case 7:
												StudentInfo StudentBean2 = new StudentInfo();
												BooksInfo bookBean2 = new BooksInfo();
												System.out.println("Enter Book Id");
												int bookId4 = scanner.nextInt();
												System.out.println("Enter Student Id");
												int uId = scanner.nextInt();
												bookBean2.setBookId(bookId4);
												StudentBean2.setId(uId);
												try {
													boolean isIssued = service.bookIssue(StudentBean2, bookBean2);
													if (isIssued) {
														System.out.println("Book Issued of Id = " + bookId4);
													} else {
														System.out.println("Book cannot be issued of Id = " + bookId4);
													}
												} catch (Exception e) {
													System.out.println("Invalid data! Request book cannot be issued");
												}
												break;

											case 8:
												try {
													System.out.println("Students present in Library are : ");
													System.out.println(
															"<--------------------------------------------------------------------->");
													List<StudentInfo> StudentInfos = service.showStudents();
													System.out.println(String.format("%-13s %-13s %s", "Student-Id",
															"Student-Name", "Student-Email"));
													for (StudentInfo infos : StudentInfos) {
														System.out.println(String.format("%-13s %-13s %s",
																infos.getId(), infos.getName(), infos.getEmail()));
													}
												} catch (Exception e) {
													System.out.println(
															"None of the students are registered in the library");
												}
												break;

											case 9:
												try {
													System.out.println("Requests for Books are : ");
													System.out.println(
															"<--------------------------------------------------------------------->");
													List<BookRequestInfo> BookRequestInfos = service.showRequests();
													System.out.println(String.format("%-10s %-10s %-10s %-10s %-10s %s",
															"Book-Id", "Book-Name", "Student-Id", "Student-Name",
															"Book-Issuedate", "Book-Returndate"));
													for (BookRequestInfo info1 : BookRequestInfos) {
														System.out.println(String.format(
																"%-10s %-10s %-10s %-10s %-10s %s",
																info1.getBookInfo().getBookId(),
																info1.getBookInfo().getBookName(),
																info1.getStudentInfo().getId(),
																info1.getStudentInfo().getName(), info1.getIssuedDate(),
																info1.getReturnedDate()));
													}
												} catch (Exception e) {
													System.out.println("None of the book is requested");
												}
												break;

											case 10:
												System.out.println("Receive Returned Books are : ");
												System.out.println(
														"<--------------------------------------------------------------------->");
												System.out.println("Enter Student Id");
												int Student_Id = scanner.nextInt();
												System.out.println("Enter Book Id");
												int bookId5 = scanner.nextInt();

												StudentInfo Student = new StudentInfo();
												BooksInfo book = new BooksInfo();
												Student.setId(Student_Id);
												book.setBookId(bookId5);
												boolean isReceive = service.isBookReceived(Student, book);
												if (isReceive) {
													System.out.println("Received Returned book of Id = " + bookId5);
												} else {
													System.out.println("Invalid Data! Librarian unable to receive");
												}
												break;

											case 11:
												LibraryOperations();

											default:
												System.out.println("Invalid Choice");
												break;
											}
										} catch (InputMismatchException e) {
											System.err.println("Invalid entry please provide only positive integer");
											scanner.nextLine();
										}
									} while (true);
								} catch (Exception e) {
									System.out.println("Invalid Credentials");
								}
								break;

							case 3:
								LibraryOperations();
								break;

							default:
								System.out.println("Invalid Choice");
								break;
							}
						} catch (InputMismatchException e) {
							System.err.println("Invalid entry please provide only positive integer");
							scanner.nextLine();
						}
					} while (true);

				case 2:
					StudentService service1 = Factory.getStudentService();
					do {
						try {
							System.out
									.println("<--------------------------------------------------------------------->");
							System.out.println("[1] STUDENT REGISTER");
							System.out.println("[2] STUDENT LOGIN");
							System.out.println("[3] EXIT");
							System.out
									.println("<--------------------------------------------------------------------->");
							int choice = scanner.nextInt();
							switch (choice) {
							case 1:
								do {
									try {
										System.out.println("Enter ID to Register as Student : ");
										checkId = scanner.nextInt();
										validation.validatedId(checkId);
										flag = true;
									} catch (InputMismatchException e) {
										System.err.println("ID should consist of only digits");
										flag = false;
										scanner.next();
									} catch (LMSException e) {
										flag = false;
										System.err.println(e.getMessage());
									}
								} while (!flag);

								do {
									try {
										System.out.println("Enter Name to Register : ");
										checkName = scanner.next();
										validation.validatedName(checkName);
										flag = true;
									} catch (InputMismatchException e) {
										flag = false;
										System.err.println("Name should consists of only Alphabates");
									} catch (LMSException e) {
										flag = false;
										System.err.println(e.getMessage());
									}
								} while (!flag);

								do {
									try {
										System.out.println("Enter MobileNumber to Register : ");
										checkMobile = scanner.nextLong();
										validation.validatedMobile(checkMobile);
										flag = true;
									} catch (InputMismatchException e) {
										System.err.println("Mobile Number  should consists of only numbers");
										flag = false;
										scanner.next();
									} catch (LMSException e) {
										flag = false;
										System.err.println(e.getMessage());
									}
								} while (!flag);

								do {
									try {
										System.out.println("Enter Email to Register : ");
										checkEmail = scanner.next();
										validation.validatedEmail(checkEmail);
										flag = true;
									} catch (InputMismatchException e) {
										flag = false;
										System.err.println(
												"Enter proper email such that it should consist of numbers and alphabets");
									} catch (LMSException e) {
										flag = false;
										System.err.println(e.getMessage());
									}
								} while (!flag);

								do {
									try {
										System.out.println("Enter Password :");
										checkPassword = scanner.next();
										validation.validatedPassword(checkPassword);
										flag = true;
									} catch (InputMismatchException e) {
										flag = false;
										System.err.println("Password doesnt accept spaces ");
									} catch (LMSException e) {
										flag = false;
										System.err.println(e.getMessage());
									}
								} while (!flag);

								StudentInfo bean1 = new StudentInfo();
								bean1.setId(checkId);
								bean1.setName(checkName);
								bean1.setMobileNo(checkMobile);
								bean1.setEmail(checkEmail);
								bean1.setPassword(checkPassword);

								boolean check = service1.registerStudent(bean1);
								if (check) {
									System.out.println("Registered Successfully");
								} else {
									System.out.println("Already registered");
								}
								break;

							case 2:
								System.out.println("Enter registered email to login : ");
								String email = scanner.next();
								System.out.println("Enter registered Password to login : ");
								String password = scanner.next();
								try {
									@SuppressWarnings("unused")
									StudentInfo StudentBean = service1.authenticateStudent(email, password);
									System.out.println("Logged in Successfully");
									do {
										try {
											System.out.println(
													"<--------------------------------------------------------------------->");
											System.out.println("[1]  SEARCH BOOK BY AUTHOR NAME");
											System.out.println("[2]  SEARCH BOOK BY BOOK TITLE");
											System.out.println("[3]  SEARCH BOOK BY BOOK CATEGORY");
											System.out.println("[4]  VIEW ALL BOOKS");
											System.out.println("[5]  REQUEST BOOK");
											System.out.println("[6]  RETURN BOOK");
											System.out.println("[7]  LOGOUT");
											System.out.println(
													"<--------------------------------------------------------------------->");
											int choice2 = scanner.nextInt();
											switch (choice2) {
											case 1:
												System.out.println("Search book by AuthorName : ");
												String author = scanner.next();

												BooksInfo bean2 = new BooksInfo();
												bean2.setBookAuthor(author);
												List<BooksInfo> bookauthor = service1.searchBookByAuthor(author);
												System.out.println(
														"<----------------------------------------------------------------->");
												System.out.println(String.format("%-10s %-10s %-13s %-15s %s", "BookId",
														"BookName", "BookAuthor", "BookCategory", "BookPublisherName"));
												for (BooksInfo bookBean : bookauthor) {
													if (bookBean != null) {
														System.out.println(bookBean.toString());
													} else {
														System.out
																.println("No books are available with this authorname");
													}
												}
												break;

											case 2:
												System.out.println("Search book by BookTitle : ");
												String book_Name = scanner.next();

												BooksInfo bean3 = new BooksInfo();
												bean3.setBookName(book_Name);
												List<BooksInfo> booktitle = service1.searchBookByTitle(book_Name);
												System.out.println(
														"<--------------------------------------------------------------------->");
												System.out.println(String.format("%-10s %-10s %-13s %-15s %s", "BookId",
														"BookName", "BookAuthor", "BookCategory", "BookPublisherName"));
												for (BooksInfo bookBean : booktitle) {
													if (bookBean != null) {
														System.out.println(bookBean.toString());
													} else {
														System.out.println("No books are available with this title");
													}
												}
												break;

											case 3:
												System.out.println("Search book by BookCategory : ");
												String book_Category = scanner.next();

												BooksInfo bean4 = new BooksInfo();
												bean4.setBookCategory(book_Category);
												List<BooksInfo> bookIds = service1.searchBookByCategory(book_Category);
												System.out.println(
														"<--------------------------------------------------------------------->");
												System.out.println(String.format("%-10s %-10s %-13s %-15s %s", "BookId",
														"BookName", "BookAuthor", "BookCategory", "BookPublisherName"));
												for (BooksInfo bookBean : bookIds) {
													if (bookBean != null) {
														System.out.println(bookBean.toString());
													} else {
														System.out.println("No books are available with this Category");
													}
												}
												break;

											case 4:
												ArrayList<BooksInfo> info = service1.getBooksInfo();
												System.out.println(
														"<--------------------------------------------------------------------->");
												System.out.println(String.format("%-10s %-10s %-13s %-15s %s", "BookId",
														"BookName", "BookAuthor", "BookCategory", "BookPublisherName"));
												for (BooksInfo bookBean : info) {
													if (bookBean != null) {
														System.out.println(bookBean.toString());
													} else {
														System.out.println("No books are available in the library");
													}
												}
												break;

											case 5:
												System.out.println("Enter book Id : ");
												int bookId2 = scanner.nextInt();

												BooksInfo bookBean = new BooksInfo();
												bookBean.setBookId(bookId2);
												System.out.println("Enter Student Id : ");
												int StudentId = scanner.nextInt();

												StudentInfo Student = new StudentInfo();
												Student.setId(StudentId);
												try {
													BookRequestInfo request = service1.bookRequest(Student, bookBean);
													System.out.println("Request placed to librarian");
													System.out.println(
															"<--------------------------------------------------------------------->");
													System.out.println(String.format("%-10s %-10s %-10s %s",
															"Student-Id", "Student-Name", "Book-Id", "Book-Name"));
													System.out.println(String.format("%-10s %-10s %-10s %s",
															request.getStudentInfo().getId(),
															request.getStudentInfo().getName(),
															request.getBookInfo().getBookId(),
															request.getBookInfo().getBookName()));
												} catch (Exception e) {
													System.out.println("Invalid Request of book");
												}
												break;

											case 6:
												System.out.println("Returning a book:");
												System.out.println(
														"<--------------------------------------------------------------------->");
												System.out.println("Enter Student Id : ");
												int Student2 = scanner.nextInt();
												System.out.println("Enter Book Id : ");
												int book = scanner.nextInt();

												StudentInfo StudentBean7 = new StudentInfo();
												StudentBean7.setId(Student2);
												BooksInfo bookBean7 = new BooksInfo();
												bookBean7.setBookId(book);
												try {
													BookRequestInfo bookRequestInfo = service1.bookReturn(StudentBean7,
															bookBean7);
													System.out.println("Book is Returning to Librarian");
													System.out.println(
															"<------------------------------------------------------------------>");
													System.out.println(String.format("%-10s %-10s %s", "Student-Id",
															"Book-Id", "Is Book Returned"));
													System.out.println(String.format("%-10s %-10s %-10s %s",
															bookRequestInfo.getStudentInfo().getId(),
															bookRequestInfo.getBookInfo().getBookId(),
															bookRequestInfo.isReturned()));
												} catch (Exception e) {
													System.out.println("Invalid Returning of a book");
												}
												break;

											case 7:
												LibraryOperations();

											default:
												break;
											}
										} catch (InputMismatchException e) {
											System.err.println("Invalid entry please provide only positive integer");
											scanner.nextLine();
										}
									} while (true);
								} catch (Exception e) {
									System.err.println("Invalid Credentials");
								}
								break;
							case 3:
								LibraryOperations();
								break;

							default:
								System.out.println("Invalid Choice");
								System.err.println("Choice must be 1 or 2");
								break;
							}
						} catch (InputMismatchException e) { // if we give string in 1 n 2 n 3
							System.err.println("Invalid entry please provide only positive integer");
							scanner.nextLine();
						}
					} while (true);
				}
			} catch (InputMismatchException e) { //// if we give string in 1 n 2
				System.err.println("Invalid entry please provide only positive integer");
				scanner.nextLine();
			}
		} while (true);
	}
}
