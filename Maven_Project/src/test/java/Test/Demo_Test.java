package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo_Test {

	    @Test
        public void demo() {

		System.out.println("Ganapati Bappa Morya");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\niralivyankat.shirs\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

          }

}
