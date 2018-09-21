package demo;

import java.io.File;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo 
{
	@Test
	public void m()
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\kiran selinium\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.seleniumhq.org/download/");
		  driver.manage().window().maximize();
		  System.out.println("getout");
		  System.out.println("shut up");
	}

}
