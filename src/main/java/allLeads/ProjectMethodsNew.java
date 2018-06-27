package allLeads;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import reports.ReadFromExcel;
import wdMethods.SeMethods;



	public class ProjectMethodsNew extends SeMethods{
	 //public String file;
	 
	//make global variable excelFileName to call before class in Create Lead
		public String excelFileName;
	    @Parameters({"browser","url","username","password"}) //parameter names should be as in xml(case sensitive)
		@BeforeMethod
		public void login(String browser,String url,String uName,String pwd) {
		

			startApp(browser,url);
			WebElement userName = locateElement("id","username");
			type(userName, uName);
			WebElement passWord = locateElement("id", "password");
			type(passWord, pwd);
			WebElement login = locateElement("class", "decorativeSubmit");
			click(login);	
			System.out.println("BM");

			
		}
	    
	    //Enter values dynamically without excel
	    
	  /*  @DataProvider(name="fetchData1")
	    public  Object[][] getData() throws IOException {
	    	
	    	Object[][] data=new Object[2][4];  //2 set of data and 4 data in each set
	    	
	    	data[0][0]="self";
	    	data[0][1]="kudil";
	    	data[0][2]="veedu";
	    	data[0][3]="12345";
	    	
	    	data[1][0]="selfie";
	    	data[1][1]="kudil";
	    	data[1][2]="veedu";
	    	data[1][3]="12346";
	    	
			return data;
	    	
	    }
*/
	    //Enter values dynamically with excel
	   @DataProvider(name="fetchData2")
	    public  Object[][] getData1() throws IOException {
	    	
	    	Object[][] data=new Object[1][2];  //2 set of data and 4 data in each set
	    	
	    	data[0][0]="abcd";
	    	data[0][1]="10564";
	    	
			return data;
	    	
	    }

 
	   
	    //Data fetch from excel
		@DataProvider(name="fetchData1")
		public Object[][] getData3() throws IOException{
			
			ReadFromExcel excel = new ReadFromExcel();
			return excel.fetchData(excelFileName);
			
		}
	    @AfterMethod
		public void close()	{

			closeBrowser();

			System.out.println("AM");

		}
		
		 //@Test
		public void beforeClass() {
			System.out.println("BC");
		}
		
		 //@Test
	    public void afterClass() {
	 	   System.out.println("AC");
	    }

	    //@Test
		public void beforeTest() {
			System.out.println("BT");
		}
		
		 //@Test
	    public void afterTest() {
	 	   System.out.println("AT");
		
	}
	    
	    
	    

	}

