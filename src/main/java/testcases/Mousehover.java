package testcases;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wdMethods.SeMethods;

public class Mousehover extends SeMethods {

	@Test
	
	public void run() throws InterruptedException
	
	{
		startApp("chrome", "https://www.flipkart.com/");
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		
		WebElement elec = locateElement("xpath", "//span[text()='Electronics']");
		WebElement moto = locateElement("xpath", "//span[text()='Motorola']");
		WebElement parentSpan = locateElement("xpath", "//ul[@class='QPOmNK'][1]");
		
		
		Actions act=new Actions(driver);
		act.moveToElement(elec).release().perform();
		
		Thread.sleep(7000);
		//act.click(moto).perform();
		
		List<WebElement> listofwebelements = parentSpan.findElements(By.tagName("span"));
		for (WebElement eachOption : listofwebelements) {
			String text = eachOption.getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("Moto X4 6GB"))
				act.click(eachOption).perform();
			
			
		}
		
	}
}
	

