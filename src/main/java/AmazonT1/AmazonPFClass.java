package AmazonT1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPFClass {

	
	@FindBy(xpath=("//span[@class=\"hm-icon-label\"]"))
    private WebElement AllButton;
	
	@FindBy(xpath=("//a[@data-menu-id=\"2\"]"))
    private WebElement DigitalContent;
	
	@FindBy(xpath=("//a[contains(text(),'Echo Dot (3rd Gen)')]"))
	private WebElement EchoDot;
	
	@FindBy(xpath=("//span[@id=\"productTitle\"]"))
	private WebElement ValidateEchoDot;

	
	WebDriver driver;
	
	public AmazonPFClass (WebDriver driver) {
	
	PageFactory.initElements(driver,this);	
	
	}

	public void clickAllButton () {
	
	AllButton.click();
		
		
	}
    public void clickOnDigitalcontent () throws InterruptedException {
    Thread.sleep(2000);
    DigitalContent.click();
    
    }
    public void clickOnEchoDot(WebDriver driver) throws InterruptedException {
    Thread.sleep(2000);
    
    WebDriverWait t = new WebDriverWait(driver,3);
	t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Echo Dot (3rd Gen)')]")));
	EchoDot.click();
     
    }
	public void ValidateEchoDot (WebDriver driver) throws InterruptedException {
    Thread.sleep(2000);
    boolean Display = ValidateEchoDot.isDisplayed();
    
    if(Display==true) {
    System.out.println("EchoDot(3rd generation) Is Displayed");
    }
    else 
    {
    System.out.println("EchoDot(3rd generation) Is Displayed");
    }
    System.out.println("All Test are passed");
    driver.quit();
    }
}
