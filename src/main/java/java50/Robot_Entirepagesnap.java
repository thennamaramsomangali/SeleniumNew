package java50;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Robot_Entirepagesnap {


		// TODO Auto-generated method stub
		//You can always get the screenshot of entire page using Robot. I just tried it out, this code is working:

			/*WebDriver driver;
			 
			 public void init() throws Exception {
			 driver = new FirefoxDriver();
			 driver.get("http://www.automationbykrishna.com");
			 }
			 
			 @Test
			 public void snap() throws AWTException, IOException {
			 WebElement element = driver.findElement(By.xpath("your xpath"));
			 // Trigger the alert
			 element.click();
			 BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			 ImageIO.write(image, "png", new File(".\\ScreenShot\\Test.png"));
			 driver.switchTo().alert().accept();
			 }*/
		
		

			@Test
			public void takeSnap() throws HeadlessException, AWTException, IOException, InterruptedException{
				
				//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();	
				driver.manage().window().maximize();
				driver.get("https://www.irctc.co.in/eticketing/forgotPassword.jsf");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
				driver.findElementById("forgot_passwrd:checkDetails1").click();
				Thread.sleep(1000);
				
				// take snap		
				BufferedImage image = new Robot().createScreenCapture
				(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
				
				ImageIO.write(image, "png", new File("./data/Alert.png"));
	}

}
