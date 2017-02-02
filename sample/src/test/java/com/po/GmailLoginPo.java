package com.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginPo {
	public  WebDriver driver=null;
	//PageFactory Concept 
	public GmailLoginPo(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
	}
	// To identify email field
	@FindBy(xpath="//input[@id='Email']")
	private WebElement email;
	public WebElement getEleEmail(){
		return email;
	}
	
	// To identify next button
	@FindBy(xpath="//input[@id='next']")
	WebElement nextButt;
	public WebElement getNextButt(){
		return nextButt;
	}
	
	// To identify password field
	@FindBy(xpath="//input[@id='Passwd']")
	WebElement pwd;
	
	public WebElement getPwd(){
		return pwd;
	}
	//To identify Signin Button
	@FindBy(xpath="//input[@id='signIn']")
	WebElement signInButt;
	public WebElement getSignInButt(){
		return signInButt;
	}

}
