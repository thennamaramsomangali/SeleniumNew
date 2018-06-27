package testcases;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import junit.framework.Assert;
import wdMethods.SeMethods;

public class Paypal extends SeMethods {
	@Test
	public  void main() throws InterruptedException {
		// TODO Auto-generated method stub
		
		startApp("chrome", "https://www.paypal.com");
		WebElement signup = locateElement("signup-button");
		signup.click();
		WebElement radio = locateElement("radio-personal");
		verifySelected(radio);
		Assert.fail();
		WebElement nextbutton = locateElement("link", "Next");
		nextbutton.click();
		WebElement country = locateElement("country");
		selectDropDownUsingText(country,"India");
		WebElement emailid = locateElement("email");
		type(emailid,"ganeshbabuts26@gmail.com");
		WebElement pwd = locateElement("password");
		type(pwd,"bzm667bzm667");
		WebElement confpwd = locateElement("confirmPassword");
		type(confpwd,"bzm667bzm6671");
		WebElement nextbutton1 = locateElement("link", "Next");
		click(nextbutton1);
		
		
		/*//ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.paypal.com");
		driver.findElementById("signup-button").click();
		boolean selected = driver.findElementById("radio-personal").isSelected();
		if (selected)
			System.out.println("Selected");
		else
			driver.findElementById("radio-personal").click();
		driver.findElementByLinkText("Next").click();
		Thread.sleep(3000);
		//WebElement country = driver.findElementById("country");
		Select dd=new Select(country);
		dd.selectByVisibleText("Australia");
		driver.findElementById("email").sendKeys("ganeshbabuts26@gmail.com");
		driver.findElementById("password").sendKeys("bzm667");
		driver.findElementById("confirmPassword").sendKeys("bzm667");
		driver.findElementById("_eventId_personal").click();
			*/
	}

}
