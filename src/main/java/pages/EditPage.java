package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pages.ViewLeadPage;

import wdMethods.ProjectMethods;

public class EditPage extends ProjectMethods  {
	String getEditText;
	public EditPage ()
	
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.NAME,using ="companyName")
	private WebElement compName;
public EditPage  editCompname(String data)
{
	compName.clear();
 //getEditText =
		 type(compName,data);
	return this;
}
@FindBy(how=How.NAME, using ="submitButton")
private WebElement updateButton;
public ViewLeadPage clickUpdateButton()
{
	click(updateButton);
	return new ViewLeadPage();
}
//@FindBy(how=How.NAME,using ="companyName")
String textVerify="companyName";
public void editedTextVerify()
{
	if (textVerify.contentEquals(getEditText))
	{
		System.out.println("Edited Text Verified");
	}
}
}





