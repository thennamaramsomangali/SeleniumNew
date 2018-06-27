package testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExceptionHandling {
	
	public static void main(String[] args) throws NoSuchElementException {
				
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		//open flipkart site

		driver.get("https://www.flipkart.com");

		//close the login window

		driver.getKeyboard().sendKeys(Keys.ESCAPE);


		WebElement tvAppliance;
		try {
			tvAppliance = driver.findElementByXPath("//span[text()='TV & Appliances']");  // expected: //span[text()='TVs & Appliances']
			Actions builder =new Actions(driver);
			builder.moveToElement(tvAppliance).release().perform();

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			
		System.out.println("TV appliance element is not found");
		}
		
		try {
			tvAppliance = driver.findElementByXPath("//span[text()='TV & Appliances']");
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("ele is not found");
		}

		 System.out.println("came out of block");
	}

}
