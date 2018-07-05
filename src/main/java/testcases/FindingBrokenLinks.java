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

		driver.get("https://si.delta.com");

		List<WebElement> listOfLink = driver.findElements(By.tagName("a"));

		for (WebElement eachLinkhref : listOfLink) {

			String urlhref = eachLinkhref.getAttribute("href");



			try {
				URL linkUrl=new URL(urlhref);

				HttpURLConnection urlConnect =(	HttpURLConnection) linkUrl.openConnection();

				urlConnect.setConnectTimeout(3000);

				urlConnect.connect();

				if(urlConnect.getResponseCode()==200)
					System.out.println(urlhref+"  OK");
				else
					System.out.println(urlhref+"  broken");


			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(urlhref+" Is not found");
			} 

			/*for (WebElement eachLinkclass : listOfLink) {

				String urlclass = eachLinkclass.getAttribute("class");

			try {
				URL linkUrl=new URL(urlclass);

				HttpURLConnection urlConnect =(	HttpURLConnection) linkUrl.openConnection();

				urlConnect.setConnectTimeout(3000);

				urlConnect.connect();

				if(urlConnect.getResponseCode()==200)
					System.out.println(urlclass+"  OK");
				else
					System.out.println(urlclass+"  broken");


			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(urlclass	+" Is not found");
			}

		}*/



		}
	}
}

