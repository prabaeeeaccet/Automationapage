package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class dresspageobject extends basepage {

	@FindBy(xpath = "//a[text()='S']")
	private WebElement sizes;

	@FindBy(xpath = "//a[text()='L']")
	private WebElement sizel;

	@FindBy(xpath = "//a[text()='M']")
	private WebElement sizem;

	@FindBy(xpath = "(//span[@class='available-now'])[1]")
	WebElement mousemove;

	@FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	WebElement addtocart;

	@FindBy(xpath = "//span[@title='Close window']")
	WebElement closewindow;
	

	@FindBy(xpath="//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
	private WebElement checkout;

	@FindBy(xpath = "//span[@class='ajax_cart_quantity unvisible']")
	WebElement cartcount;

	@FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]/h5/a")
	WebElement product;

	@FindBys(@FindBy(className = "product-container"))
	private List<WebElement> productcontainer;
	

	public dresspageobject() {
		PageFactory.initElements(driver, this);
	}

	public int productcontainer() {
		int a = productcontainer.size();
		return a;
	}

	@FindBy(className = "heading-counter")
	private WebElement productcount;

	public int productcount() {
		String a = productcount.getText();
		String b[] = a.split(" ");
		System.out.println(b[2]);
		int ab = Integer.parseInt(b[2]);
		System.out.println(ab);
		return ab;
	}

	public WebElement sizes() {
		return sizes;
	}

	public WebElement sizem() {
		return sizem;
	}

	public WebElement sizel() {
		return sizel;
	}

	public WebElement mousemove() {
		return mousemove;
	}

	public WebElement addtocart() {
		return addtocart;
	}

	public WebElement closewindow() {
		return closewindow;
	}

	public WebElement cartcount() {
		return cartcount;
	}

	public WebElement product() {
		return product;
	}

	public WebElement checkout(){
		return checkout;
	}
}
