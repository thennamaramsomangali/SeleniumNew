package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFrames {

	public static void main(String[] args) throws InterruptedException {
		

		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		Alert myalert = driver.switchTo().alert();
		
		myalert.sendKeys("mann");
		myalert.accept();
		WebElement output = driver.findElementByXPath("//p[@id='demo']");
		String text = output.getText();

		System.out.println(text);

		if (text.contains("mann"))  System.out.println("OK");
		else
			System.out.println("NOT OK");

	}

}


