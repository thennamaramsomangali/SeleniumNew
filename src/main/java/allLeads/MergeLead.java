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

//public class MergeLead extends SeMethods{
public class MergeLead extends ProjectMethods{
	@Test  //(timeOut=20000)
	public void mergeLead() throws InterruptedException {
		
		//startApp("chrome", "http://leaftaps.com/opentaps");
		System.out.println("merge");
	}
	
	@Test	
	public void sampleMethod() throws InterruptedException {
		System.out.println("samplemerge");
		/*WebElement userName = locateElement("id","username");
		type(userName, "DemoSalesManager");
		WebElement passWord = locateElement("id", "password");
		type(passWord, "crmsfa");
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);

		WebElement crmsfa = locateElement("link","CRM/SFA");
		click(crmsfa);
*/
		/*WebElement createLead = locateElement("link","Create Lead");
		click(createLead);

		WebElement mergeLead = locateElement("link", "Merge Leads");
		click(mergeLead);

		//WebElement fromLead = locateElement("id","ComboBox_partyIdFrom");
		WebElement fromLeadIcon = locateElement("xpath","//input[@id='partyIdFrom']/following::a/img");
		clickWithNoSnap(fromLeadIcon);

		switchToWindow(2);


		Thread.sleep(2000);

		WebElement leadID = locateElement("xpath","//input[@name='id']");
		type(leadID, "11426");


		WebElement findLeadbutton = locateElement("xpath","//button[@class='x-btn-text']");
		clickWithNoSnap(findLeadbutton);


		Thread.sleep(2000);


		WebElement firstItem = locateElement("xpath","//a[text()='11426']");
		clickWithNoSnap(firstItem);

		switchToWindow(0);

		Thread.sleep(2000);

		WebElement toLeadIcon = locateElement("xpath","//input[@id='partyIdTo']/following::a/img");
		clickWithNoSnap(toLeadIcon);

		switchToWindow(2);

		WebElement toLeadId = locateElement("xpath", "//input[@name='id']");
		type(toLeadId, "11427");

		WebElement findLeadbuttonForToLead = locateElement("xpath","//button[@class='x-btn-text']");
		clickWithNoSnap(findLeadbuttonForToLead);

		Thread.sleep(2000);

		WebElement firstItemToLead = locateElement("xpath","//a[text()='11427']");
		clickWithNoSnap(firstItemToLead);


		switchToWindow(0);

		Thread.sleep(2000);

		WebElement merge = locateElement("xpath","//a[text()='Merge']");
		clickWithNoSnap(merge);


		acceptAlert();

		WebElement errorElement = locateElement("xpath","//ul[@class='errorList']/li");

		String errorMsg = getText(errorElement);

		if(errorMsg.equalsIgnoreCase("cannot merge"))
			System.out.println("Merge is not OK");



		//closeBrowser();
*/
	}
}