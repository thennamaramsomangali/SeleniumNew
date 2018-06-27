package java50;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadUsingSendKeys {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();


		driver.get("http://www.leaftaps.com/opentaps");	// Fetching url using .get(Strings) method
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();	
		driver.findElementByLinkText("Upload Leads").click();
		//driver.navigate().to("http://www.leaftaps.com/crmsfa/control/uploadLeadsForm");
		//driver.findElementById("uploadedFile").sendKeys("‪C:\\Users\\Ganeshbabu TS\\Desktop\\write.txt");
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./img.png");
		FileUtils.copyFile(src, dest);
		driver.findElementByXPath("//input[@type='submit']").click();

	}
}