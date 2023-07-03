package com.obsquraautomation;

import org.openqa.selenium.By;

public class Locators extends Base 
{
	public void locateById()
	{
		driver.findElement(By.id("button-one"));
		driver.findElement(By.className("navbar-nav"));
		driver.findElement(By.linkText("Checkbox Demo"));
		driver.findElement(By.partialLinkText("Radio Buttons"));
		driver.findElement(By.cssSelector("button#button-one"));
		driver.findElement(By.cssSelector("ul.navbar-nav"));
		driver.findElement(By.cssSelector("button[id=button-one]"));
		driver.findElement(By.cssSelector("button.navbar-toggler[type=button]"));
		driver.navigate().to("https://selenium.obsqurazone.com/date-picker.php");
		driver.findElement(By.name("daterange"));
		
		}
	
	public void findId()
	{
		driver.findElement(By.id("single-input-field"));
		driver.findElement(By.id("button-one"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.id("inlineRadio1"));
		driver.findElement(By.id("inlineRadio2"));
		driver.findElement(By.id("inlineRadio11"));
	}
	
	public void findClassName()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.className("form-check-input"));
		
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		driver.findElement(By.className("form-check-input"));
		
		driver.navigate().to("https://selenium.obsqurazone.com/file-download.php");
		driver.findElement(By.className("form-control"));
		
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.className("navbar-nav"));
		
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		driver.findElement(By.className("clearfix"));
		
	}
	
	public void locateXPath()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//button[@id='button-one']"));
		driver.findElement(By.xpath("//input[@class='form-control']"));
		
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//input[@id='gridCheck']"));
		driver.findElement(By.xpath("//input[@value='Select All']"));
		
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//button[@id='button-one']"));
		driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
	}
	
	public void locatorsSample()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.linkText("Checkbox Demo"));
		driver.findElement(By.linkText("Radio Buttons Demo"));
		driver.findElement(By.linkText("Select Input"));
		
		driver.findElement(By.partialLinkText("Checkbox"));
		driver.findElement(By.partialLinkText("Radio Buttons"));
		driver.findElement(By.partialLinkText("Select"));
		
		driver.navigate().to("https://selenium.obsqurazone.com/bootstrap-dual-list.php");
		driver.findElement(By.name("duallistbox_demo1[]_helper1"));
		driver.findElement(By.name("duallistbox_demo1[]_helper2"));
		driver.findElement(By.name("duallistbox_demo1[]"));
	}
	
	public void cssSelector()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.cssSelector("input#single-input-field"));
		driver.findElement(By.cssSelector("input#value-b"));
		
		driver.navigate().to("https://selenium.obsqurazone.com/jquery-date-picker.php");
		driver.findElement(By.cssSelector("div.input-group"));
		driver.findElement(By.cssSelector("div.my-2"));
		
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.cssSelector("input[id=inlineRadio1]"));
		driver.findElement(By.cssSelector("button[id=button-one]"));
		
		driver.findElement(By.cssSelector("input.form-check-input[id=inlineRadio1]"));
		driver.findElement(By.cssSelector("input.form-check-input[id=inlineRadio24]"));
	}
	
	public void dynamicXPath()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//div[contains(@id,'-one')]"));
		driver.findElement(By.xpath("//button[text()='Show Message']"));
		driver.findElement(By.xpath("//button[starts-with(text(),'Show Message')]"));
		driver.findElements(By.xpath("//button[starts-with(@id,'button-one')]"));
		driver.findElement(By.xpath("//button[starts-with(@id,'button') and text()='Show Message']"));
		driver.findElement(By.xpath("//button[@id='button-one' or text()='Show Message']"));
		driver.findElement(By.xpath("//a[@class='navbar-brand']//child::img[@alt='logo']"));
		driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
	}
	
	public void containsSample()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//input[contains(@class,'form-check-input')]"));
		driver.findElement(By.xpath("//input[contains(@id,'-box-one')]"));
		driver.findElement(By.xpath("//input[contains(@id,'-box-four')]"));
		driver.findElement(By.xpath("//input[contains(@value,'All')]"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//input[contains(@id,'11')]"));
	}

	public void textSample()
	{
		
		driver.findElement(By.xpath("//button[text()='Get Total']"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		driver.findElement(By.xpath("//button[text()='Get Results']"));
		driver.findElement(By.xpath("//h4[text()='Pateints Age Group']"));
		driver.findElement(By.xpath("//label[text()='45 to 60']"));
	}
	
	public void startwithSample()
	{
		driver.findElement(By.xpath("//button[starts-with(text(),'Show')]"));
		driver.findElement(By.xpath("//input[starts-with(@id,'value-b')]"));
		driver.findElement(By.xpath("//input[starts-with(@id,'value-a')]"));
		driver.findElement(By.xpath("//input[starts-with(@id,'single-input-field')]"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//input[starts-with(@id,'gridCheck')]"));
	}
	public void orAndSample()
	{
		driver.findElement(By.xpath("//input[@id='value-a' or @type='text']"));
		System.out.println("1");
		driver.findElement(By.xpath("//div[@id='message-one' or @class='my-2']"));
		System.out.println("2");
		driver.findElement(By.xpath("//input[@id='gridCheck' and @class='form-check-input']"));
		System.out.println("3");
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		System.out.println("4");
		driver.findElement(By.xpath("//input[@class='check-box-list' and @id='check-box-one']"));
		System.out.println("5");
	}
	
	public void childParentSample()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		System.out.println("6");
		driver.findElement(By.xpath("//div[@class='form-check']//child::input[@id='gridCheck']"));
		System.out.println("7");
		driver.findElement(By.xpath("//div[@class='form-check']//child::input[@id='check-box-one']"));
		System.out.println("8");
	}
	public static void main(String[] args) 
	{	
		Locators locators = new Locators();
		locators.initialiseBrowser();
		//locators.locateById();
		//locators.findId();
		//locators.findClassName();
		//locators.locateXPath();
		//locators.locatorsSample();
		//locators.cssSelector();
		//locators.dynamicXPath();
		//locators.containsSample();
		//locators.textSample();
		//locators.startwithSample();
		locators.orAndSample();
		locators.childParentSample();
		locators.browserCloseorQuit();

	}

}
