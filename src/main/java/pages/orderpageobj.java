package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderpageobj extends basepage {
	public orderpageobj(){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement addbutton;
	
	@FindBy(xpath="//span[@id='product_price_3_13_0']")
	private WebElement unitprice;
	
	@FindBy(xpath="//td[@id='total_shipping']")
	private WebElement shipprice;
	
	
	@FindBy(xpath="//span[@id='total_price']")
	private WebElement price;

public WebElement click(){
 return addbutton;	
}
public WebElement unitprice(){
	return unitprice;
}

public WebElement shipprice(){
	return shipprice;
}
public WebElement getprice(){	
	return price;
}





}