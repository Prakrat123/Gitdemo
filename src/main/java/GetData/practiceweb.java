package GetData;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page.GetAppManifestResponse;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.xjc.Driver;

import io.netty.util.Timeout;

public class practiceweb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\hp\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

//		driver.get("https://www.google.com/");
//		Thread.sleep(1200);
//		System.out.println("This the name of our tile " + driver.getTitle());
//		String str = driver.getWindowHandle();
//		System.out.println("window name is " + str);
//		driver.navigate().to("http://omayo.blogspot.com/2013/05/page-one.html");
//		driver.navigate().back();
//		Thread.sleep(1200);
//		driver.close();
		System.out.println("+++++++++++++++++++++++++++++++++++");
		System.out.println("First code is here");
		driver.get("http://omayo.blogspot.com/2013/05/page-one.html");
//		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("username");
//		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("password");
//		
//		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("password");//button[@type='button']
//		WebElement we = driver.findElement(By.xpath("//button[@type='button']"));
//		System.out.println(we.getText());
//		Thread.sleep(1000);
//		we.click();

		// Dropdown
		// Select sc = new Select(driver.findElement(By.id("multiselect1")));
//	
//	sc.selectByValue("Swift");
//	Thread.sleep(2000);
//	sc.selectByVisibleText("Hyundai");
//	sc.selectByValue("Hyundaix");

//		Select sc1 = new Select(driver.findElement(By.id("drop1")));
//		List<WebElement> dp11 = sc.getOptions();
//
//		for (int i = 0; i < dp11.size(); i++) {
//			System.out.println("Drop one value   " + dp11.get(i).getText());
//		}
//		System.out.println("+++++++++++++++++++++++++++++++++++");
//	sc1.selectByIndex(3);
//	
//	Thread.sleep(2000);
//	sc1.selectByValue("ghi");
//	Thread.sleep(4000);
//	sc1.selectByVisibleText("doc 3");

//	List<webelements> = driver.findElements(sc);
//		Thread.sleep(2000);
//
//		List<WebElement> dp1 = sc1.getOptions();
//
//		for (int i = 0; i < dp1.size(); i++) {
//			System.out.println("Drop one value2222    " + dp1.get(i).getText());
//		}
//
//		WebElement al1 = driver.findElement(By.id("alert1"));
//		al1.click();
//		Thread.sleep(3000);
//		
//		
//		
//		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		Thread.sleep(3000);
//		alert.getText();
//		Thread.sleep(3000);
//		driver.close();

		System.out.println("+++++++++++++++++++++++++++++++++++");

//		WebElement rd1 = driver.findElement(By.xpath("//*[@type='radio']"));
//		rd1.click();
//		System.out.println(rd1.isSelected());
//		System.out.println(rd1.getText());
//
//		Thread.sleep(2000);// *[@type='checkbox' and @id='checkbox1']
//		WebElement rd2 = driver.findElement(By.xpath("//*[@id='radio2']"));
//		// rd2.click();
//		System.out.println(rd2.isSelected());
//		System.out.println(driver.findElements(By.xpath("//*[@type='radio']")).size());
//		System.out.println("+++++++++++++++++++++++++++++++++++");

//		WebElement chkbox = driver.findElement(By.xpath("//*[@type='checkbox' and @id='checkbox2']"));
//
//		chkbox.click();
//		Thread.sleep(2000);
//		WebElement chkbox1 = driver.findElement(By.xpath("//*[@type='checkbox' and @id='checkbox1']"));
//		System.out.println(chkbox1.isSelected());
//		chkbox1.click();
		System.out.println("+++++++++++++++++++++++++++++++++++");

		System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());
		List<WebElement> kl = driver.findElements(By.xpath("//*[@type='checkbox']"));
		for (int i = 0; i < kl.size(); i++) {
			kl.get(i).click();
			System.out.println(kl.get(i).getAttribute("value"));
		}

	}

	// To get text

}
