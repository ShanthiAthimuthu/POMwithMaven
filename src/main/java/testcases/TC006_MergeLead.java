package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.*;
import pages.DuplicateLeadPage;

import wdMethods.ProjectMethods;



public class TC006_MergeLead extends ProjectMethods {
	@BeforeTest
	public void setData() 
	{
		testCaseName="TC006_MergeLead";
		testDescription="Merge two lead datas";
		testNodes="Leads";
		category="Sanity";
		authors="kumar";
		browserName="chrome";
		dataSheetName="TC006";
	}

	@Test(dataProvider="fetchData")
	public void MergeLead(String uName,String pwd,String cName,String verifyFName ) {


		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLead()
		.ViewLead(verfiyFName)
		.clickMergeLead()
		.Image1Look()
		.Window1Switch()
		
		
		;
		
		
		
		
		
		
		
		
		/*.clickCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLeadbutton()
		.VerifyFirstName(fName);
	*/
	}

}


}

