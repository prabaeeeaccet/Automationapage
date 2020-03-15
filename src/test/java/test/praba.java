package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.dresspageobject;
import pages.homepageobjects;
import pages.productpageobjects;

public class productpagetest {
	
	homepageobjects homepage2;
	dresspageobject dresspage;
	productpageobjects productpage;
	
	public productpagetest(){
		homepage=new homepageobjects();
		dresspage=new dresspageobject();
		productpage=new productpageobjects();
	}
	
	@Test
	public void tweetsharedispaly(){
		Assert.assertTrue(homepage.elementfound(productpage.share()));
		Assert.assertTrue(homepage.elementfound(productpage.twitter()));
	}
	@Test
	public void description(){
		homepage.dresses().click();
		dresspage.product().click();
		Assert.assertTrue(homepage.elementfound(productpage.productdes()));
	}

}
