package com.Dollibarr.generic.ObjectRepositoryUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductsPage {
	 //code 1
	//code 2
	//code 3
	//@findby
	
//	WebDriver driver;
	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.amazon.com/");
	driver.findElement(By.xpath("//label[text()='Search Amazon.in']")).click();
	}
}
