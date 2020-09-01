package Step_Definition;

import org.openqa.selenium.support.PageFactory;
import Page_Object.login_page_object;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login_Step_Definition extends GenericFunctions {
	
	//public WebDriver driver;
	
	@Given("^User pass the Application Url$")
	public void user_pass_the_Application_Url() throws Throwable {
		
		driver = Hooks.driver;
	   
	}

	@When("^Username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void username_as_and_password_as(String username, String password) throws Throwable {
		
		PageFactory.initElements(driver, login_page_object.class);
		
		GenericFunctions.waitFunction(login_page_object.signInBtn);
		GenericFunctions.elementToBeClicked(login_page_object.signInBtn);
		GenericFunctions.waitFunction(login_page_object.emailTxtBox);
		GenericFunctions.enterTxt(login_page_object.emailTxtBox, username);
		GenericFunctions.waitFunction(login_page_object.pswdTxtBox);
		GenericFunctions.enterTxt(login_page_object.pswdTxtBox, password);
		GenericFunctions.waitFunction(login_page_object.submitBtn);
		GenericFunctions.elementToBeClicked(login_page_object.submitBtn);
		   
	}

	
	@Then("^User should be able to login to the Application and the \"([^\"]*)\" should appear in the username link$")
	public void user_should_be_able_to_login_to_the_AutomationPractice_Application_and_the_should_appear_in_the_username_link(String name) throws Throwable {
		
		GenericFunctions.waitFunction(login_page_object.usernameLnk);
		GenericFunctions.verifyText(login_page_object.usernameLnk.getText(), name);
		  
	}

}
