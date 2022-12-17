package com.actitime.testscript;

import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.LoginPage;
import com.actitime.pom.Task;

public class CreateCustomer extends BaseClass {
	@Test
	public void createCustomer() throws InterruptedException 
	{
		driver.get("https://demo.actitime.com/");
		LoginPage p=new LoginPage(driver);
		p.getUntbx().sendKeys("admin");
		p.getPwtbx().sendKeys("manager");
		p.getLgBtn().click();
		Thread.sleep(4000);
		Task t=new Task(driver);
		t.getAtbg().click();
		t.getAbbg().click();
	}

}
