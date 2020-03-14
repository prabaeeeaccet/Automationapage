package test;

import javax.swing.text.Element;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.homepageobjects;

public class homepagetest {
	
	homepageobjects homepage;
	
   public homepagetest(){
	   homepage=new homepageobjects();
   }
   @Test
   public void verifyTabs(){
	   
	   Assert.assertTrue(homepage.elementfound(homepage.women()));
	   Assert.assertTrue(homepage.tshirts().isDisplayed());
	   Assert.assertTrue(homepage.dresses().isDisplayed());
	   System.out.println(homepage.women().getText());
   }
 
   
   @Test
   public void pagenavigation(){
	   homepage.women().click();
	   Assert.assertTrue(homepage.gettitle().contains("Women"));
	   System.out.println(homepage.gettitle());
	   homepage.backpage();
	   homepage.dresses().click();
	   Assert.assertTrue(homepage.gettitle().contains("Dresses"));
	   System.out.println(homepage.gettitle());
	   homepage.backpage();
	   homepage.tshirts().click();
	   Assert.assertTrue(homepage.gettitle().contains("T-shirts"));
	   System.out.println(homepage.gettitle());
	   homepage.backpage();
   }
   @Test
   public void verifymessage(){
	homepage.sentTxt(homepage.mail(), "venkateshprof2@gmail.com");
	homepage.go().click();
	//Assert.assertTrue(homepage.getAttTxt(homepage.mail()).contains("You have successfully subscribed to this newsletter"));
   }
	
}
