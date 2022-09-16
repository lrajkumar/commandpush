package UnitTest;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumTestCase {
	private static EdgeDriver driver;
 	WebElement element;

 @BeforeClass
 public static void openBrowser(){
     driver = new EdgeDriver();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	} 

 @Test
 public void valid_UserCredential(){

	 System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
     driver.get("https://github.com/login");	
     driver.findElement(By.xpath(".//input[@class=\"form-control input-block js-login-field\"]")).sendKeys("lrajkumar");
     //driver.findElement(By.id("Username")).sendKeys("lrajkumar");
     driver.findElement(By.xpath(".//input[@class=\"form-control form-control input-block js-password-field\"]")).sendKeys("Raj@jun94");
    // driver.findElement(By.id("login_field")).sendKeys("lrajkumar",Keys.ENTER);
     //driver.findElement(By.id("password")).sendKeys("Raj@jun94",Keys.ENTER);
     driver.findElement(By.xpath(".//input[@class=\"btn btn-primary btn-block js-sign-in-button\"]")).click();
//     try{
//		 element = driver.findElement (By.xpath(".//*[@id='account_login']/a"));
//	 }catch (Exception e){
//		}
//     Assert.assertNotNull(element);
//     System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
 }

 @Test
 public void inValid_UserCredential()
 {
	 System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	 driver.get("https://github.com/login");	
     driver.findElement(By.xpath(".//input[@class=\"form-control input-block js-login-field\"]")).sendKeys("lrajkumar012");
     driver.findElement(By.xpath(".//input[@class=\"form-control form-control input-block js-password-field\"]")).sendKeys("Raj@jun94"); 
     driver.findElement(By.xpath(".//input[@class=\"btn btn-primary btn-block js-sign-in-button\"]")).click();
 }
	 
	 
	 
	 
//     driver.get("https://www.github.com/login");	
//     driver.findElement(By.xpath(".//input[@class=\"sb_form_q\"]")).sendKeys("Github signin",Keys.ENTER);
//     driver.findElement(By.xpath(".//input[@id=\"login_field\"]")).sendKeys("lrajkumar01@");
//     driver.findElement(By.xpath(".//input[@id=\"password\"]")).sendKeys("Rajjun94");
//     driver.findElement(By.xpath(".//input[@class=\"btn btn-primary btn-block js-sign-in-button\"]/a")).sendKeys(Keys.ENTER);
//     try{
//		element = driver.findElement (By.xpath(".//*[@id='account_logout']"));
//     }catch (Exception e){
//		}
//     Assert.assertNotNull(element);
//     System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
// }

 @AfterClass
 public static void closeBrowser(){
	 //driver.quit();
 }
}
	
	
	
	
	
	
	
	
	


