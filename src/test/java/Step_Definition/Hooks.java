package Step_Definition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Page_Object.login_page_object;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
	public static WebDriver driver;
	public Properties prop;
	Logger logger=Logger.getLogger("Hooks");
	//Changes in hooks

	@Before
	/**
	 * Delete all cookies at the start of each scenario to avoid
	 * shared state between tests
	 */
	public void openBrowser() throws IOException, Throwable, InvalidFormatException {
//		prop=new Properties();
//		FileInputStream fis=new FileInputStream("src//main//resources//Browser.properties");
//		prop.load(fis);
//		String url=prop.getProperty("url");
//		String Browsername=prop.getProperty("browser");
		
		String Browsername=GetCellValueBasedOnColumnName.readdatafromExcelusingcolumnName("C:\\Users\\abhim\\OneDrive\\Desktop\\Data.xlsx","BrowserDetails","Browser", 1);
		System.out.println(Browsername);
		String url=GetCellValueBasedOnColumnName.readdatafromExcelusingcolumnName("C:\\Users\\abhim\\OneDrive\\Desktop\\Data.xlsx","BrowserDetails","URL", 1);
		System.out.println(url);
		
		//logger Changes by Abhishek
		logger.info("Fetching the Application URL from File --> " +" "+url+ " "+ "Opening the Url");
		
		if(Browsername.equals("chrome")){
			System.out.println("Called openBrowser");
			/*//For Accepting Security Certificates
			DesiredCapabilities capability = DesiredCapabilities.chrome();
			capability.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors"));*/
			ChromeOptions options = new ChromeOptions();
			
			System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			driver = new ChromeDriver(options);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
			//Runtime.getRuntime().exec("AutoIT_Exe//AutoIT_Login.exe");
			
		//	driver.get(prop.getProperty("url"));
			driver.get(url);

			
		}
		else if(Browsername.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "driver//geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			}
	}


	@After()
	public void tearDown(Scenario scenario) throws IOException {

		if(scenario.isFailed()) {
			try {
				scenario.write("Current Page URL is " + driver.getCurrentUrl());
				byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("Screenshots//"+scenario.getName()+"screenshot.png"));
			} catch (WebDriverException somePlatformsDontSupportScreenshots) {
				System.err.println(somePlatformsDontSupportScreenshots.getMessage());
			}

		}
		driver.close();
		driver.quit();

	}
	
	//----------------------------------Generic Methods-------------------------------------------------------------------------------------//
	

	
}
