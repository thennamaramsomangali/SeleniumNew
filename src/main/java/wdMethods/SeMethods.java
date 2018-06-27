package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{

	public RemoteWebDriver driver;
	int i = 1;
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver =new ChromeDriver();
				/*ChromeOptions op=new ChromeOptions();
				op.addArguments("disable-infobars");
				op.addArguments("start-maximized");
				new ChromeDriver();		*/	
			} else if (browser.equalsIgnoreCase("Firefox")){
				//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			} else {
				driver=new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The Browser is Launched");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println(browser+ "is not present");

		}

	}

	
	public WebElement locateElement(String locator, String locValue) {
		try {
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
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println(locator+" element not found");
		}

		finally {
			takeSnap();
		}

		return null;
	}

	public WebElement locateElement(String locValue) {
		WebElement locElement= null;
		try {
			locElement = locateElement("id", locValue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println(locValue+" element not found");

		}

		finally {
			takeSnap();
		}


		return locElement;
	}

	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("The Value is Entered");
			takeSnap();
		} catch (InvalidElementStateException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println(ele+ "element is not interactable");
		}
		finally {
			takeSnap();
		}

	}


	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("The Element Is Clicked");
			//takeSnap();
		} catch (InvalidElementStateException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println(ele+ "element is not interactable");	
		}
		finally {
			takeSnap();
		}
	}

	public void clickWithNoSnap(WebElement ele) {
		try {
			ele.click();
			System.out.println("The Element Is Clicked");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println(ele+ "element is not interactable");	
		}

	}

	public String getText(WebElement ele) {

		String elementText = null;

		elementText = ele.getText();

		return elementText;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			Select dropDown=new Select(ele);
			dropDown.selectByVisibleText(value);
			System.out.println(ele +"dropdown is selected with the "+value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();

			System.err.println(ele+" element is not present");
		}
		finally {
			takeSnap();
		}

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try {
			Select dropDown=new Select(ele);
			dropDown.selectByIndex(index);
			System.out.println(ele +"dropdown is selected with the "+index);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println(ele+" element is not present");
		}

		finally {
			takeSnap();
		}
	}

	public boolean verifyTitle(String expectedTitle) {

		if(driver.getTitle().contains(expectedTitle))
			return true;
		else
			return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {

		if(getText(ele).equals(expectedText)) {
			System.out.println(getText(ele)+"is matched");
		} else 
			System.out.println(getText(ele)+"is not matched");
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		if(getText(ele).contains(expectedText))
			System.out.println(ele+"contains the text");

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		if (ele.getAttribute(attribute).equals(value))
			System.out.println(ele+"has exact attribute and value and vrified exact attribute");
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		if (ele.getAttribute(attribute).contains(value))
			System.out.println(ele+"has attribute and value and verified partial attribute");
	}

	public void verifySelected(WebElement ele) {
		if(ele.isSelected())
			System.out.println(ele+"is selected");
		else {
			click(ele);
			System.out.println(ele+ "is now selected");
		}

	}

	public void verifyDisplayed(WebElement ele) {
		if(ele.isDisplayed())
			System.out.println(ele+"is displayed");

	}

	public void switchToWindow(int index) {
		//String windowHandle = driver.getWindowHandle();
		//System.out.println(windowHandle);
		try {
			Set<String> windowHandles = driver.getWindowHandles();
			List<String> windowList= new ArrayList<String>();
			windowList.addAll(windowHandles);
			String selectedWindow = windowList.get(index);
			driver.switchTo().window(selectedWindow);
			System.out.println(driver.getTitle());
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			System.err.println(" such window"+index+" is not found");
		}
      finally {
    	  takeSnap();
      }
		
	}

	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
		System.out.println("switched to"+ele);
		takeSnap();

	}

	public void acceptAlert() {

		driver.switchTo().alert().accept();
		System.out.println("alert is accepted");

	}

	public void dismissAlert() {

		driver.switchTo().alert().dismiss();
		System.out.println("alert is dismissed");

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

	@Override
	public void closeAllBrowsers() {
		driver.quit();
	}

	@Override
	public void escapeWindow() {
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		
	}

	@Override
	public void mouseHover() {
				
	}

	@Override
	public void mouseClick() {
		
		
	}






}
