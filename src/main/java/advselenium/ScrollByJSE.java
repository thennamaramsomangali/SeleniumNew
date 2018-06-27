package advselenium;


	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	 
	public class ScrollByJSE {
	 
		public static void main(String args[]) throws InterruptedException{
			
			//System.setProperty("webdriver.chrome.driver","path to your chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.amazon.in/");
			driver.manage().window().maximize();
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			//Scroll vertically downward by 250 pixels
			jse.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(1000);
			//Scroll vertically upward by 250 pixels
			jse.executeScript("window.scrollBy(0,-250)", "");
			Thread.sleep(1000);
			//Scroll to the bottom of the Web page
			jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(1000);
			//Scroll to a particular Web Element
			WebElement about = driver.findElement(By.id("a-autoid-0-announce"));
			jse.executeScript("arguments[0].scrollIntoView();",about);
			Thread.sleep(1000);
			//Scroll horizontally
			//driver.navigate().to("http://www.clholloway.co.za/");
			//jse.executeScript("window.scrollBy(1000,0)", "");
		}


}







