package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class NineMethods {

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
		/*driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();	*/	

		String titlename = driver.getTitle();
		System.out.println(titlename); //print Leaftaps - TestLeaf Automation Platform
		if(driver.getTitle().contains("TestLeaf")) System.out.println("OK"); else System.out.println("Not OK");
		String currentUrl = driver.getCurrentUrl(); 
		System.out.println(currentUrl);  //print http://leaftaps.com/opentaps/control/main
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);  
		

		//driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		//System.out.println(driver.findElementByName("username").getAttribute("value")); //get attribute value of "Get default text entered"  ans:TestLeaf

		driver.get("http://testleaf.herokuapp.com/pages/Link.html"); 

		System.out.println(driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href")); //http://testleaf.herokuapp.com/pages/Button.html

		driver.get("http://testleaf.herokuapp.com/pages/Button.html");

		System.out.println(driver.findElementById("color").getCssValue("background-color")); //rgba(144, 238, 144, 1)
		System.out.println(driver.findElementById("color").getText()); //What color am I?

		System.out.println(driver.findElementById("color").getLocation().getX()); //240
		System.out.println(driver.findElementById("color").getSize().getWidth()); //122
		System.out.println(driver.findElementById("color").getTagName()); //button

		System.out.println(driver.findElementById("color").isDisplayed()); //true
		//System.out.println(driver.findElementById("color1").isDisplayed()); //no such element

		driver.get("http://testleaf.herokuapp.com/pages/Edit.html"); 


		System.out.println(driver.findElementByName("username").isEnabled()); //true
		System.out.println(driver.findElementByXPath("//*[@id='contentblock']/section/div[5]/div/div/input").isEnabled()); //false


		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html"); 
		System.out.println(driver.findElementByXPath("//*[@id='contentblock']/section/div[1]/input[1]").isSelected()); //selected
		System.out.println(driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/input").isSelected()); //not selected

	}


}


