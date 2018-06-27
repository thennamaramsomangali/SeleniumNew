package HwQnsWeek2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSelectdropdownDay2 {

	static int i=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		// load url
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");

		// implicitwait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Identify the element and store
		WebElement element=driver.findElementById("userRegistrationForm:nationalityId");

		// create an object using Select class for an webelement 
		Select dropdown=new Select(element);

		// get collection of webelement and store it in list
		List<WebElement> options=dropdown.getOptions();

		//iterations through each webElement based on condection
		for (WebElement eachoption : options) {
			if (eachoption.getText().startsWith("E")) {
				i++;
				if (i==2) {
					System.out.println(eachoption.getText());
					eachoption.click();
					break;
				}
			}
		}

		//close browser
		driver.close();
	}
}

/*================================================================


	2. Access Modifiers of Java Class:

	1.Public - It can be accesses anywhere in a particular Java project (even if it is in different package)
		2.Default - No keyword required and can be accessed only within that particular class.

	Accesss Modifiers of Java Methods:
		1.Default – No keyword required and can be accessed only within that particular Method.
		2.Public  - Same as of Java Class. Can be accessed from anywhere.
		3.Protected - Can be accessed from same package and a sub class existing in any package can access.
		4.Private - Only Members can access.*/

