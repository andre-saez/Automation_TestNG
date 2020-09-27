package extentreports;

import com.relevantcodes.extentreports.ExtentReports;

public class Test2 {
	
	public static ExtentReports getInstance() {
		ExtentReports extent;
		String Path = "//Users//DesktopW7//Google Drive//Automation//TestNGTutorial//report-demo.html";
		extent = new ExtentReports(Path, false);
		extent.addSystemInfo("Selenium Version", "2.52").addSystemInfo("Platform", "Windows");
		return extent;
	}
	
	
	
}
