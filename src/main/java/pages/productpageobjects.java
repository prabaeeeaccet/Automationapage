package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productpageobjects extends basepage {
	
	public productpageobjects(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='center_column']/div/div/div[3]/p[7]/button[1]")
	WebElement twitter;
	
	@FindBy(xpath="//*[@id='center_column']/div/div/div[3]/p[7]/button[2]")
	WebElement share;
	
	@FindBy(id="short_description_block")
	WebElement productdes;
	
	public WebElement twitter(){
		return twitter;
	}
	public WebElement share(){
		return share;
	}
	public WebElement productdes(){
		return productdes;
	}
}
