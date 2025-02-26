package com.Dollibarr.generic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewMemberPage extends MembersPage
{
    WebDriver driver;
	public NewMemberPage(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
    
	@FindBy(id="select2-typeid-container")
    private WebElement memberTypeEdit;
	
	@FindBy(id="select2-morphy-container")
	private WebElement natureOfMemberDD;
	
	@FindBy(xpath="//input[@name='societe']")
	private WebElement companyEdit;
	
	@FindBy(id="select2-civility_id-container")
	private WebElement titleDD;
	
	@FindBy(name="lastname")
	private WebElement lastNameEdit;
	
	@FindBy(name="firstname")
	private WebElement firstNameEdit;
	
	@FindBy(id="select2-gender-container")
	private WebElement genderDD;
	
	@FindBy(name="save")
	private WebElement saveBtn;
	
	@FindBy(xpath="//li[text()='Companies']")
	private WebElement memberTypeCompanies;
	
	@FindBy(xpath="//li[text()='Individuals']")
	private WebElement memberTypeIndividuals;

	@FindBy(xpath="//li[text()='bank']")
	private WebElement memberTypebank;
	
	@FindBy(xpath="//li[text()='Individual']")
	private WebElement natureOfMemberIndividual;
	
	@FindBy(xpath="//li[text()='Corporation']")
	private WebElement natureOfMemberCorporation;
	
	public WebElement getMemberTypeDD() {
		return memberTypeEdit;
	}

	public WebElement getNatureOfMemberDD() {
		return natureOfMemberDD;
	}

	public WebElement getCompanyEdit() {
		return companyEdit;
	}

	public WebElement getTitleDD() {
		return titleDD;
	}

	public WebElement getLastNameEdit() {
		return lastNameEdit;
	}

	public WebElement getFirstNameEdit() {
		return firstNameEdit;
	}

	public WebElement getGenderDD() {
		return genderDD;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getMemberTypeCompanies() {
		return memberTypeCompanies;
	}

	public WebElement getMemberTypeIndividuals() {
		return memberTypeIndividuals;
	}

	public WebElement getMemberTypebank() {
		return memberTypebank;
	}

	public WebElement getNatureOfMemberIndividual() {
		return natureOfMemberIndividual;
	}

	public WebElement getNatureOfMemberCorporation() {
		return natureOfMemberCorporation;
	}
	
	
	
}
