package testcases;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;
import pages.*;

import wdMethods.ProjectMethods;

public class TC003_DeleteLead extends ProjectMethods {
	@BeforeTest
	public  void setData() 
	{
		testCaseName="TC003_DeleteLead";
		testDescription="Delete the entered details of Lead";
		testNodes="Leads";
		category="Sanity";
		authors="Krish";
		browserName="chrome";
		dataSheetName="TC005";
	}

	@Test(dataProvider="fetchData")
	public static void DeleteLead(String uName,String pwd, String compName ) throws InterruptedException{

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLead()
		.FirstLeadClick()
		.DeleteButton();
	}
}
