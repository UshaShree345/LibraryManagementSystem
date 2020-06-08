package com.capgemini.lmstesting.testrunner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/usha/Desktop/LmsParallelProject/lmstesting/src/main/java/com/capgemini/lmstesting/features/student.feature", glue = {
		"com/capgemini/lmstesting/stepdefinitions" }, dryRun = false, plugin = { "pretty",
				"html:target/cucumber" }, monochrome = true)
public class StudentTestRunner {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions action;

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
}
