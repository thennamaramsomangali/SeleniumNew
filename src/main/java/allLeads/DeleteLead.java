package allLeads;

import org.testng.annotations.Test;

import allLeads.ProjectMethods;


//public class DeleteLead extends SeMethods {
	public class DeleteLead extends ProjectMethods{

	@Test //(dependsOnMethods= {"testcases.CreateTestLead.createLead"}) //if create lead failed delete lead skipped
	public void deleteLead() throws InterruptedException {
		
		//startApp("chrome", "http://leaftaps.com/opentaps");
		System.out.println("delete");
	}
		
	@Test	
	public void sampleMethod() throws InterruptedException {
		System.out.println("sampledelete");
		/*WebElement userName = locateElement("id","username");
		type(userName, "DemoSalesManager");
		WebElement passWord = locateElement("id", "password");
		type(passWord, "crmsfa");
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
		WebElement crmsfa = locateElement("link","CRM/SFA");
		click(crmsfa);*/


/*
		Thread.sleep(5000);
		WebElement createLead = locateElement("link","Create Lead");
		click(createLead);

		WebElement companyname = locateElement("id","createLeadForm_companyName");
		type(companyname, "cts");

		WebElement firstName = locateElement("id","createLeadForm_firstName");
		type(firstName, "abcd");

		WebElement lastName = locateElement("id","createLeadForm_lastName");
		type(lastName, "aa");

		WebElement mobilNo = locateElement("id","createLeadForm_primaryPhoneNumber");
		type(mobilNo, "9524045613");


		WebElement submit = locateElement("class", "smallSubmit");
		click(submit);

		WebElement leads = locateElement("link", "Leads");
		click(leads);

		WebElement findLeads = locateElement("xpath", "//a[text()='Find Leads']");
		click(findLeads);

		WebElement phone = locateElement("xpath","//span[text()='Phone']");
		click(phone);

		WebElement phoneNo = locateElement("name", "phoneNumber");
		type(phoneNo,"9524045613");

		Thread.sleep(3000);

		WebElement findleadsButton = locateElement("xpath", "//button[text()='Find Leads']");
		click(findleadsButton);

		WebElement leadID = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");


		String leadIDvalue = getText(leadID);
		click(leadID);

		System.out.println(leadIDvalue);

		Thread.sleep(2000);

		WebElement deleteButton = locateElement("link", "Delete");
		click(deleteButton);


		WebElement findLeadsAgain = locateElement("xpath", "//a[text()='Find Leads']");
		click(findLeadsAgain);

		WebElement findLeadsbutton = locateElement("xpath", "//input[@name='id']");
		type(findLeadsbutton, leadIDvalue);

		WebElement findlead = locateElement("xpath", "//button[text()='Find Leads']");
		click(findlead);

		WebElement outputRecords = driver.findElementByXPath("//div[text()='No records to display']");

		if( outputRecords.isDisplayed())
			System.out.println("Deleted properly");



		//closeBrowser();
*/

	}

}
