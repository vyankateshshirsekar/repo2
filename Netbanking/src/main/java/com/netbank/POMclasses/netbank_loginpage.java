package com.netbank.POMclasses;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.netbank.Base.netbank_TestBase;

public class netbank_loginpage extends netbank_TestBase {
	
public netbank_loginpage() throws IOException  {
		
		PageFactory.initElements(driver,this);
	} 
    	
    	@FindBy(name="uid")
         WebElement username;
    	
    	@FindBy(name="password")
    	 WebElement password;
    	
    	@FindBy(xpath="//input[@name='btnLogin']")
    	 WebElement loginbtn;
    	
    	@FindBy(xpath="//a[contains(text(),'New Customer')]")
    	WebElement customertext;
    	
    	
    	
    	
    	
    	public void Username(String user) {
    		
    		username.sendKeys(user);
    	}
    	
        public void Password(String pass) {
    		
        	password.sendKeys(pass);
    	}
        
        public void LoginBtn() {
    		
        	loginbtn.click();
        	
    	}    

}
