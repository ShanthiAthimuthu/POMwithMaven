package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods{
	public DuplicateLeadPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="sectionHeaderTitle_leads")
	private WebElement duplicateLead;

	public  dupPage() {
		verifyTitle(duplicateLead);
		return this();
	}

	

}
