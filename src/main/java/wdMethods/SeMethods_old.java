package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


public class SeMethods_old implements WdMethods{
	RemoteWebDriver driver;	
	int i = 1;


	public void startApp(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) 
		{
			//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();			
		} else if(browser.equalsIgnoreCase("ie")) 			
		{
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			//dismissAlert();

		}  else if(browser.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);      //opening the passed url
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The Browser is Launched");

	}

	public WebElement locateElement(String locator, String locValue) {
		switch (locator) {
		case "id":
			return	driver.findElementById(locValue);		
		case "name":
			return	driver.findElementByName(locValue);			
		case "class":
			return	driver.findElementByClassName(locValue);			
		case "link":
			return	driver.findElementByLinkText(locValue);			
		case "tag":
			return	driver.findElementByTagName(locValue);			
		case "xpath":
			return	driver.findElementByXPath(locValue);
		default:
			break;
		}
		return null;
	}

	public WebElement locateElement(String locValue) {
		return locateElement("id", locValue);
	}

	public void type(WebElement ele, String data) {
		ele.clear();
		ele.sendKeys(data);
		System.out.println("The Value is Entered");
		takeSnap();
	}

	public void click(WebElement ele) {
		ele.click();
		System.out.println("The Element Is Clicked");
		takeSnap();
	}

	public void clickWithNoSnap(WebElement ele) {

		ele.click();
		System.out.println("The Element Is Clicked");

	}

	public String getText(WebElement ele) {
		return ele.getText();

	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		Select dropdown=new Select(ele);
		dropdown.selectByVisibleText(value);
		System.out.println("dropdown is selected with"  +value);
		takeSnap();




	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		Select dropdown1=new Select(ele);
		dropdown1.selectByIndex(index);
		System.out.println("dropdown is selected with"  +index);
		takeSnap();
	}

	/*public void selectCalender() {

	}*/

	public boolean verifyTitle(String expectedTitle) {

		if(driver.getTitle().contains(expectedTitle))
			return true;
		else

			return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {

		if (getText(ele).equals(expectedText)){
			System.out.println(getText(ele)+ "is matched");
			takeSnap();
		}
		else
			System.out.println(getText(ele)+ "is not matched");
	}

	public void verifyPartialText(WebElement ele, String expectedText) {


	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {


	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {


	}

	public void verifySelected(WebElement ele) {


	}

	public void verifyDisplayed(WebElement ele) {


	}

	public void switchToWindow(int index) {
		//String windowHandle = driver.getWindowHandle();

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList=new ArrayList<String>();
		windowList.addAll(windowHandles);
		String selectedWindow = windowList.get(index);
		driver.switchTo().window(selectedWindow);
		System.out.println(driver.getTitle());

	}

	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
		System.out.println("switched to" +ele);
		takeSnap();


	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
		System.out.println("alert accepted");


	}

	public void dismissAlert() {

		driver.switchTo().alert().dismiss();
		System.out.println("alert dismissed");

	}

	public String getAlertText() {
		String alertText = driver.switchTo().alert().getText();
		return alertText;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		driver.close();


	}

	@Override							//?
	public void closeAllBrowsers() {


	}

	@Override
	public void escapeWindow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseHover() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClick() {
		// TODO Auto-generated method stub
		
	}

	


}
