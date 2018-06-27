package autoit;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class UploadFile extends SeMethods {
	
	@Test
	public void uploadFile() throws IOException, InterruptedException {
		
		startApp("firefox", "file:///C:/Users/hp/Desktop/test.html");
		
		Thread.sleep(4000);
		WebElement browseButton = locateElement("id","1");
		System.out.println(browseButton);
		Thread.sleep(2000);
		click(browseButton);
		Thread.sleep(4000);
		Runtime.getRuntime().exec("C:\\Users\\hp\\Desktop\\AutoItScripts\\uploadfile.exe");
		
	}

}
