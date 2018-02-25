package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import wdMethods.ProjectMethods;

public class Img1Window extends ProjectMethods{
	public Img1Window()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.NAME, using ="ID")
	private WebElement id1;
	public img2Look Window1Switch()
	{
		type(id1));
		return new img2Look();
	}
	

}
