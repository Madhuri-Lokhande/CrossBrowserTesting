package com.crossBrowserTestingSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossBrowserTesting {
	@Test
	public void chromeBrowserTest() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://courses.in28minutes.com/");

		sleep(5);

		driver.quit();
	}

	@Test
	public void firefoxBrowserTest() {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://courses.in28minutes.com/");

		sleep(5);

		driver.quit();
	}

	private void sleep(int i) {
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
