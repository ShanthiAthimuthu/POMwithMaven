package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLead extends ProjectMethods {

	public MergeLead()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement mLead;
	
	public MergeLeadPage clickMergeLead()
	{
		click(mLead);
		return new MergeLeadPage();
	}

}
