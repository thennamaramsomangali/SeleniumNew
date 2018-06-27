package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://erail.in/");		
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);

		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC", Keys.TAB);

		boolean selected = driver.findElementById("chkSelectDateOnly").isSelected(); //if selected

		if(selected) {  //uncheck
			driver.findElementById("chkSelectDateOnly").click();			
		}

		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']"); //locate table

		List<WebElement> allRows = table.findElements(By.tagName("tr"));//all rows

		int rowsCount = allRows.size();
		System.out.println(rowsCount);

		WebElement firstRow = allRows.get(0); //select row1
		List<WebElement> columns = firstRow.findElements(By.tagName("td"));//all columns
		System.out.println(columns.size());

		columns.get(1).click(); //select column2
		

	}

}
