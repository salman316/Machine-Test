package task1Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import AmazonT1.AmazonPFClass;

public class AmazonTestClass {
	WebDriver driver;
	AmazonPFClass g;
	
	@BeforeClass
	public void OpenBrowser () {
	System.out.println("Open the Browser");
		  
    System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver 92 Verson\\chromedriver_win32 (1)\\chromedriver.exe");	
    driver = new ChromeDriver ();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("https://www.amazon.in/");
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    
    g =new AmazonPFClass (driver);
	
	}

	@Test 
	public void clickAllbutton () throws InterruptedException {
    g.clickAllButton();
	g.clickOnDigitalcontent();
	g.clickOnEchoDot(driver);
	g.ValidateEchoDot(driver);
	}
}	



