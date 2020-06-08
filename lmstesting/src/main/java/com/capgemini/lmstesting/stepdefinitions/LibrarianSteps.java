package com.capgemini.lmstesting.stepdefinitions;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.capgemini.lmstesting.testrunner.LibrarianTestRunner;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LibrarianSteps extends LibrarianTestRunner {

	@Before
	public void openBrowser() throws Exception {
		driver = new ChromeDriver();
		driver.get("http://localhost:4200/login");

		wait = new WebDriverWait(driver, 10);
		action = new Actions(driver);
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("^Librarian is on Login page$")
	public void librarian_is_on_Login_page() throws Throwable {

		Thread.sleep(5000);
		String actual = driver.getTitle();
		String excepted = "ParallelProject";
		System.out.println(actual);
		assertTrue("The webpage is not a login page", actual.equals(excepted));

	}

	@When("^Librarian enters \"([^\"]*)\",\"([^\"]*)\"$")
	public void librarian_enters(String arg1, String arg2) throws Throwable {

		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.xpath("//button[@class='btn btn-dark btn-lg btn-block']"));
		action.moveToElement(email).sendKeys(arg1).perform();

		email.sendKeys(arg1);
		password.sendKeys(arg2);
		login.click();
	}

	@Then("^Librarian should be logged in$")
	public void librarian_should_be_logged_in() throws Throwable {

		String actual = driver.getCurrentUrl();
		String excepted = "http://localhost:4200/login";
		System.out.println(actual);
		assertTrue("Librarian logged in successfully", actual.equals(excepted));
		// driver.close();
	}

	@Given("^Librarian is on adding book page$")
	public void librarian_is_on_adding_book_page() throws Throwable {

		Thread.sleep(10000);
		String actual = driver.getCurrentUrl();
		String excepted = "http://localhost:4200/admin";
		System.out.println(actual);
		assertTrue("Librarian is on home page", actual.equals(excepted));
	}

	@When("^Librarian enters \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",(\\d+),\"([^\"]*)\"$")
	public void librarian_enters(String arg1, String arg2, String arg3, int arg4, String arg5) throws Throwable {

		driver.findElement(By.linkText("Add Book")).click();
		driver.findElement(By.id("bookName")).sendKeys(arg1);
		driver.findElement(By.id("authorName")).sendKeys(arg2);
		driver.findElement(By.id("bookCategory")).sendKeys(arg3);
		driver.findElement(By.id("copies")).sendKeys(String.valueOf(arg4));
		driver.findElement(By.id("publisherName")).sendKeys(arg5);
		driver.findElement(By.xpath("//button[@class='btb btn-dark btn-lg btn-block']")).click();
	}

	@Then("^Book \"([^\"]*)\"$") public void book(String arg1) throws Throwable {
	  
	  Alert alert = driver.switchTo().alert(); alert.accept(); String actual =
	  driver.getCurrentUrl(); String excepted = "http://localhost:4200/addBook";
	  System.out.println(actual); assertTrue("Book Added successfully",
	  actual.equals(excepted)); // driver.close();
	  }

	@Given("^Librarian is on removing book page$")
	public void librarian_is_on_removing_book_page() throws Throwable {
		Thread.sleep(5000);
		String actual = driver.getCurrentUrl();
		String excepted = "http://localhost:4200/admin";
		System.out.println(actual);
		assertTrue("Librarian is on home page", actual.equals(excepted));
	}

	@When("^Librarian enters (\\d+)$")
	public void librarian_enters(int arg1) throws Throwable {

		driver.findElement(By.linkText("Books Info")).click();
		driver.findElement(By.xpath("//tr[1]//td[8]//button[1]//span[1]//i[1]")).click();
	}

	@Then("^Book deleted successfully$")
	public void book_deleted_successfully() throws Throwable {

		Thread.sleep(3000);
		String actual = driver.switchTo().alert().getText();
		Thread.sleep(3000);
		String excepted = "Book deleted Successfully";
		System.out.println(actual);
		driver.switchTo().alert().accept();
		assertTrue("Book deleted successfully", actual.equalsIgnoreCase(excepted));
		// driver.close();
	}

	@Given("^Librarian is on issuing book page$")
	public void librarian_is_on_issuing_book_page() throws Throwable {

		Thread.sleep(5000);
		String actual = driver.getCurrentUrl();
		String excepted = "http://localhost:4200/admin";
		System.out.println(actual);
		assertTrue("Librarian is on home page", actual.equals(excepted));
	}

	@When("^Librarian enters (\\d+),(\\d+)$")
	public void librarian_enters(int arg1, int arg2) throws Throwable {

		driver.findElement(By.linkText("Show Requests")).click();
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		driver.findElement(By.xpath("//tr[2]//td[7]//button[1]")).click();
	}

	@Then("^Book issued successfully$")
	public void book_issued_successfully() throws Throwable {

		Thread.sleep(3000);
		String actual = driver.switchTo().alert().getText();
		Thread.sleep(3000);
		String excepted = "Book Issued to the user";
		System.out.println(actual);
		driver.switchTo().alert().accept();
		assertTrue("Book Issued successfully", actual.equalsIgnoreCase(excepted)); //
		driver.close();
	}

	@Given("^Librarian is on  viewing books page based on bookname$")
	public void librarian_is_on_viewing_books_page_based_on_bookname() throws Throwable {

		Thread.sleep(5000);
		String actual = driver.getCurrentUrl();
		String excepted = "http://localhost:4200/admin";
		System.out.println(actual);
		assertTrue("Librarian is on home page", actual.equals(excepted));
	}

	@When("^librarian enters \"([^\"]*)\"$")
	public void librarian_enters(String arg1) throws Throwable {

		driver.findElement(By.linkText("Books Info")).click();

		driver.findElement(By.name("search")).sendKeys(arg1);
	}

	@Then("^show books based on bookname$")
	public void show_books_based_on_bookname() throws Throwable {

		String actualBookName = driver.findElement(By.xpath("//body//td[3]")).getText().trim();
		String expectedBookName = "maths";
		assertTrue("Librarian Searched A Book By Name", actualBookName.equals(expectedBookName)); // driver.close();

	}

	@Given("^Librarian is on updating book page$")
	public void librarian_is_on_updating_book_page() throws Throwable {

		Thread.sleep(5000);
		String actual = driver.getCurrentUrl();
		String excepted = "http://localhost:4200/admin";
		System.out.println(actual);
		assertTrue("Librarian is on home page", actual.equals(excepted));

	}

	@When("^Librarian enters (\\d+),\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void librarian_enters(int arg1, String arg2, String arg3, String arg4, String arg5, String arg6)
			throws Throwable {

		driver.findElement(By.linkText("Books Info")).click();
		driver.findElement(By.xpath("//tr[1]//td[8]//button[2]//span[1]//i[1]")).click();

		driver.findElement(By.id("bookName")).clear();
		driver.findElement(By.id("bookName")).sendKeys(arg2);

		driver.findElement(By.id("authorName")).clear();
		driver.findElement(By.id("authorName")).sendKeys(arg3);

		driver.findElement(By.id("bookCategory")).clear();
		driver.findElement(By.id("bookCategory")).sendKeys(arg4);

		driver.findElement(By.id("copies")).clear();
		driver.findElement(By.id("copies")).sendKeys(String.valueOf(arg5));

		driver.findElement(By.id("publisherName")).clear();
		driver.findElement(By.id("publisherName")).sendKeys(arg5);

		driver.findElement(By.xpath("//button[@class='btn btn-dark btn-lg btn-block']")).click();
	}

	@Then("^Book updated successfully$")
	public void book_updated_successfully() throws Throwable {

		Thread.sleep(3000);
		String actual = driver.switchTo().alert().getText();
		Thread.sleep(3000);
		String excepted = "successfully updated";
		System.out.println(actual);
		driver.switchTo().alert().accept();
		assertTrue("Book updated successfully", actual.equalsIgnoreCase(excepted));
		// driver.close();

	}

	@Given("^Librarian is on  viewing books page based on authorname$")
	public void librarian_is_on_viewing_books_page_based_on_authorname() throws Throwable {

		Thread.sleep(5000);
		String actual = driver.getCurrentUrl();
		String excepted = "http://localhost:4200/admin";
		System.out.println(actual);
		assertTrue("Librarian is on home page", actual.equals(excepted));
	}

	@When("^librarian enters authorname \"([^\"]*)\"$")
	public void librarian_enters_authorname(String arg1) throws Throwable {

		driver.findElement(By.linkText("Books Info")).click();
		driver.findElement(By.name("search")).sendKeys(arg1);

	}

	@Then("^show books based on  authorname$")
	public void show_books_based_on_authorname() throws Throwable {

		String actualBookName = driver.findElement(By.xpath("//body//td[3]")).getText().trim();
		String expectedBookName = "Jaya Dev";
		assertTrue("Librarian Searched A Book By Author Name", actualBookName.equals(expectedBookName)); // driver.close();
																											// // //
		driver.close();
	}

	@Given("^Librarian is on  viewing books page based on bookcategory$")
	public void librarian_is_on_viewing_books_page_based_on_bookcategory() throws Throwable {

		Thread.sleep(5000);
		String actual = driver.getCurrentUrl();
		String excepted = "http://localhost:4200/admin";
		System.out.println(actual);
		assertTrue("Librarian is on home page", actual.equals(excepted));
	}

	@When("^librarian enters bookcategory \"([^\"]*)\"$")
	public void librarian_enters_bookcategory(String arg1) throws Throwable {

		driver.findElement(By.linkText("Books Info")).click();
		driver.findElement(By.name("search")).sendKeys(arg1);

	}

	@Then("^show books based on  bookcategory$")
	public void show_books_based_on_bookcategory() throws Throwable {

		String actualBookName = driver.findElement(By.xpath("//body//td[3]")).getText().trim();
		String expectedBookName = "social";
		assertTrue("Librarian Searched A Book By category", actualBookName.equals(expectedBookName)); // driver.close();
																										// // //
		// driver.close();
	}

	@Then("^list of users should be displayed$")
	public void list_of_users_should_be_displayed() throws Throwable {

		driver.findElement(By.partialLinkText("Show Use")).click();
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Logout")).click();

		// driver.close();
	}

}
