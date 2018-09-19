package progit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Apgit
{
	@Test
  public void m()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\kiran selinium\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
  }
	
}
