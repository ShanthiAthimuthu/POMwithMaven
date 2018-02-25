package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditButtonPage extends ProjectMethods {
	public EditButtonPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
private WebElement eButton;
	
	public EditPage clickEditButton()
	{
		click(eButton);
		return new EditPage();
	}

}