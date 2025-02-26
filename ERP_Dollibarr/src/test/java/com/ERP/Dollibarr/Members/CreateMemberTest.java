package com.ERP.Dollibarr.Members;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Dollibarr.BaseUtility.BaseClass;
import com.Dollibarr.generic.ObjectRepositoryUtility.HomePage;
import com.Dollibarr.generic.ObjectRepositoryUtility.MemberInfoPage;
import com.Dollibarr.generic.ObjectRepositoryUtility.MembersPage;
import com.Dollibarr.generic.ObjectRepositoryUtility.NewMemberPage;

public class CreateMemberTest extends BaseClass
{
	@DataProvider
	public Object[][] data() throws Exception
	{
		int rowCount = elib.getLastRowNum("Sheet1");
		int cellCount = elib.getLastCellNum("Sheet1", 1);
		System.out.println(cellCount);
		System.out.println(rowCount);
		Object[][] objArr=new Object[rowCount][cellCount];
		for(int i=0;i<=rowCount;i++)
		{
			for(int j=0;j<=cellCount;j++)
			{
				try
				{
		      objArr[i][j]=elib.getDataFromExcel("Sheet1", i+1, j+1);
				}
				catch(Exception e)
				{}
			}
		}
		return objArr;
	}
	@Test(dataProvider = "data")
	public void createMemberWithMndatoryFields(String memberType,String natureOfMember,String companyName,String title,String lastName,String firstName) throws EncryptedDocumentException, IOException
	{
//		String memberType = elib.getDataFromExcel("members", 1, 1);
//		String natureOfMember = elib.getDataFromExcel("members", 1, 2);
//		String companyName = elib.getDataFromExcel("members", 1, 3);
//		String title = elib.getDataFromExcel("members", 1, 4);
//		String lastName = elib.getDataFromExcel("members", 1, 5);
//		String firstName = elib.getDataFromExcel("members", 1, 6);
		//System.out.println(memberType);
		
		HomePage hp=new HomePage(driver);
		hp.getMembersLink().click();
		
		MembersPage mp=new MembersPage(driver);
		mp.getNewMemberLink().click();
		
		NewMemberPage nmp=new NewMemberPage(driver);
		nmp.getMemberTypeDD().click();
		
		driver.findElement(By.xpath("//li[text()='"+memberType+"']")).click();
		
		nmp.getNatureOfMemberDD().click();
		
		driver.findElement(By.xpath("//li[text()='"+natureOfMember+"']")).click();
		
		nmp.getLastNameEdit().sendKeys(lastName);
		nmp.getFirstNameEdit().sendKeys(firstName);
		
		nmp.getSaveBtn().click();
		
		MemberInfoPage mip=new MemberInfoPage(driver);
		/*driver.findElement(By.xpath("//div[text()='"+lastName+" "+firstName+" ']"));*/
		String header = mip.getMemberVerifyElement().getText();
		boolean verify = header.contains(firstName);
		Assert.assertEquals(verify, true);
		
	}
	
	@Test
	public void createMemberWithEnteringAllFields() throws Exception
	{
		String memberType = elib.getDataFromExcel("members", 1, 1);
		String natureOfMember = elib.getDataFromExcel("members", 1, 2);
		String companyName = elib.getDataFromExcel("members", 1, 3)+ jlib.getRandomNumber();
		String lastName = elib.getDataFromExcel("members", 1, 5)+jlib.getRandomNumber();
		String firstName = elib.getDataFromExcel("members", 1, 6)+jlib.getRandomNumber();
		int rowCount = elib.getLastRowNum("members");
		//System.out.println(memberType);
		
		HomePage hp=new HomePage(driver);
		hp.getMembersLink().click();
		
		MembersPage mp=new MembersPage(driver);
		mp.getNewMemberLink().click();
		
		NewMemberPage nmp=new NewMemberPage(driver);
		nmp.getMemberTypeDD().click();
		
		driver.findElement(By.xpath("//li[text()='"+memberType+"']")).click();
		
		nmp.getNatureOfMemberDD().click();
		
		driver.findElement(By.xpath("//li[text()='"+natureOfMember+"']")).click();
		
		nmp.getLastNameEdit().sendKeys(lastName);
		nmp.getFirstNameEdit().sendKeys(firstName);
		
		
		
		nmp.getSaveBtn().click();
		
		MemberInfoPage mip=new MemberInfoPage(driver);
		/*driver.findElement(By.xpath("//div[text()='"+lastName+" "+firstName+" ']"));*/
		String header = mip.getMemberVerifyElement().getText();
		boolean verify = header.contains(firstName);
		Assert.assertEquals(verify, true);
		
	}
}
