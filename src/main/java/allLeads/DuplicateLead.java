package allLeads;

import org.testng.annotations.Test;

import allLeads.ProjectMethods;

import wdMethods.SeMethods;

//public class DuplicateLead extends SeMethods {
@Test (groups={"DuplicateLead"}) 
public class DuplicateLead extends ProjectMethods {
	 //(groups={"All"} ,enabled=false) 
	//@Test (invocationCount=4,threadPoolSize=4) 
	//@Test (invocationCount=4,threadPoolSize=4,invocationTimeOut=10000) 
	//@Test (invocationCount=4)
	public void duplicateLead() throws InterruptedException {
		
		//startApp("chrome", "http://leaftaps.com/opentaps");
		System.out.println("duplicate");
	}
	
	/*@Test (invocationCount=4,threadPoolSize=4,invocationTimeOut=10000)
	//@Test (invocationCount=4)
	public void sampleMethod() throws InterruptedException {
		System.out.println("sampleduplicate");*/
		/*WebElement userName = locateElement("id","username");
		type(userName, "DemoSalesManager");
		WebElement passWord = locateElement("id", "password");
		type(passWord, "crmsfa");
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
		
		WebElement crmsfa = locateElement("link","CRM/SFA");
		click(crmsfa);*/
		
		/*Thread.sleep(2000);
		
		WebElement leads = locateElement("link","Leads");
		click(leads);
		
		WebElement findLeads = locateElement("xpath","//a[text()='Find Leads']");
		click(findLeads);
		
		Thread.sleep(2000);
		
		WebElement emailButton = locateElement("xpath","//span[@class='x-tab-strip-inner']/following::span[3]");
		click(emailButton);
		
		WebElement emailTextArea = locateElement("name", "emailAddress");
		type(emailTextArea, "xyxy@gmail.com");
		
		WebElement findLead = locateElement("xpath","(//button[@class='x-btn-text' and @type='button'])[7]");
		click(findLead);
		
		Thread.sleep(2000);
		
		WebElement firstInList = locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a");
		click(firstInList);
		
		Thread.sleep(2000);
		
		WebElement firstName = locateElement("id","viewLead_firstName_sp");
		String firstNameValue = getText(firstName);
		
		Thread.sleep(2000);
		
		WebElement duplicateLead = locateElement("xpath","//div[@class='frameSectionExtra']/a[1]");
		click(duplicateLead);
		
		Thread.sleep(2000);
		
		WebElement submitCreateLead = locateElement("name","submitButton");
		click(submitCreateLead);
		
		WebElement dupFirstName = locateElement("id","viewLead_firstName_sp");
		if(dupFirstName.getText().equalsIgnoreCase(firstNameValue))
		{
			System.out.println("duplicate lead created prop");
		}

		//closeBrowser();
*/	}
	

