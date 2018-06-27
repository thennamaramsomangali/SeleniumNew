package HwQnsWeek2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDay4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2. Write a simple code to uncheck the checked exception. (use http://testleaf.herokuapp.com/pages/checkbox.html)
				
				// Launch browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();

				// load url
				driver.get("http://testleaf.herokuapp.com/");
				
				// implicitwait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//click Checkbox link
				driver.findElementByLinkText("Checkbox").click();

				// Identify the element and store
				//WebElement checkbox=driver.findElementByXPath("//*[@id='contentblock']/section/div[1]/input[1]");
				
				WebElement checkbox=driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[2]/input");

				//verify check box is selected or not
				if (checkbox.isSelected()) 
				{
					System.out.println("The check box is selected already");
					checkbox.click();
					System.out.println("The check box is deselected now");
				}
				else
					System.out.println("The check box is not selected");
				
				//close browser
				driver.close();
	}

}
