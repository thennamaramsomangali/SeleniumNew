package testcases;

import org.openqa.selenium.chrome.ChromeDriver;

public class ExploreXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
	/*	//xpath
		//===(//button[@class='x-btn-text'])[7]  //use collections if within 5
		//button[text()='Find Leads']
		//===(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a
		//div[@unselectable='on']/ancestor::table[1]
				
		(//button[@class='x-btn-text'])[7]  //use collections if within 5

		//button[text()='Find Leads']
		(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a
		//div[@unselectable='on']/ancestor::table[1]
		//a[text()='10489']
		//div[@class='x-form-item x-tab-item'][2]//input
		//button[text()='Find Leads']
		(//input[@name='firstName'])[3]
		//input[@class=' x-form-text x-form-field ']
		//input[contains(@class,' x-form-text x-form-field ')]
		//input[contains(@name,'emailAddress')]		
		*/

	}

}
