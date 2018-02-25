package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_CreateLead extends ProjectMethods {
	@BeforeTest
	public void setData() 
	{
		testCaseName="TC001_LoginAndLogout";
		testDescription="login to LeafTaps And Logout";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC003";
	}

	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd,String cName,String fName,String lName) {


		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLead()
		.clickCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLeadbutton()
		.ViewLead(fName);
	}

}
