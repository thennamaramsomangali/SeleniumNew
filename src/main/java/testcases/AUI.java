package testcases;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import wdMethods.SeMethods;

public class AUI extends SeMethods {

	//RemoteWebDriver driver;
	@Test

	public void run() {

		//drag
		 

		startApp("chrome", "http://jqueryui.com/draggable");
		WebElement frame = locateElement("class", "demo-frame");

		switchToFrame(frame);

		WebElement drag = locateElement("id", "draggable");

		Actions act1=new Actions(driver);

		act1.dragAndDropBy(drag, 10, 50).perform();


		//selectable


		startApp("chrome", "http://jqueryui.com/selectable");
		WebElement frame1 = locateElement("class", "demo-frame");

		switchToFrame(frame1);

		Actions act2=new Actions(driver);
		WebElement list1 = locateElement("xpath","//ol[@id='selectable']/li[1]");
		WebElement list2 = locateElement("xpath","//ol[@id='selectable']/li[2]");
		WebElement list3 = locateElement("xpath","//ol[@id='selectable']/li[3]");

		act2.sendKeys(Keys.CONTROL).click(list1).click(list2).click(list3).release().perform();



		//sortable



		startApp("chrome", "http://jqueryui.com/sortable");
		WebElement frame2 = locateElement("class", "demo-frame");

		switchToFrame(frame2);

		Actions builder=new Actions(driver);
		WebElement list11 = locateElement("xpath","//ul[@id='sortable']/li[1]");
		WebElement list22 = locateElement("xpath","//ul[@id='sortable']/li[2]");
		WebElement list33 = locateElement("xpath","//ul[@id='sortable']/li[3]");
		WebElement list44 = locateElement("xpath","//ul[@id='sortable']/li[4]");


		int yCordinate = list33.getLocation().getY();
		int xCord = list33.getLocation().getX();

		builder.dragAndDropBy(list11, xCord, yCordinate).perform();


	}

}
