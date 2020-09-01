package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class login_page_object extends BaseClass{
	
	public login_page_object(WebDriver driver) {
		
		super(driver);
		
	}
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Sign in')]")
	public static WebElement signInBtn;
	
	@FindBy(how=How.XPATH, using="//input[@id='email' and @name='email']")
	public static WebElement emailTxtBox;
	
	@FindBy(how=How.XPATH, using="//input[@id='passwd']")
	public static WebElement pswdTxtBox;
	
	@FindBy(how=How.XPATH, using="//button[@id='SubmitLogin']//span")
	public static WebElement submitBtn;
	
	@FindBy(how=How.XPATH, using="//a[@title='View my customer account']/span")
	public static WebElement usernameLnk;

}
