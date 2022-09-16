package UnitTest;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumTestCase2 {
	private static EdgeDriver driver;
 	WebElement element;
 	
 	
 	@BeforeClass
 	public static void openBrowser() {
 		driver =new EdgeDriver();
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 	}
 	
 	@Test
 	public void valid_userCredential() {
 		 System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
 	     driver.get("https://www.gmail.com");	
 	    driver.findElement(By.xpath(".//input[@class=\"whsOnd zHQkBf\"]")).sendKeys("lrajkumar01@gmail.com");
 	   driver.findElement(By.xpath(".//input[@class=\"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b\"]")).click(); 
 	  driver.findElement(By.xpath(".//input[@type=\"password\"]")).sendKeys("J_l_@2__2");
 	 driver.findElement(By.xpath(".//input[@class=\"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b\"]")).click();
 	  //driver.findElement(By.xpath(".//input[@class=\"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b\"]")).click();
 	   
 	}
 	
 }
