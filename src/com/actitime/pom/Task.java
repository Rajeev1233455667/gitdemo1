package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task {

@FindBy(xpath="//a[@class='content tasks']")
private WebElement atbg;
@FindBy(xpath="//div[text()='Add New']")
private WebElement abbg;
public Task(WebDriver driver) {
	PageFactory.initElements(driver, this);
	// TODO Auto-generated constructor stub
}
public WebElement getAtbg() {
	return atbg;
}
public void setAtbg(WebElement atbg) {
	this.atbg = atbg;
}
public WebElement getAbbg() {
	return abbg;
}
public void setAbbg(WebElement abbg) {
	this.abbg = abbg;
}

}

