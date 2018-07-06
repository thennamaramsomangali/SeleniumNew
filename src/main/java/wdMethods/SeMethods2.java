package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.internal.runners.model.EachTestNotifier;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;



public class SeMethods2 implements WdMethods{


	public RemoteWebDriver driver;
	int i=1;

	@Override
	public void startApp(String browser, String url) {
		// TODO Auto-generated method stub
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
			}
			else
				driver=new FirefoxDriver();
			System.out.println("Browser is opened");
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("URL is launched");
		} catch(WebDriverException e){
			//e.printStackTrace();

			System.err.println(browser+" browser is not launched");
		}

	}
	@Override
	public WebElement locateElement(String locator, String locValue) {
		// TODO Auto-generated method stub
		try {
			switch (locator) {
			case "id":
				return driver.findElementById(locValue);

			case "classname":
				return driver.findElementByClassName(locValue);

			case "xpath":
				return driver.findElementByXPath(locValue);

			case "css":
				return driver.findElementByCssSelector(locValue);

			case "tagname":
				return driver.findElementByTagName(locValue);

			case "linktext":
				return driver.findElementByLinkText(locValue);

			default:
				break;
			}
		}catch(NoSuchElementException e) {
			System.err.println(locator+"Element is not locatable");
		}finally {
			takeSnap();
		}
		return null;
	}

	@Override
	public WebElement locateElement(String locValue) {
		// TODO Auto-generated method stub
		try {
			WebElement locateEle = locateElement("id", locValue);
			System.out.println(locateEle+" is located");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			takeSnap();
		}

		return null;
	}

	@Override
	public void type(WebElement ele, String data) {
		// TODO Auto-generated method stub
		try {
			ele.clear();
			ele.sendKeys(data);
			System.out.println(ele+" is typed");
		}catch(InvalidElementStateException e){
			System.err.println(ele+" is not interactable");
		}finally {
			takeSnap();
		}


	}

	@Override
	public void click(WebElement ele) {
		// TODO Auto-generated method stub
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

	@Override
	public void clickWithNoSnap(WebElement ele) {
		// TODO Auto-generated method stub
		try {
			ele.click();
			System.out.println("The Element Is Clicked");
			//takeSnap();
		} catch (InvalidElementStateException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println(ele+ "element is not interactable");	
		}

	}

	@Override
	public String getText(WebElement ele) {
		// TODO Auto-generated method stub

		String text=null;
		text = ele.getText();

		System.out.println(text);


		return null;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		try{
			Select dd=new Select(ele);
			dd.selectByVisibleText(value);
			System.out.println(ele+" is selected ");
		}catch(WebDriverException e) {
			System.err.println(ele+" is not selectable");

		}
		finally {
			takeSnap();
		}


	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		try
		{
			Select dd=new Select(ele);

			dd.selectByIndex(index);
			System.out.println(ele+" is selected ");
		}catch(WebDriverException e) {
			System.err.println(ele+" is not selectable");

		}
		finally {
			takeSnap();
		}
	}

	@Override
	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		try {
		String title = driver.getTitle();
		if (expectedTitle.equals(title)) System.out.println(title+"Title verified");
		}catch(WebDriverException e) {
			System.err.println((driver.getTitle())+" is not matched");
		}finally {
			takeSnap();
		}
		return false;
		
		
	}

	@Override
	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		try {
			String title = ele.getText();
			if (expectedText.equals(title)) System.out.println(title+"Title verified");
			}catch(WebDriverException e) {
				System.err.println(ele.getText()+" is not matched");
			}finally {
				takeSnap();
			}
		

	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		try {
			String title = ele.getText();
			if (expectedText.equalsIgnoreCase(title)) System.out.println(title+"Title verified");
			}catch(WebDriverException e) {
				System.err.println(ele.getText()+" is not matched");
			}finally {
				takeSnap();
			}
	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		if (ele.getAttribute(attribute).equalsIgnoreCase(value)) System.out.println("attribute matches");

	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		if (ele.getAttribute(attribute).contains(value)) System.out.println("attribute matches");
	}

	@Override
	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		if (ele.isSelected()) System.out.println("Element is selected");

	}

	@Override
	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		if (ele.isDisplayed()) System.out.println("Element is displayed");

	}

	@Override
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		try {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listwindowHandles=new ArrayList<String>();
		listwindowHandles.addAll(windowHandles);
		String window = listwindowHandles.get(index);
		driver.switchTo().window(window);
		System.out.println(driver.getTitle());
	}catch(NoSuchElementException e) {
		System.out.println("no such frame");
	}finally {
  	  takeSnap();
    }
	}

	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		try {
		
		WebDriver frame = driver.switchTo().frame(ele);
		System.out.println("switched to "+frame);
		} catch(Exception e) {
			System.out.println("no such frame");
		}finally {
			takeSnap();
		}
	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();

	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().dismiss();

	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		return null;
	}

	@Override
	public void takeSnap() {
		// TODO Auto-generated method stub
		File src=driver.getScreenshotAs(OutputType.FILE);
		File desc=new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src,desc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();

	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();

	}

	@Override
	public void escapeWindow() {
		// TODO Auto-generated method stub
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		

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