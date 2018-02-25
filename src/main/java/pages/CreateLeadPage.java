package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {
	public CreateLeadPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement cName;
	
	public CreateLeadPage enterCompanyName(String data) {
		//WebElement elePassword = locateElement("password");
		type(cName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement fName ;
	
	public CreateLeadPage enterFirstName(String data) {
		//WebElement elePassword = locateElement("password");
		type(fName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement lName;
	
	public CreateLeadPage enterLastName(String data) {
		//WebElement elePassword = locateElement("password");
		type(lName, data);
		return this;
	}
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement cLeadButton;
	
	public ViewLeadPage clickCreateLeadbutton() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(cLeadButton);
		/*HomePage hp = new HomePage();
		return hp;*/
		return new ViewLeadPage();
		
	}
}
