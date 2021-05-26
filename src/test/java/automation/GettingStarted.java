package automation;
//package automation;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Test {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("HI");
//		WebDriver driver= new ChromeDriver();
//
//	}
//	@org.testng.annotations.Test
//	public void launchbrowser(){
//		//WebDriver driver= new ChromeDriver();
//		System.out.println("HI");
//	}
//
//}


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class GettingStarted {
  @Test
  public void testGoogleSearch() throws InterruptedException {
    // Optional. If not specified, WebDriver searches the PATH for chromedriver.
    System.setProperty("webdriver.chrome.driver", "D:\\testenvironment\\automation\\driver\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://automationpractice.com/index.php");
    Thread.sleep(5000);  // Let the user actually see something!
    WebElement contactUs = driver.findElement(By.xpath("//*[@id='contact-link']/a"));
    contactUs.click();
    Thread.sleep(5000); 
    Select subjectHeading = new Select(driver.findElement(By.id("id_contact")));
    subjectHeading.selectByIndex(1);
    Thread.sleep(5000); 
    WebElement email= driver.findElement(By.id("email"));
    email.sendKeys("srinivas@gmail.com");
    Thread.sleep(5000); 
    WebElement order= driver.findElement(By.id("id_order"));
    order.sendKeys("srin2345");
    Thread.sleep(5000); 
    WebElement fileUpload= driver.findElement(By.id("fileUpload"));
    fileUpload.sendKeys("D:\\1.txt");
    Thread.sleep(5000); 
    WebElement message= driver.findElement(By.id("message"));
    message.sendKeys("Hi this is srinivas"); 
    Thread.sleep(5000); 
    
    WebElement submit= driver.findElement(By.id("submitMessage"));
    submit.submit();
    Thread.sleep(5000); 
    driver.quit();
  }
  public static void main(String[] args){
	  System.setProperty("webdriver.chrome.driver", "D:\\testenvironment\\automation\\driver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	    driver.get("http://www.google.com/");
  }
  
}
