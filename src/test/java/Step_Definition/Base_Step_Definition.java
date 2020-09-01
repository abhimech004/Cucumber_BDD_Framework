package Step_Definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Step_Definition {
	
	public static WebDriver driver;
	
	public static void waitFunction(WebElement ele) {
		
		WebDriverWait wait = new WebDriverWait(driver,80);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	
	public static void elementToBeClicked(WebElement ele) {
		
		ele.click();
	}
	
    public static void enterTxt(WebElement ele, String txt) {
		
		ele.sendKeys(txt);
	}
	
    public static void verifyText(String actVal, String expVal) {
		
		if(actVal.equals(expVal)) {
			System.out.println("Pass");
		}else
			System.out.println("Fail");
    	
    }

}
