package testcases;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wdMethods.SeMethods;

public class Draganddrop extends SeMethods{
	
	@Test
	
	public void run() {
		startApp("chrome", "http://jqueryui.com/droppable");
		WebElement frame = locateElement("class", "demo-frame");
		switchToFrame(frame);
		WebElement drag = locateElement("id", "draggable");
		WebElement drop = locateElement("id", "droppable");
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		
		act.contextClick().perform();
	}

}
