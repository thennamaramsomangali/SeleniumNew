package testcases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetAndList {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");

		driver.findElementById("txtStationFrom").clear();

		driver.findElementById("txtStationFrom").sendKeys("mas",Keys.TAB);

		//List<WebElement> fromStation = driver.findElements(By.id("txtStationFrom")); 
		//List<WebElement> fromStation = driver.findElementsById("txtStationFrom");

		// fromStation.get(0).click();

		//unchecked the checkbox.

		WebElement dateCheckBox = driver.findElementById("chkSelectDateOnly");

		//if dateCheckBox is selected deselect it

		if(dateCheckBox.isSelected())
		{
			dateCheckBox.click();
		}

		Thread.sleep(3000);


		driver.findElementByXPath("//a[text()='Train Name']").click();


		//finding table and getting size of row.

		WebElement trainList = driver.findElementByXPath("//table[@class='DataTable TrainList']");

		List<WebElement> rows = trainList.findElements(By.tagName("tr"));

		int rowSize = rows.size();

		System.out.println(rowSize);

		//getting all values from second column and storing it in arrayList

		List<String> allSecondColumn = new ArrayList<String>();

		for(int i=0;i<rowSize;i++) {

			WebElement rowNumber = rows.get(i);

			List<WebElement> columns = rowNumber.findElements(By.tagName("td"));

			String secondColumn= columns.get(1).getText();

			boolean add = allSecondColumn.add(secondColumn);
			System.out.println(add);

		}

		List<String> sortedAllSecondColumn = new ArrayList<String>();

		//copying value from array list to another array list.

		for (String eachValue : allSecondColumn) {

			System.out.println(eachValue);

			boolean add1 = sortedAllSecondColumn.add(eachValue);
			System.out.println(add1);

		}

		//Sorting array list

		Collections.sort(sortedAllSecondColumn);

		//comparing two array list

		for(int i=0;i<rowSize;i++) {

			if(allSecondColumn.get(i).equals(sortedAllSecondColumn.get(i)))


				//continue;	

				System.out.println("Correct");

		}

	}

}


