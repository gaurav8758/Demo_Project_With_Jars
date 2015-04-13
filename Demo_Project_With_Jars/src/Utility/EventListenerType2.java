package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

import atu.alm.wrapper.ALMServiceWrapper;
import atu.alm.wrapper.enums.StatusAs;
import atu.alm.wrapper.exceptions.ALMServiceException;
import atu.testng.reports.ATUReports;
import atu.testng.reports.logging.LogAs;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;

public class EventListenerType2 extends AbstractWebDriverEventListener {
	@Override
	@SuppressWarnings("deprecation")
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		ATUReports.add("", arg0.getAttribute("value"),"Enter the input value in the textbox - '" + arg0.toString().split(":")[2].trim() + "'.", "Input value is entered.", false);
	}
 
	@Override
	@SuppressWarnings("deprecation")
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		ATUReports.add("","","Click the button - '" + arg0.toString().split(":")[2].trim() + "'.", "Button/Link is clicked.", false);
		//ATUReports.add(null, "", new CaptureScreen(Screens))
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		ATUReports.add("", arg1.getCurrentUrl(),"Browser should navigate to as mentioned.", "Browser is navigated.", false);

	}
	@Override
	public void onException(Throwable arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		//System.out.println("Exception occured at " + arg0.getMessage())
		ATUReports.add("Exception occured: " + arg0.getMessage(), LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
	}
	
	public void QCupdateResults() throws ALMServiceException {
		ALMServiceWrapper wrapper = new ALMServiceWrapper(
				"http://localhost:8081/qcbin");
		wrapper.connect("admin", "admin", "DEFAULT", "SampleProject");
		wrapper.updateResult("SampleTestSetFolder\\SubTestSetFolder1",
				"TestSet3", 62, "Login", StatusAs.PASSED);
		wrapper.close();
	}
	
}