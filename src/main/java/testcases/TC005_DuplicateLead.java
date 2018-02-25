
	package testcases;

	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import pages.LoginPage;
	import pages.DuplicateLeadPage;
	
	import wdMethods.ProjectMethods;
	

	public class TC005_DuplicateLead extends ProjectMethods {
		@BeforeTest
		public void setData() 
		{
			testCaseName="TC005_DuplicateLead";
			testDescription="Duplicate an existing lead data";
			testNodes="Leads";
			category="Sanity";
			authors="kumar";
			browserName="chrome";
			dataSheetName="TC005";
		}

		@Test(dataProvider="fetchData")
		public void DuplicateLead(String uName,String pwd,String cName,String verifyFName,String duplicate) {


			new LoginPage()
			.enterUserName(uName)
			.enterPassword(pwd)
			.clickLogIn()
			.clickCRMSFA()
			.clickLead()
			.VerifyFirstName(verfiyFName)
			.DuplicateLead(duplicate)
			.dupPage() ;
			
			
		}

	}


}
