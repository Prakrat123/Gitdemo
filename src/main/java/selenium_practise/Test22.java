package selenium_practise;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test22 {
	WebDriver driver;

	@BeforeTest
	public void openbrowser() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\hp\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		driver = new FirefoxDriver();
		// driver.get("https://www.google.com/");
		driver.get("http://omayo.blogspot.com/2013/05/page-one.html");
	}

	@Test(enabled = false)
	public void windowhandel() {
		System.out.println("kkkkkk");
		driver.quit();
	}

	@Test(enabled = false)
	public void windowhandelnew() throws InterruptedException {

		String window1 = driver.getWindowHandle();
	
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Set<String> setwindow = driver.getWindowHandles();
		Iterator<String> it = setwindow.iterator();
		Thread.sleep(2000);
		System.out.println(setwindow);
		System.out.println(setwindow.size());
		while (it.hasNext()) {
			String str5 = it.next();
			driver.switchTo().window(str5);
			Thread.sleep(2000);
			if (driver.getTitle().equalsIgnoreCase("Basic Web Page Title")) {
				Thread.sleep(2000);
				driver.close();
			}

		}
 
		driver.switchTo().window(window1);
		//WebElement we =  driver.findElement(By.className("dropbtn"));
	//driver.switchTo().defaultContent();


		
	
			
			
		}
	

	}
	

	
	
	

