package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.dresspageobject;
import pages.homepageobjects;
import pages.orderpageobj;

public class ordertest {
	homepageobjects homepage;
	dresspageobject dresspage;
	orderpageobj orderpage;
	public ordertest(){
		homepage=new homepageobjects();
		dresspage=new dresspageobject();
		orderpage=new orderpageobj();
	}

	@Test
	public void checkprice() throws InterruptedException{
		homepage.dresses().click();
		homepage.mouseaction(dresspage.mousemove());
		dresspage.addtocart().click();
		dresspage.checkout().click();
		int n=2;int i;
		String a=orderpage.getTxt(orderpage.unitprice());
		for(i=1;i<=n;i++){
			orderpage.click().click();
			homepage.explicitwait(orderpage.getprice());
			
		}

		int ans=Integer.parseInt(a.substring(1).split("[.]")[0]);
		String a2=homepage.getTxt(orderpage.shipprice());
		int ans2=Integer.parseInt(a2.substring(1).split("[.]")[0]);
		
		int actual=(ans*(n+1))+ans2;
		
		//homepage.explicitwait(orderpage.getprice());
		Thread.sleep(4000L);
		String a1=orderpage.getprice().getText();
		int expect=Integer.parseInt(a1.substring(1).split("[.]")[0]);
		
		
	
	Assert.assertTrue(actual==expect);
	}
}
