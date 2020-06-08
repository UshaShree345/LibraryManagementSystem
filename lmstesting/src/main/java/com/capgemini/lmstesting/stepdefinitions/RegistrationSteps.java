package com.capgemini.lmstesting.stepdefinitions;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.capgemini.lmstesting.testrunner.RegisterTestRunner;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationSteps extends RegisterTestRunner{

	@Before
	public void openBrowser() throws Exception {
		driver = new ChromeDriver();
		driver.get("http://localhost:4200/register");

		wait = new WebDriverWait(driver, 10);
		action = new Actions(driver); //
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	  @Given("^User is on registration page$") public void
	  user_is_on_registration_page() throws Throwable {
	  
		  Thread.sleep(5000);
			String actual = driver.getCurrentUrl();
			String excepted = "http://localhost:4200/register";
			System.out.println(actual);
			assertTrue("Admin is on home page", actual.equals(excepted));
	  }
	  
	  @When("^User enters \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",(\\d+),\"([^\"]*)\"$"
	  ) public void user_enters(String arg2, String arg3, String arg4, String arg5,
	  long arg6, String arg7) throws Throwable {
	  
		  driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.id("firstName")).sendKeys(arg2);
			driver.findElement(By.id("lastName")).sendKeys(arg3);
			driver.findElement(By.id("email")).sendKeys(arg4);
			driver.findElement(By.id("password")).sendKeys(arg5);
			driver.findElement(By.id("mobileNo")).sendKeys(String.valueOf(arg6));
			WebElement web = driver.findElement(By.name("role"));
			Select select = new Select(web);
			select.selectByIndex(0);
			//driver.findElement(By.id("role")).sendKeys(arg7);
			driver.findElement(By.xpath("//button[@class='btn btn-dark btn-lg btn-block']")).click();
			
	  }
	  
	  @Then("^User should be \"([^\"]*)\"$") public void user_should_be(String
	  arg1) throws Throwable {
	  
		  Thread.sleep(7000);
			String actual = driver.switchTo().alert().getText();
			Thread.sleep(7000);
			String excepted = "Registered Successfully";
			System.out.println(actual);
			driver.switchTo().alert().accept();
			assertTrue("Registered successfully", actual.equalsIgnoreCase(excepted));
			// driver.close();
	  }
	 
}

