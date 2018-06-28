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

		/*WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']"); //locate table

		List<WebElement> allRows = table.findElements(By.tagName("tr"));//all rows

		int rowsCount = allRows.size();
		System.out.println(rowsCount);

		WebElement firstRow = allRows.get(0); //select row1
		List<WebElement> columns = firstRow.findElements(By.tagName("td"));//all columns
		System.out.println(columns.size());

		columns.get(1).click(); //select column2
*/		
		
		/*for(int i=0;i<=6;i++) {
		List<WebElement> firstRowFirstColumn = driver.findElementsByXPath("//table[@class='DataTable TrainList']/tbody/tr/td[i]");
		WebElement eleValue = firstRowFirstColumn.get(i);
		System.out.println(eleValue.getText());*/
		
		for(int numberOfRows=1; numberOfRows<=22; numberOfRows++)
		{
		for(int numberOfCol=1; numberOfCol <=23; numberOfCol++)
		{
		WebElement ele = driver.findElementByXPath("//table[@class='DataTable TrainList']//tr["+numberOfRows+"]/td["+numberOfCol+"]");
		System.out.print(ele.getText());
	
		}
		System.out.println();
		}
		
		//driver.findElementByXPath("(//table[@class='DataTable TrainList']//tr)[3]/td[3]").click();
		
	}}	
		

