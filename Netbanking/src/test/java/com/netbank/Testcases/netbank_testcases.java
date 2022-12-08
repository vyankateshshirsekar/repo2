package com.netbank.Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.netbank.Base.netbank_TestBase;
import com.netbank.POMclasses.netbank_loginpage;



public class netbank_testcases extends netbank_TestBase{
	
public netbank_testcases() throws IOException {
		
		super();
	}
	
	@BeforeMethod
	public void setup() {
		
		Initialization();
	}
	
	
	@Test
	public void LoginTest() throws IOException {
		
		netbank_loginpage nt=new netbank_loginpage();
		
		nt.Username(prop.getProperty("Username"));;
		
		
		nt.Password(prop.getProperty("Password"));
		
		nt.LoginBtn();
		
		
		
		
	}
	
	@AfterMethod
	public void Teardown() {
		
		driver.quit();
	}

}
