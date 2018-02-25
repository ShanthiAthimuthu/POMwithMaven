package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import wdMethods.ProjectMethods;

public class MyLeadPage extends ProjectMethods {

	public MyLeadPage() {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement cLead;
	
	public CreateLeadPage clickCreateLead()
	{
		click(cLead);
		return new CreateLeadPage();
	}

	@FindBy(how=How.XPATH, using ="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)")
			
	
	private WebElement fLead;
	public ViewLeadPage FirstLeadClick() throws InterruptedException
	{
		Thread.sleep(4000);
		click(fLead);
		return new ViewLeadPage();
	}

	
}
