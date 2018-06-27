package testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingBrokenLinks {

	@Test
	public void findLinks() throws IOException {

		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com");

		List<WebElement> listOfLink = driver.findElements(By.tagName("a"));

		for (WebElement eachLink : listOfLink) {

			String url = eachLink.getAttribute("href");
			
			try {
				URL linkUrl=new URL(url);

				HttpURLConnection urlConnect =(	HttpURLConnection) linkUrl.openConnection();

				urlConnect.setConnectTimeout(3000);

				urlConnect.connect();

				if(urlConnect.getResponseCode()==200)
					System.out.println(url+"  OK");
				else
					System.out.println(url+"  broken");


			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(url+" Is not found");
			} 

		}



	}
}

