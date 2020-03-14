package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.dresspageobject;
import pages.homepageobjects;

public class dresspagetest {

	dresspageobject dresspage;
	homepageobjects homepage;
	

	public dresspagetest() {
		dresspage = new dresspageobject();
		homepage = new homepageobjects();
	}

	@Test
	public void sizediplay() {
		
		Assert.assertTrue(dresspage.sizes().isDisplayed());
		System.out.println(dresspage.getTxt(dresspage.sizes()));
		Assert.assertTrue(dresspage.sizem().isDisplayed());
       Assert.assertTrue(dresspage.sizel().isDisplayed());
	}
	@Test
	public void productdisplay(){
		boolean test;
	if(dresspage.productcontainer()==dresspage.productcount()){
			test=true;
		}
		else{
			test=false;
		}
	Assert.assertTrue(test);
		}
		
	@Test
	public void addtoCart(){
		
		homepage.dresses().click();
		homepage.mouseaction(dresspage.mousemove());
		dresspage.addtocart().click();
		dresspage.closewindow().click();
		homepage.getTxt(dresspage.cartcount());
		Assert.assertTrue(homepage.getTxt(dresspage.cartcount()).equals("1"));
		
		
	}

}
