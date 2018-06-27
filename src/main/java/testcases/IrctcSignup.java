package testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignup {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		/*System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();*/


		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementById("userRegistrationForm:userName").sendKeys("ganesh");
		driver.findElementById("userRegistrationForm:password").sendKeys("babu");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("babu");
		WebElement securityqn = driver.findElementById("userRegistrationForm:securityQ");
		Select dd=new Select(securityqn);
		dd.selectByValue("0");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("roshy");
		driver.findElementById("userRegistrationForm:prelan");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("ganesh");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("babu");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("ts");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		WebElement date = driver.findElementById("userRegistrationForm:dobDay");
		Select d=new Select(date);
		d.selectByVisibleText("20");
		WebElement month = driver.findElementById("userRegistrationForm:dobMonth");
		Select m=new Select(month);
		m.selectByVisibleText("MAR");
		WebElement year = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select y=new Select(year);
		y.selectByVisibleText("1991");
		WebElement occupation= driver.findElementById("userRegistrationForm:occupation");	
		Select oc=new Select(occupation);
		oc.selectByVisibleText("Private");
		driver.findElementById("userRegistrationForm:uidno").sendKeys("123456789101");
		WebElement country = driver.findElementById("userRegistrationForm:countries");
		Select coun=new Select(country);
		coun.selectByValue("94");
		driver.findElementById("userRegistrationForm:email").sendKeys("ganeshbabuts26@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9043607727");
		//driver.findEssslementById("userRegistrationForm:nationalityId").sendKeys("");
		WebElement nationality = driver.findElementById("userRegistrationForm:nationalityId");
		Select nat=new Select(nationality);
		nat.selectByIndex(1);
		driver.findElementById("userRegistrationForm:address").sendKeys("no4 v n st");
		driver.findElementById("userRegistrationForm:street").sendKeys("mgr road");
		driver.findElementById("userRegistrationForm:area").sendKeys("shollinganallur");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600119",Keys.TAB);
		Thread.sleep(10000);
		WebElement city = driver.findElementById("userRegistrationForm:cityName");
		Select citi=new Select(city);
		citi.selectByVisibleText("Kanchipuram");
		Thread.sleep(10000);
		WebElement postoffice = driver.findElementById("userRegistrationForm:postofficeName");
		Select po=new Select(postoffice);
		po.selectByIndex(2);
		driver.findElementById("userRegistrationForm:landline").sendKeys("04425628956");

	}

}
