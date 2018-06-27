package testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lists {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");

		List<WebElement> allbuttons = driver.findElementsByTagName("button");
		int count = allbuttons.size();
		System.out.println(count);
		Thread.sleep(5000);
		for (WebElement eachbutton : allbuttons) {
			System.out.println(eachbutton.getText());
		}
		WebElement lastbutton = allbuttons.get(0);
		lastbutton.click();



	}



}


