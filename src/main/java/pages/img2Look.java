package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import wdMethods.ProjectMethods;

public class img2Look extends ProjectMethods{
	public img2Look()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.NAME, using ="ID")
	private WebElement id2;
	public ClickMerge Window1Switch()
	{
		type(id2);
		return new ClickMerge();
	}
	

}
