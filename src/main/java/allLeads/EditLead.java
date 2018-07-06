package allLeads;

import org.testng.annotations.Test;

import allLeads.ProjectMethods;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

//public class EditLead extends SeMethods{
public class EditLead extends ProjectMethods{
	@Test //(groups={"All"}) //(groups={"sanity"}) //(dependsOnMethods= {"testcases.CreateTestLead.createLead"})
	public void editLead() throws InterruptedException {

		//startApp("chrome", "http://leaftaps.com/opentaps");
		System.out.println("edit");
	}
	
	@Test	
	public void sampleMethod() throws InterruptedException {
		System.out.println("sampleedit");
		/*WebElement userName = locateElement("id","username");
		type(userName, "DemoSalesManager");
		WebElement passWord = locateElement("id", "password");
		type(passWord, "crmsfa");
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);

		WebElement crmsfa = locateElement("link","CRM/SFA");
		click(crmsfa);
		 */
		
		
		/*Thread.sleep(2000);

		WebElement leads = locateElement("link","Leads");
		click(leads);

		WebElement findLeads = locateElement("xpath","//a[text()='Find Leads']");
		click(findLeads);

		Thread.sleep(2000);

		WebElement firstName = locateElement("xpath","(//input[@name='firstName'])[3]");
		type(firstName, "abcd");

		WebElement leadID = locateElement("name", "id");
		type(leadID, "10564");


		WebElement findLeadButton = locateElement("xpath","//button[text()='Find Leads']");
		click(findLeadButton);

		WebElement firstItem = locateElement("link","10564");
		click(firstItem);

		boolean flag = verifyTitle("View Lead");

		if(flag)
		System.out.println("OK");

		Thread.sleep(2000);

		WebElement edit = locateElement("xpath","//a[text()='Edit']");
		click(edit);

		WebElement editCompName = locateElement("id","updateLeadForm_companyName");
		type(editCompName, "self");

        WebElement updateLeadInfo = locateElement("xpath","//input[@value='Update']");
        click(updateLeadInfo);

        WebElement updatedCompName = locateElement("id","viewLead_companyName_sp");

        verifyExactText(updatedCompName,"self (10564)" );

        //closeBrowser();
		 */
	}
}