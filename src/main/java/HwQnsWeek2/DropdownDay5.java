package HwQnsWeek2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDay5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Load the URL
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		//maximize the window
		
		driver.findElementByLinkText("Sign up").click();
		WebElement country =driver.findElementById("userRegistrationForm:countries");
		//System.out.println(country);
		Select dropdown=new Select(country);
		List<WebElement> allob=dropdown.getOptions();
		//System.out.println(allob);
		for (WebElement eachop : allob) {			
		System.out.println(eachop.getText());
		}
		}
}

