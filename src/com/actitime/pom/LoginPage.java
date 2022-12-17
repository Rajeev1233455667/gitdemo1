package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUntbx() {
		return untbx;
	}

	public void setUntbx(WebElement untbx) {
		this.untbx = untbx;
	}

	public WebElement getPwtbx() {
		return pwtbx;
	}

	public void setPwtbx(WebElement pwtbx) {
		this.pwtbx = pwtbx;
	}

	public WebElement getLgBtn() {
		return lgBtn;
	}

	public void setLgBtn(WebElement lgBtn) {
		this.lgBtn = lgBtn;
	}
	
}

