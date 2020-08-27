package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class home_page_object extends BaseClass{
	
	public home_page_object(WebDriver driver) {
		
		super(driver);
		
	}
	
	@FindBy(how=How.XPATH, using="//a[@title='View my customer account']/span")
	public static WebElement usernameLnk;
	
	@FindBy(how=How.XPATH, using="//input[@id='email']")
	public static WebElement emailTxtBox;
	
	
}
