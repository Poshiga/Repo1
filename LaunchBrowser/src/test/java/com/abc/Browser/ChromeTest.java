package com.abc.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTest
{
        
	@Test
	public void launch()
	{
		//Launching the Browser
		WebDriver driver = new ChromeDriver();
	    driver.quit();
	}
}
