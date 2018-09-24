package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

import com.qa.Listeners.WebEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ETLTestBase {

	public static WebDriver driver;
	public static Properties prop;

	public WebDriverWait wait;
	public static WebEventListener eventListener;
	public static EventFiringWebDriver e_driver;
	
//	shiva added
	public static GenerateData genData;
	
	
//	shiva added
	public void testRegistrationForm() {
		driver.findElement(By.className("code")).sendKeys(genData.generateRandomAlphaNumeric(30));
	}

	public WebDriver getDriver() {
		return driver;
	}

	public ETLTestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
//					"D:\\Study\\automated-testing\\src\\test\\java\\com\\qa\\config\\Configuation.properties");
			
		"src\\test\\java\\com\\qa\\config\\Configuation.properties");
			
			prop.load(fis);

		} catch (IOException e) {
			e.getMessage();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			
//			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			
			WebDriverManager.chromedriver().setup();
			
			
//		      ChromeOptions options = new ChromeOptions();
//		      options.addArguments("disable-infobars"); options.addArguments("headless");
//			  options.addArguments("window-size=1200x600");
//			  
//			  driver = new ChromeDriver(options);
		 
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {

			// Set Firefox Headless mode as TRUE as well disabling the Marionaette relay on the console
/*
			FirefoxBinary firefoxBinary = new FirefoxBinary();
		    firefoxBinary.addCommandLineOptions("--headless");
		    System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
		
			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
		    FirefoxOptions firefoxOptions = new FirefoxOptions();
		    firefoxOptions.setBinary(firefoxBinary);
									
		 	driver = new FirefoxDriver(firefoxOptions);

			/*
			 * System.setProperty("webdriver.gecko.driver",
			 * "C:\\Selenium\\geckodriver.exe");
			 * System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,
			 * "true"); System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,
			 * "/dev/null"); // Instantiate Web Driver driver = new FirefoxDriver(options);
			 */

			/*
			 * FirefoxOptions options = new FirefoxOptions();
			 * options.addPreference("extensions.logging.enabled", false); driver = new
			 * FirefoxDriver(options); // driver = new FirefoxDriver();
			 */
//			 System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
//			 driver= new FirefoxDriver();
			 
//		 	WebDriverManager.firefoxdriver().setup();
			
		}
		// WebEvent Listener
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with
		// EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(ETLTestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(ETLTestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

		// Thread.sleep(15000);

	}

	public String getReportConfigPath() {
		String reportConfigPath = prop.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");

	}

@AfterClass
	public void teardown() {
		driver.quit();
	}
}