	package allLeads;


import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
	
	//public class Createlead extends SeMethods{
	public class CreateLeadNew extends ProjectMethodsNew{
		
		@BeforeClass
		public void excelSheet() {
			excelFileName="TC002";
		}
		@Test (dataProvider="fetchData1") // (groups={"All"}) //(groups={"smoke"})
		public void createLead(String cName,String fName,String lName,String phNo) throws InterruptedException {

			//closeBrowser();
			/*startApp("chrome", "http://leaftaps.com/opentaps");  //both parameters are of string datatype.so in ""
			System.out.println("create");*/
			/*WebElement userName = locateElement("id","username");
			type(userName,"DemoSalesManager");
			WebElement passWord = locateElement("id","password");
			type(passWord,"crmsfa");
			WebElement login = locateElement("class","decorativeSubmit");
			click(login);*/
			WebElement crmsfa = locateElement("link","CRM/SFA");
			click(crmsfa);
			
			
			
			WebElement leads = locateElement("link","Leads");
			click(leads);
			WebElement createLead = locateElement("link","Create Lead");
			click(createLead);
			WebElement comname = locateElement("id","createLeadForm_companyName");
			type(comname, cName);
			WebElement firstName = locateElement("id","createLeadForm_firstName");
			type(firstName, fName);
			WebElement lastName = locateElement("id","createLeadForm_lastName");
			type(lastName, lName);
			WebElement sourceDD = locateElement("id", "createLeadForm_dataSourceId");
			selectDropDownUsingText(sourceDD,"Employee");
			WebElement indsutryDD = locateElement("id","createLeadForm_industryEnumId");
			selectDropDownUsingIndex(indsutryDD,3);

			WebElement country = locateElement("id", "createLeadForm_generalCountryGeoId");
			selectDropDownUsingText(country, "India");
			
			WebElement phoneNumber = locateElement("id","createLeadForm_primaryPhoneNumber");
            type(phoneNumber, phNo);
          

			WebElement email = locateElement("id","createLeadForm_primaryEmail");
			type(email,"xyxy@gmail.com");

			WebElement submitCreateLead = locateElement("xpath","//input[@name='submitButton']");
			click(submitCreateLead);

		/*	//EDIT lead
			
				WebElement editLead = locateElement("xpath", "//a[text()='Edit']");
				click(editLead);

				WebElement editCompName = locateElement("id", "updateLeadForm_companyName");

				type(editCompName, "cts");

				WebElement updateLead = locateElement("name", "submitButton");

				click(updateLead);




			//MergeLead

				WebElement mergeLead = locateElement("link", "Merge Leads");
				click(mergeLead);

				WebElement fromLead = locateElement("id","ComboBox_partyIdFrom");
				type(fromLead, "13730");

				WebElement toLead = locateElement("id","ComboBox_partyIdTo");
				type(toLead,"13729");

				WebElement merge = locateElement("xpath", "//a[text()='Merge']");
				click(merge);

				acceptAlert();

			 

			//click(indsutryDD);
			//WebElement clickreateLead = locateElement("xpath", "//input[@value='Create Lead']");
			//click(clickreateLead);

			WebElement edit = locateElement("link", "Edit");
			click(edit);
			WebElement ownnershipDD = locateElement("id","updateLeadForm_ownershipEnumId");
			selectDropDownUsingIndex(ownnershipDD, 3);


			WebElement birthDate = locateElement("id", "updateLeadForm_birthDate");
			click(birthDate);

			closeBrowser();*/
	
		}



	}



