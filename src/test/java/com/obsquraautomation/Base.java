package com.obsquraautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public void initialiseBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\OneDrive\\Documents\\Eclipse_Workspace\\obsquraautomation\\src\\main\\java\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	}
	
	public void browserCloseorQuit()
	{
		//driver.close(); //close the browser
		driver.quit();
	}
	
	public static void main(String args[])
	{
		Base base = new Base();
		base.initialiseBrowser();
		base.browserCloseorQuit();
	}
	

}
