package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {
	WebDriver driver;
	@Before
	public void launchBrowser() {
		
		//All of this code is Launching the browser line 15 to 20
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	 driver.get("https://objectspy.space/");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	
	}
	@Test
	public void learnLocators() {
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		//If element node is INPUT use .sendKeys. some has not INPUT then we have to use \\Robot class
		
	driver.findElement(By.name("lastname")).sendKeys("Tech");
		//driver.findElement(By.className("input-file")).sendKeys("C:\\Users\\sange\\Downloads\\rec-screen");
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		//driver.findElement(By.partialLinkText("TF-API")).click();
		//=============================================================================
		//CSSSelectors
		
		driver.findElement(By.cssSelector("input#sex-1")).click();
		driver.findElement(By.cssSelector("input[id='exp-2']")).click();
		
		driver.findElement(By.cssSelector("input[name='exp'][id='exp-2']")).click();
		
	//==========================================================================================	
		//XPath
		
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("work is fun in telecom");
		driver.findElement(By.xpath("//input[@id='profession-1']")).click();
		driver.findElement(By.xpath("//Strong[text()='Link Test : New Page']")).click();
		
		
	}
}
