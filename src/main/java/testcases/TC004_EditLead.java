package testcases;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;
import pages.*;

import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods {
	@BeforeTest
	public  void setData() 
	{
		testCaseName="TC004_EditLead";
		testDescription="Edit the entered details of Lead";
		testNodes="Leads";
		category="Sanity";
		authors="Krish";
		browserName="chrome";
		dataSheetName="TC004";
	}

	@Test(dataProvider="fetchData")
	public static void EditLead(String uName,String pwd, String compName ) throws InterruptedException{

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLead()
		.FirstLeadClick()
		.EditButton()
		.editCompname(compName)
		.clickUpdateButton();
	}
}
