package selenium_practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test33 {

	WebDriver driver;

	@BeforeTest
	public void openbrowser() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\hp\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		driver = new FirefoxDriver();
		// driver.get("https://www.google.com/");
		// driver.get("http://omayo.blogspot.com/2013/05/page-one.html");
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		//driver.switchTo().frame("iframe");
		
		//driver.findElement(By.xpath("/html/body/button"));
		
		
		

	}

	@Test(enabled = false)
	public void frame() throws InterruptedException {
		System.out.println("first frame is " + driver.switchTo().frame(1).getTitle());
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		System.out.println("second frame is " + driver.switchTo().frame("iframe2").getTitle());
//		System.out.println(driver.switchTo().frame("iframe2"));

	}
	@Test
	public void tr() throws InterruptedException {
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		//driver.switchTo().frame("iframecontainer");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/button")).click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		driver.switchTo().parentFrame();
		
	}

}
