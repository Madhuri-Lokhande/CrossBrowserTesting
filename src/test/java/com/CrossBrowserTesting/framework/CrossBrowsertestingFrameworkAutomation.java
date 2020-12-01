package com.CrossBrowserTesting.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowsertestingFrameworkAutomation {
	
	WebDriver driver=null;
	
	@Parameters("browser")
	@BeforeTest
	public void Before(@Optional("chrome") String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browser.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else {
			throw new RuntimeException("Does not support browser + " +browser);
		}
	}
	
	 @Test
	  public void LaunchTables() {
			  
		  driver.get("https://courses.in28minutes.com/"); 
	  }
	 
	 @AfterTest
	 public void After() {
		 driver.quit();
	 }
	  
}
