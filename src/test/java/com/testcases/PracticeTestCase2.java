package com.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class PracticeTestCase2 {

	@Test
	public void continue_With_Empty_Input() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println();
		System.out.println();
	}	

}
