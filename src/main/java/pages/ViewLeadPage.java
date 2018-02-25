package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	public ViewLeadPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement verifyFName;
	
	public ViewLeadPage ViewLead(String data) {
		//WebElement elePassword = locateElement("password");
		verifyPartialText(verifyFName, data);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT, using ="Edit")
	private WebElement edit;
	public EditPage EditButton()
	{
	click(edit);
	return new EditPage();
	}
	
	@FindBy(how=How.CLASS_NAME, using="subMenuButtonDangerous")
	private WebElement dButton;
	public MyLeadPage DeleteButton()
	{
		click(dButton);
		return new MyLeadPage();
	}
}

