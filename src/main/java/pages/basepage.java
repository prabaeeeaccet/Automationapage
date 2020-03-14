package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basepage {
	
	public static WebDriver driver;
	public String browser="chrome";
	public basepage(){
		if(driver==null){
			if(browser.equals("chrome")){
				System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
				driver =new ChromeDriver();
			}else if(browser.equals("firefox")){
				System.setProperty("webdriver.gecko.driver","C:\\selenium\\chromedriver.exe");
				driver =new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");
		}
	}
	public String getAttTxt(WebElement element){
		return element.getAttribute("value");
		
	}
	public void dropDown(WebElement element,String option){
		Select obj=new Select(element);
		obj.selectByVisibleText(option);
	}
	public void sentTxt(WebElement element,String name){
		if(name!=null){
			element.click();
			element.clear();
			element.sendKeys(name);
		}
	}
	public String getTxt(WebElement element){
		return element.getText();
		}
	public String gettitle(){
		return driver.getTitle();
	}
	public void backpage(){
		driver.navigate().back();
	}
	public boolean elementfound(WebElement element){
		boolean a=element.isDisplayed();
		return a;
	}
	public void mouseaction(WebElement element){
		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();
		}
	public void explicitwait(WebElement element){
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	

}
