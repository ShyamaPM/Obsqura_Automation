package com.obsquraautomation;

import org.openqa.selenium.By;

public class Locators extends Base 
{
	public void locateById()
	{
		driver.findElement(By.id("button-one"));
		driver.findElement(By.className("navbar-nav"));
		driver.findElement(By.linkText("Checkbox Demo"));
	}
	

	public static void main(String[] args) 
	{	
		Locators locators = new Locators();
		locators.initialiseBrowser();
		locators.locateById();
		locators.browserCloseorQuit();

	}

}
