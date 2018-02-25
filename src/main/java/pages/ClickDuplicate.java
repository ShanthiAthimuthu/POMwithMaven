package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ClickDuplicate extends ProjectMethods {
	public ClickDuplicate()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="//a[@class='x-tab-right']")
	private WebElement duplicate;

	public DuplicateLeadPage DuplicateLead(String data) {
		click(duplicate);
		return new DuplicateLeadPage();
	}

}
