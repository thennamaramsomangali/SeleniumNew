package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class CreateTestLead extends SeMethods {

	@Test //(invocationCount=1)
	public void createLead() throws InterruptedException {
		
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement userName = locateElement("id","username");
		type(userName, "DemoSalesManager");
		WebElement passWord = locateElement("id", "password");
		type(passWord, "crmsfa");
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);


		WebElement crmsfa = locateElement("link","CRM/SFA");
		click(crmsfa);

		Thread.sleep(2000);

		WebElement createLead = locateElement("link","Create Lead");
		click(createLead);

		WebElement companyname = locateElement("id","createLeadForm_companyName");
		type(companyname, "cts");

		WebElement firstName = locateElement("id","createLeadForm_firstName");
		type(firstName, "abcd");

		WebElement lastName = locateElement("id","createLeadForm_lastName");
		type(lastName, "aa");

		WebElement sourceDD = locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingText(sourceDD,"Employee");

		WebElement industryDD = locateElement("id","createLeadForm_industryEnumId");
		selectDropDownUsingIndex(industryDD,3);

		WebElement country = locateElement("id", "createLeadForm_generalCountryGeoId");
		selectDropDownUsingText(country, "India");

		WebElement phoneNumber = locateElement("id","createLeadForm_primaryPhoneNumber");
		type(phoneNumber, "9524045613");


		WebElement email = locateElement("id","createLeadForm_primaryEmail");
		type(email,"xyxy@gmail.com");

		WebElement submitCreateLead = locateElement("xpath","//input[@name='submitButton']");
		click(submitCreateLead);

		//closeBrowser();

		//EDIT lead

		WebElement editLead = locateElement("xpath", "//a[text()='Edit']");
		click(editLead);

		WebElement editCompName = locateElement("id", "updateLeadForm_companyName");

		type(editCompName, "cts");

		WebElement updateLead = locateElement("name", "submitButton");

		click(updateLead);

	}

}
