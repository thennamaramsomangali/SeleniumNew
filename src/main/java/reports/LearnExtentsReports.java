package reports;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentsReports {

	public static void main(String[] args) throws IOException  {
		
		ExtentHtmlReporter html=new ExtentHtmlReporter("./reports/results.html");  //non editable html file stored into html obj ExtentHtmlReporter
		html.setAppendExisting(true);
		ExtentReports extents=new ExtentReports();
		extents.attachReporter(html); //using ExtentReports class ,non editable html file converted and atttached into extents obj of ExtentReports
		ExtentTest test = extents.createTest("TC001", "create a lead"); //passing name and description
		test.assignCategory("smoke");
		test.assignAuthor("ganesh");
		test.pass("user name entered",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		test.fail("failed",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
		extents.flush();

	}

}
