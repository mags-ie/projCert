package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AboutPage {
	
	@Test
	public void verify() {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","chromedriver");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://34.67.115.12:8008/");
			driver.findElementByLinkText("About Us").click();
			String x = driver.findElementById("PID-ab2-pg").getText();
			System.out.println(x);
			Assert.assertTrue(x.contains("Lorem Ipsum Dipsum is simply dummy text"));
			driver.close();
			
	}
}

