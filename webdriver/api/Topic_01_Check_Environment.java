package api;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_01_Check_Environment {
	WebDriver driver;
	

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	@Test
	public void TC_01_ValidateCurrentUrl() {
	}

	@Test
	public void TC_02_ValidateCurrentTitle() {
		
	}

	@Test
	public void TC_03_ValidateCurrentDisplayed() {
	
	}
	
	

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
}
