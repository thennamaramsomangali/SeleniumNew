package testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class AAMergeLead {

	public static void main(String[] args) throws InterruptedException {
		
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		/*System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();*/		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		driver.get("http://leaftaps.com/opentaps");

		//login		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();		

		//Thread.sleep(5000);	
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		
		driver.findElementByXPath("//table[@name='ComboBox_partyIdFrom']/following::a/img").click();
		
		Set<String> allWindowsSet = driver.getWindowHandles();
		List<String> allWindowList=new ArrayList<>();
		allWindowList.addAll(allWindowsSet);  //adding set to the list to use index
		
		
		driver.switchTo().window(allWindowList.get(2));
		
		driver.findElementByXPath("//input[@name='id']").sendKeys("11415");
		driver.findElementByXPath("//button[@class='x-btn-text']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='11415']").click();
		
		
		Set<String> allWindowsSet1 = driver.getWindowHandles();
		List<String> allWindowList1=new ArrayList<>();
		allWindowList1.addAll(allWindowsSet1);  //adding set to the list to use index
		
		driver.switchTo().window(allWindowList1.get(0));
		
		driver.findElementByXPath("//table[@name='ComboBox_partyIdTo']/following::a/img").click();
		
		Set<String> allWindowsSet2 = driver.getWindowHandles();
		List<String> allWindowList2=new ArrayList<>();
		allWindowList2.addAll(allWindowsSet2);  //adding set to the list to use index
		
		driver.switchTo().window(allWindowList2.get(2));
		
		driver.findElementByXPath("//input[@name='id']").sendKeys("11417");
		driver.findElementByXPath("//button[@class='x-btn-text']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='11417']").click();
		
		Set<String> allWindowsSet3 = driver.getWindowHandles();
		List<String> allWindowList3=new ArrayList<>();
		allWindowList3.addAll(allWindowsSet3);  //adding set to the list to use index
		
		driver.switchTo().window(allWindowList3.get(0));
		
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Merge']").click();
		
		driver.switchTo().alert().accept();
		
		driver.close();
	}

}
