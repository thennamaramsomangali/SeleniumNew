package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AADuplicateLead {

	public static void main(String[] args) {

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

		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd=new Select(source);
		dd.selectByVisibleText("Employee");  //select Employee alone
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("ganeshbabuts26@gmail.com");

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

		//duplicate id

		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[contains(@name,'emailAddress')]").sendKeys("ganeshbabuts26@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.findElementByXPath("//a[text()='11415']").click();
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();

		driver.findElementByName("submitButton").click();

	}

}
