package allLeads;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class ProjectMethods extends SeMethods{


	//@BeforeMethod //(groups= {"All"})
	//@Test
	@BeforeMethod
	public void login() {


		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement userName = locateElement("id","username");
		type(userName, "DemoSalesManager");
		WebElement passWord = locateElement("id", "password");
		type(passWord, "crmsfa");
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);	
		System.out.println("BM");


	}

	//@AfterMethod(groups= {"All"})
	//@Test
	public void close()	{

		//closeBrowser();

		System.out.println("AM");

	}

	//@BeforeClass(groups= {"All"})
	//@Test
	public void beforeClass() {
		System.out.println("BC");
	}

	//@AfterClass(groups= {"All"})
	//@Test(dependsOnMethods= {"beforeTest"})
	public void afterClass() {
		System.out.println("AC");
	}

	//@BeforeTest
	//@Test(dependsOnMethods= {"beforeClass"})
	public void beforeTest() {
		System.out.println("BT");
	}

	//@AfterTest
	//@Test
	public void afterTest() {
		System.out.println("AT");

	}

}