package HwQnsWeek2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDay4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.How to select value in dropdown?

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();

		//Load the URL
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");

		//maximize the window
		driver.manage().window().maximize();

		//Click Sign up
		driver.findElementByLinkText("Sign up").click();

		//Select Country "India" by using value
		WebElement country =driver.findElementById("userRegistrationForm:countries");
		Select dropdown=new Select(country);
		dropdown.selectByValue("94");

		// Close Browser
		driver.close();

	}

}
