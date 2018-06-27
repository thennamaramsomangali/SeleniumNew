package testcases;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AADeleteLead {
	
	@Test
	public  void deleteLead() throws InterruptedException {
		

		//launching chrome browser.
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/");

		Thread.sleep(4000);

		//login 

		driver.findElementById("username").sendKeys("DemoSalesManager");

		driver.findElementById("password").sendKeys("crmsfa");


		Thread.sleep(4000);

		driver.findElementByClassName("decorativeSubmit").click();


		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();

		Thread.sleep(4000);
		//Create lead.

		driver.findElementByLinkText("Create Lead").click();

		driver.findElementById("createLeadForm_companyName").sendKeys("cisco");

		driver.findElementById("createLeadForm_firstName").sendKeys("Bala");

		driver.findElementById("createLeadForm_lastName").sendKeys("PN");
		
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9524045613");
		
		driver.findElementByClassName("smallSubmit").click();

		
       //find lead using phone number
		
		driver.findElementByLinkText("Leads").click();

		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//span[text()='Phone']").click();
		
		driver.findElementByName("phoneNumber").sendKeys("9524045613");
		
		driver.findElementByLinkText("Find Leads").click();
		
		//Delete
		
		WebElement leadId = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		
		String id=leadId.getText();
		
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
		driver.findElementByLinkText("Delete").click();
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		// Verify if lead is deleted
		
		driver.findElementByXPath("//input[@name='id']").sendKeys(id);
		
	
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		/*WebElement outputRecords = driver.findElementByXPath("//div[text()='No records to display']");
		
		if( outputRecords.isDisplayed())
			System.out.println("Deleted properly");
		
		
		driver.quit();
		*/
		


	}


}
