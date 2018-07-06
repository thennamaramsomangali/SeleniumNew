package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AACreateLead {

	public static void main(String[] args) throws InterruptedException  {

		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
		/*ChromeOptions op=new ChromeOptions();
		op.addArguments("disable-infobars");
		
		op.addArguments("start-maximized");
		
		ChromeDriver driver = new ChromeDriver(op);*/
		
		ChromeDriver driver = new ChromeDriver();
		
		/*System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();	*/
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		driver.get("http://leaftaps.com/opentaps");

		//login		
		
		/*WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
		*/
		Thread.sleep(3000);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		
		/*driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementsById("password");
		driver.findElement(By.id("password"));
		driver.findElements(By.id("password"));*/
		
		driver.findElementByClassName("decorativeSubmit").click();		




		//Thread.sleep(5000);	
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();

		//create lead
		driver.findElementByLinkText("Create Lead").click();
		WebElement ele = driver.findElementById("createLeadForm_companyName"); //.sendKeys("TCS \n cts");
		
		
		
		String myText = "first line\nsecond line";
		myText = myText.replace("\n", Keys.chord(Keys.SHIFT, Keys.ENTER));
		ele.sendKeys(myText);
		
		
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
		 

	}

}
