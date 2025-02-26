package com.Dollibarr.generic.ObjectRepositoryUtility;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ProductsPage {
	 //code 1
	//code 2
	//code 3
	@FindBy(name="luffy")
	private WebElement luffy;
	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.amazon.com/");
	driver.findElement(By.name("Search Amazon.in")).click();
	ele=driver.findElement(By.id("apple 15 pro"));
	Actions act= new Actions(driver);
		act.moveToElement(ele);
	}
}
