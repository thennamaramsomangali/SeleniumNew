package modifiers;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class FlipkartTestCase   {
	Actions builder;
	@Test
	public void run() throws InterruptedException {

		// Open browser 
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		//open flipkart site

		driver.get("https://www.flipkart.com");

		//close the login window

		driver.getKeyboard().sendKeys(Keys.ESCAPE);



		/*//mousehover on tv&appliance

		WebElement tvAppliance = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		builder =new Actions(driver);
		builder.moveToElement(tvAppliance).release().perform();

		Thread.sleep(3000);

		//click samsung

		WebElement samsung = driver.findElementByXPath("(//span[text()='Samsung'])[2]");


		builder.click(samsung).release().perform();

		Thread.sleep(3000);*/

		//mousehover on tv&appliance
		/*driver.findElement(By.ById)
		driver.findElements(by.)
		driver.find*/
		WebElement tvAppliance = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		builder =new Actions(driver);
		builder.moveToElement(tvAppliance).release().perform(); //cursor moved to tvappliances

		//Thread.sleep(3000);

		//WebElement parentTabOfTvApp = driver.findElementByXPath("(//li[@class='Wbt_B2'])[2]");
		WebElement parentTabOfTvApp = driver.findElementByXPath("(//ul[@class='_3GtRpC'])[2]");

		List<WebElement> allUnderTvApp = parentTabOfTvApp.findElements(By.tagName("span"));
		for (WebElement eachUnderTvApp : allUnderTvApp) {

			String text = eachUnderTvApp.getText();
			System.out.println(text);
			
			if (text.equalsIgnoreCase("samsung"))
				builder.click(eachUnderTvApp).release().perform();
			}

	

		//select min and max price values from drop down

		WebElement minPriceDD = driver.findElementByXPath("(//select[@class='a_eCSK'])[1]");

		Select priceDD1 =new Select(minPriceDD);

		priceDD1.selectByValue("25000");


		WebElement maxPriceDD = driver.findElementByXPath("(//select[@class='a_eCSK'])[2]");

		Select priceDD2 =new Select(maxPriceDD);

		priceDD2.selectByValue("60000");

		Thread.sleep(3000);

		//click on screensize

		WebElement screenSize = driver.findElementByXPath("(//div[text()='Screen Size'])[1]");

		builder.click(screenSize).release().perform();

		driver.findElementByXPath("//div[text()='48 - 55']").click();

		Thread.sleep(1000);
		//10-14

		//click on first product and get the price of the same


		WebElement firstPrice = driver.findElementByXPath("(//div[@class='_1vC4OE _2rQ-NK'])[1]");
		String p1 = firstPrice.getText();
		String priceOfFirst = p1.replaceAll("\\D", "");
		System.out.println("FIRST PRICE  "  +priceOfFirst);
		WebElement tv = driver.findElementByXPath("(//div[@class='_1-2Iqu row']/div/div)[1]");
		tv.click();

		//switch to second window

		Set<String> allWindows = driver.getWindowHandles();
		//Set<String> allWindowss=new TreeSet<String>();
		
		
		List<String> listofWindow = new ArrayList<String>();
		listofWindow.addAll(allWindows);
		String secWindow = listofWindow.get(2);
		driver.switchTo().window(secWindow);

		//get price from second window

		WebElement price = driver.findElementByXPath("//div[@class='_1vC4OE _37U4_g']");
		String priceValue = price.getText();
		String priceOfSecond = priceValue.replaceAll("\\D", "");
		System.out.println("PRICE from second window  " +priceOfSecond);


		//Convert the string to Integer value
		int item1Value = Integer.parseInt(priceOfFirst);
		int item2Value = Integer.parseInt(priceOfSecond);

		if(item2Value == item1Value) 
		{
			System.out.println("PRICE VALUE MATCHES");
			driver.close();
		}



		driver.switchTo().window(listofWindow.get(0));
		System.out.println(driver.getTitle());
		Thread.sleep(3000);


		//15-20
		WebElement ad1 = driver.findElementByXPath("(//span[@class='_1nUZxV']//input)[1]");

		builder.moveToElement(ad1).click(ad1).release().perform();
		Thread.sleep(2000);
		WebElement ad2 = driver.findElementByXPath("(//span[@class='_1nUZxV']//input)[2]");

		builder.moveToElement(ad2).click(ad2).release().perform();




		WebElement compare = driver.findElementByXPath("//span[text()='COMPARE']");  //Click on the COMPARE button at end of the page
		compare.click();
		Thread.sleep(3000);
		//builder.click(compare);
		WebElement compareText = driver.findElementByXPath("//span[text()='Compare']"); // Read the Text of the Compare Window screen of the two items selected 
		System.out.println(compareText.getText()+ "is the Section Title");
		Thread.sleep(3000);

		WebElement item1 = driver.findElementByXPath("(//div[@class='_1vC4OE'])[1]");
		String item1Price = item1.getText();

		WebElement item2 = driver.findElementByXPath("(//div[@class='_1vC4OE'])[2]");
		String item2Price = item2.getText();

		//Get only the price value from the String Text value
		String price1 = item1Price.replaceAll("\\D", "");
		System.out.println("price item 1 "+ price1);
		String price2 = item2Price.replaceAll("\\D", "");
		System.out.println("price item 2 "+ price2);

		//Convert the string to Integer value
		int item1Val = Integer.parseInt(price1);
		int item2Val = Integer.parseInt(price2);

		//Find out the lesser Price item
		if(item1Val<item2Val)
			System.out.println(item1Val + " Price of item 1 is less ");
		else 
			System.out.println(item2Val + " Price of item 2 is less ");
	}
}


