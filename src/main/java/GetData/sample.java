package GetData;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		System.out.println("helloo git hub ");
		
		System.out.println("helloo git hub ");
		System.out.println("helldververgvrtbgrtoo git hub ");
		System.out.println("helloo givergvrtbgrtoo gitt hub1111111 ");
		System.out.println("helloo gitvergvrtbgrtoo git hub1111111 ");

		System.out.println("helloo git huvergvrtbgrtoo gitb111111 ");
		System.out.println("helloo git hub1111 ");
		System.out.println("helloo git hubvergvrtbgrtoo git111 ");
		System.out.println("helloo git hub1111111 ");
		
		
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//		driver.get("https://www.youtube.com/watch?v=bW43a3vOFjU");
//		System.out.println("Heelo world");
//
//		
		
//		//Setting system properties of ChromeDriver
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\demo\\src\\pojo\\chromedriver_win32 (1)//chromedriver.exe");
//
//		//Creating an object of ChromeDriver
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
//		//driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("helo");
//		driver.findElement(By.className("VfPpkd-vQzf8d")).click();

//		// Open ToolsQA web site
//				String appUrl = "https://www.DemoQA.com";
//				driver.get(appUrl);
//
//				// Click on Registration link
//				driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
//
//				// Go back to Home Page
//				driver.navigate().back();
//
//				// Go forward to Registration page
//				driver.navigate().forward();
//
//				// Go back to Home page
//				driver.navigate().to(appUrl);
//
//				// Refresh browser
//				driver.navigate().refresh();
//
//				// Close browser
//				driver.close();
	//	+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++==
//		 driver.get("http://demo.guru99.com/test/ajax.html");
//		    List<WebElement> elements = driver.findElements(By.name("name"));
//		    System.out.println("Number of elements:" +elements.size());
//
//		    for (int i=0; i<elements.size();i++){
//		      System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
//		    }
//			}
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	//TRadio and check box 
//		 driver.get("http://demo.guru99.com/test/radio.html");	
//		 
//		 //select radio button 
//		 WebElement rb1 = driver.findElement(By.id("vfb-7-1"));
//         rb1.click();
//         
//		 WebElement rb2 = driver.findElement(By.id("vfb-7-2"));
//		            rb2.click();
//		          
//		            
//		            WebElement option1 = driver.findElement(By.id("vfb-6-0"));							
//
//		            // This will Toggle the Check box 		
//		          //  option1.click();			
//
//		         		if (option1.isSelected()) {
//							System.out.println("toggle on  ");
//						} else {
//							System.out.println("toggle off  ");
//						}
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//		         		 String baseUrl = "http://demo.guru99.com/test/newtours/";
//		         		driver.get(baseUrl);           
//		                WebElement link_Home = driver.findElement(By.linkText("Home"));
//		                WebElement td_Home = driver
//		                        .findElement(By
//		                        .xpath("//html/body/div"
//		                        + "/table/tbody/tr/td"
//		                        + "/table/tbody/tr/td"
//		                        + "/table/tbody/tr/td"
//		                        + "/table/tbody/tr")); 
//	
//		                //----------------------------
		                //Launching the site.				
		                //Launching the site.				
		                driver.get("http://demo.guru99.com/popup.php");			
		            driver.manage().window().maximize();		
		                    		
		    driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			
		            		//href{@}
		            String MainWindow=driver.getWindowHandle();		
		            		System.out.println(driver.getPageSource());
		            // To handle all new opened window.				
		                Set<String> s1=driver.getWindowHandles();		
		            Iterator<String> i1=s1.iterator();		
		            		
		            while(i1.hasNext())			
		            {		
		                String ChildWindow=i1.next();		
		                		
		                if(!MainWindow.equalsIgnoreCase(ChildWindow))			
		                {    		
		                     
		                        // Switching to Child window
		                        driver.switchTo().window(ChildWindow);	                                                                                                           
		                        driver.findElement(By.name("emailid"))
		                        .sendKeys("gaurav.3n@gmail.com");                			
		                        
		                        driver.findElement(By.name("btnLogin")).click();			
		                                     
		    			// Closing the Child Window.
		                            driver.close();		
		                }	
		                driver.switchTo().window(MainWindow);	
		            }		
		            // Switching to Parent window i.e Main Window.
		                driver.switchTo().window(MainWindow);				
		        }
		    }