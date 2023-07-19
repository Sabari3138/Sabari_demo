package com.objectproperty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.BaseMethods;


public class ObjectRepo extends BaseMethods {
	public void ObjectRepository () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@placeholder='Enter your name']")
	private WebElement userName;
	
	@FindBy(id="(//input[@placeholder='Enter your email'])[1]")
	private WebElement userMail;

	@FindBy(xpath="//input[@placeholder='Enter your phone']")
	private WebElement userNumber;
	
	@FindBy(xpath ="//textarea[@placeholder='Briefly Describe Yourself']")
	private WebElement userSelf;
	
	@FindBy(xpath ="(//button[text()='APPLY NOW']")
	private WebElement applyButton;
	
	@FindBy(xpath ="//input[@id='inputFile']")
	private WebElement file;


	public WebElement getFile() {
		return file;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getUserMail() {
		return userMail;
	}

	public WebElement getUserNumber() {
		return userNumber;
	}

	public WebElement getUserSelf() {
		return userSelf;
	}

	public WebElement getApplyButton() {
		return applyButton;
	}

		
	

	}

	


