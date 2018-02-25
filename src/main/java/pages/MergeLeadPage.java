package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{
	
	public  MergeLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(how=How.XPATH, using ="//img[@alt='Lookup']")
private WebElement imgLk;
	public Img1Window Image1Look()
	{
		click(imgLk);
		return new Img1Window();
	}

}
