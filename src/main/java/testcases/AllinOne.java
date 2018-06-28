package testcases;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.internal.runners.model.EachTestNotifier;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class AllinOne {
	RemoteWebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

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

		//create lead
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Ganesh");
		driver.findElementById("createLeadForm_lastName").sendKeys("Ts");

		/*WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd=new Select(source);
		dd.selectByVisibleText("Employee");  //select Employee alone
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("ganeshbabuts26@gmail.com");*/
		
		//WebElement findElementByTagName = driver.findElementByTagName("select");
		List<WebElement> listElements = driver.findElements(By.tagName("select"));
		
		for (WebElement eachElement : listElements) {
			
			//System.out.println(eachElement.getText());
			String text = eachElement.getText();
			if (text.equalsIgnoreCase("employee")) eachElement.click();
		}
		
		
		
		//take no of rows/columns and select date alone

		driver.findElementById("createLeadForm_birthDate-button").click();
		WebElement table = driver.findElementByXPath("//div[@unselectable='on']/ancestor::table[1]");
		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		int rowcount = allrows.size();
		System.out.println(rowcount);	
		WebElement columns = allrows.get(3);
		List<WebElement> allcolumns = columns.findElements(By.tagName("td"));
		int columncount = allcolumns.size();
		System.out.println(columncount);
		allcolumns.get(1).click();

		driver.findElementByName("submitButton").click();
		Thread.sleep(2000);




		//print all options in dd

		/*List<WebElement> alloptions = dd.getOptions();
		for (WebElement eachoption:alloptions) {
			String text=eachoption.getText();
			System.out.println(text);*/

		//edit lead
		driver.findElementByLinkText("Edit").click();	//click edit after submit	

		driver.findElementById("updateLeadForm_firstNameLocal").sendKeys("abc");
		driver.findElementById("updateLeadForm_personalTitle").sendKeys("analyst");
		driver.findElementById("updateLeadForm_lastNameLocal").sendKeys("xyz");
		driver.findElementByName("submitButton").click();

		//find lead

		//driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		//driver.findElementByXPath("//div[@class='x-form-item x-tab-item']//input").sendKeys("10494");
		driver.findElementByXPath("//div[@class='x-form-item x-tab-item'][2]//input").sendKeys("Ganesh");
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		//driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		//driver.findElementByXPath("//a[text()='10549']").click();
		//driver.findElementByXPath("//a[text()='Delete']").click();
		//driver.findElementByXPath("//div[@class='frameSectionExtra']/a[4]").click();

		//duplicate id

		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[contains(@name,'emailAddress')]").sendKeys("ganeshbabuts26@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.findElementByXPath("//a[text()='11415']").click();
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();

		driver.findElementByName("submitButton").click();

		//take snaps

		File src=driver.getScreenshotAs(OutputType.FILE);
		File desc=new File("./snaps/img1.png");
		FileUtils.copyFile(src, desc);


	}

}





