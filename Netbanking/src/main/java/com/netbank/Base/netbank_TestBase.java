package com.netbank.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.netbank.Utilities.Testutil;

public class netbank_TestBase {
	
	public static WebDriver driver;
	
	public static Properties prop;
	
public netbank_TestBase() throws IOException {
		
		prop=new Properties();
		
		FileInputStream file=new FileInputStream("C:\\Users\\niralivyankat.shirs\\JavaAutomation\\Netbanking\\src\\main\\java\\com\\netbank\\config\\netbank_properties");
	         
		prop.load(file);
	
	}
	
	
	
public void Initialization() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\niralivyankat.shirs\\JavaAutomation\\InternetBanking\\Driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGELOAD_TIMEOUT,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICITLY_WAIT,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("Url"));
				
		
	}
	
	
}
