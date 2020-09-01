package Step_Definition;

import org.openqa.selenium.support.PageFactory;
import Page_Object.login_page_object;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login_Step_Definition extends Base_Step_Definition {
	
	//public WebDriver driver;
	
	@Given("^User pass the Application Url$")
	public void user_pass_the_Application_Url() throws Throwable {
		
		driver = Hooks.driver;
	   
	}

	@When("^Username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void username_as_and_password_as(String username, String password) throws Throwable {
		
		PageFactory.initElements(driver, login_page_object.class);
		
		Base_Step_Definition.waitFunction(login_page_object.signInBtn);
		Base_Step_Definition.elementToBeClicked(login_page_object.signInBtn);
		Base_Step_Definition.waitFunction(login_page_object.emailTxtBox);
		Base_Step_Definition.enterTxt(login_page_object.emailTxtBox, username);
		Base_Step_Definition.waitFunction(login_page_object.pswdTxtBox);
		Base_Step_Definition.enterTxt(login_page_object.pswdTxtBox, password);
		Base_Step_Definition.waitFunction(login_page_object.submitBtn);
		Base_Step_Definition.elementToBeClicked(login_page_object.submitBtn);
		   
	}

	
	@Then("^User should be able to login to the Application and the \"([^\"]*)\" should appear in the username link$")
	public void user_should_be_able_to_login_to_the_AutomationPractice_Application_and_the_should_appear_in_the_username_link(String name) throws Throwable {
		
		Base_Step_Definition.waitFunction(login_page_object.usernameLnk);
		Base_Step_Definition.verifyText(login_page_object.usernameLnk.getText(), name);
		  
	}

}
