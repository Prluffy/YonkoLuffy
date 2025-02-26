package com.Dollibarr.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Dollibarr.generic.WebDriverUtility.WebDriverUtility;

public class MemberInfoPage 
{
	WebDriverUtility wlib=new WebDriverUtility();
	WebDriver driver;
	public MemberInfoPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Validate']")
	private WebElement validateBtn;
	
	@FindBy(xpath="//a[text()='Modify']")
	private WebElement modifyBtn;
	
	@FindBy(xpath="//a[text()='Create a third party']")
	private WebElement createThirdPartyBtn;
	
	@FindBy(xpath="//a[text()='Create a user']")
	private WebElement createUserBtn;
	
	@FindBy(xpath="//a[text()='Delete']")
	private WebElement deleteBtn;
	
	@FindBy(xpath="//a[text()='Contributions']")
	private WebElement contributionsTab;
	
	@FindBy(xpath="//a[text()='Note']")
	private WebElement noteBtn;
	
	@FindBy(xpath="//a[@title='Linked files']")
	private WebElement linkedFilesTab;
	
	@FindBy(xpath="//a[text()='Events']")
	private WebElement eventsTab;
	
	@FindBy(xpath="//a[text()='Back to list']")
	private WebElement backToListLink;
	
	@FindBy(xpath="//div[@class='inline-block floatleft valignmiddle maxwidth750 marginbottomonly refid refidpadding']")
	private WebElement memberVerifyElement;
	
	public WebElement getValidateBtn() {
		return validateBtn;
	}
	
	
	public WebElement getModifyBtn() {
		return modifyBtn;
	}
	
	
	public WebElement getCreateThirdPartyBtn() {
		return createThirdPartyBtn;
	}
	
	
	public WebElement getCreateUserBtn() {
		return createUserBtn;
	}
	
	
	public WebElement getDeleteBtn() {
		return deleteBtn;
	}
	
	
	public WebElement getContributionsTab() {
		return contributionsTab;
	}
	
	
	public WebElement getNoteBtn() {
		return noteBtn;
	}
	
	
	public WebElement getLinkedFilesTab() {
		return linkedFilesTab;
	}
	
	
	public WebElement getEventsTab() {
		return eventsTab;
	}
	
	
	public WebElement getBackToListLink() {
		return backToListLink;
	}


	public WebElement getMemberVerifyElement() {
		return memberVerifyElement;
	}
	
	
	
//	public void validate()
//	{
//		validateBtn.click();
//		wlib.AlertPopupAccept(driver);
//	}

}
