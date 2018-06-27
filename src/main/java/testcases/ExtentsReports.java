package testcases;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class ExtentsReports {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ExtentHtmlReporter html=new ExtentHtmlReporter("./reports/results.html");
		html.setAppendExisting(true);
		ExtentReports extents=new ExtentReports();
		extents.attachReporter(html);
		ExtentTest test = extents.createTest("TC001", "create a lead");
		test.assignCategory("smoke");
		test.assignAuthor("mann");
		test.pass("user name entered ",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		test.fail("failed",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
		extents.flush();

	}

}
