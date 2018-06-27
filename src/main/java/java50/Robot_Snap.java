package java50;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Robot_Snap {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
		 
		driver.manage().window().maximize();
		 
		// This step will result in an alert on screen
		WebElement element = driver.findElement(By.xpath("//*[@id='content']/p[11]/button"));
		 
		//Java Script Executor for click the element
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		 
		Thread.sleep(2000);
		 
		// Press the key combination of (Windows + PrintScreen) by using Robot Class
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_WINDOWS);
		rb.keyPress(KeyEvent.VK_PRINTSCREEN);
		rb.keyRelease(KeyEvent.VK_PRINTSCREEN);
		rb.keyRelease(KeyEvent.VK_WINDOWS);

	}

}
