package com.capgemini.lmstesting.stepdefinitions;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.capgemini.lmstesting.testrunner.StudentTestRunner;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentSteps extends StudentTestRunner {

	@Before
	public void openBrowser() throws Exception {
		driver = new ChromeDriver();
		driver.get("http://localhost:4200/login");

		wait = new WebDriverWait(driver, 10);
		action = new Actions(driver);
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Given("^Student is on Login page$")
	public void student_is_on_Login_page() throws Throwable {

		// input[ @id='email']
		Thread.sleep(5000);
		String actual = driver.getTitle();
		String excepted = "ParallelProject";
		System.out.println(actual);
		assertTrue("The webpage is not a login page", actual.equals(excepted));
	}

	@When("^Student enters \"([^\"]*)\",\"([^\"]*)\"$")
	public void student_enters(String arg1, String arg2) throws Throwable {

		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.xpath("//button[@class='btn btn-dark btn-lg btn-block']"));
		action.moveToElement(email).sendKeys(arg1).perform();

		email.sendKeys(arg1);
		password.sendKeys(arg2);
		login.click();
	}

	@Then("^Student should be logged in$")
	public void student_should_be_logged_in() throws Throwable {

		String actual = driver.getCurrentUrl();
		String excepted = "http://localhost:4200/login";
		System.out.println(actual);
		assertTrue("Student logged in successfully", actual.equals(excepted));
	}

	@Given("^Student is on request book page$")
	public void student_is_on_request_book_page() throws Throwable {

		Thread.sleep(5000);
		String actual = driver.getCurrentUrl();
		String excepted = "http://localhost:4200/student";
		System.out.println(actual);
		assertTrue("Student is on home page", actual.equals(excepted));
	}

	@When("^BookId  and UserId are given (\\d+), (\\d+)$")
	public void bookid_and_UserId_are_given(int arg1, int arg2) throws Throwable {

		driver.findElement(By.linkText("Request Book")).click();
		driver.findElement(By.xpath("//tr[1]//td[8]//button[1]")).click();

	}

	@Then("^Book Requested Successfully$")
	public void book_Requested_Successfully() throws Throwable {

		Thread.sleep(3000);
		String actual = driver.switchTo().alert().getText();
		Thread.sleep(3000);
		String excepted = "Request Placed Successfully";
		System.out.println(actual);
		driver.switchTo().alert().accept();
		assertTrue("Book Requested successfully", actual.equalsIgnoreCase(excepted));
		driver.close();
	}

	@Given("^Student is on returning book page$")
	public void student_is_on_returning_book_page() throws Throwable {

		Thread.sleep(5000);
		String actual = driver.getCurrentUrl();
		String excepted = "http://localhost:4200/student";
		System.out.println(actual);
		assertTrue("Admin is on home page", actual.equals(excepted));
	}

	@When("^Book  and User are given (\\d+), (\\d+)$")
	public void book_and_User_are_given(int arg1, int arg2) throws Throwable {

		driver.findElement(By.linkText("Borrowed Books")).click();

		Thread.sleep(3000);
		String actual = driver.switchTo().alert().getText();
		Thread.sleep(3000);
		String excepted = "Books Borrowed are below";
		System.out.println(actual);
		driver.switchTo().alert().accept();
		assertTrue("Book Borrowed", actual.equalsIgnoreCase(excepted));

		driver.findElement(By.xpath("//tr[1]//td[6]//button[1]")).click();

	}

	@Then("^Book Returned Successfully$")
	public void book_Returned_Successfully() throws Throwable {

		Thread.sleep(3000);
		String actual = driver.switchTo().alert().getText();
		Thread.sleep(3000);
		String excepted = "Book returned to the Library";
		System.out.println(actual);
		driver.switchTo().alert().accept();
		assertTrue("Book Returned to the library", actual.equalsIgnoreCase(excepted));
		driver.close();

	}

	@Given("^Student is on  viewing books page based on names$")
	public void student_is_on_viewing_books_page_based_on_names() throws Throwable {

		Thread.sleep(5000);
		String actual = driver.getCurrentUrl();
		String excepted = "http://localhost:4200/student";
		System.out.println(actual);
		assertTrue("Student is on home page", actual.equals(excepted));
	}

	@When("^student enters \"([^\"]*)\"$")
	public void student_enters(String arg1) throws Throwable {

		driver.findElement(By.partialLinkText("Search Bo")).click();
		driver.findElement(By.name("search")).sendKeys(String.valueOf(arg1));
	}

	@Then("^show books based on name$")
	public void show_books_based_on_name() throws Throwable {

		String actualBookName = driver.findElement(By.xpath("//body//td[3]")).getText().trim();
		String expectedBookName = "maths";
		assertTrue("Student Searched A Book By book Name", actualBookName.equals(expectedBookName)); // driver.close();

	}

	@Given("^Student is on  viewing books page based on author Name$")
	public void student_is_on_viewing_books_page_based_on_author_Name() throws Throwable {

		Thread.sleep(5000);
		String actual = driver.getCurrentUrl();
		String excepted = "http://localhost:4200/student";
		System.out.println(actual);
		assertTrue("Student is on home page", actual.equals(excepted));
	}

	@When("^student enters author name \"([^\"]*)\"$")
	public void student_enters_author_name(String arg1) throws Throwable {

		driver.findElement(By.partialLinkText("Search Bo")).click();
		driver.findElement(By.name("search")).sendKeys(arg1);
	}

	@Then("^show books based on  author name$")
	public void show_books_based_on_author_name() throws Throwable {

		String actualBookName = driver.findElement(By.xpath("//body//td[3]")).getText().trim();
		String expectedBookName = "Jaya Dev";
		assertTrue("Student Searched A Book By Author Name", actualBookName.equals(expectedBookName));
	}

	@Given("^Student is on  viewing books page based on book category$")
	public void student_is_on_viewing_books_page_based_on_book_category() throws Throwable {

		Thread.sleep(5000);
		String actual = driver.getCurrentUrl();
		String excepted = "http://localhost:4200/student";
		System.out.println(actual);
		assertTrue("Student is on home page", actual.equals(excepted));
	}

	@When("^student enters book category \"([^\"]*)\"$")
	public void student_enters_book_category(String arg1) throws Throwable {

		driver.findElement(By.partialLinkText("Search Bo")).click();
		driver.findElement(By.name("search")).sendKeys(String.valueOf(arg1));
	}

	@Then("^show books based on  book category$")
	public void show_books_based_on_book_category() throws Throwable {

		String actualBookName = driver.findElement(By.xpath("//body//td[3]")).getText().trim();
		String expectedBookName = "social";
		assertTrue("Student Searched A Book By category", actualBookName.equals(expectedBookName)); // driver.close();

	}

}
