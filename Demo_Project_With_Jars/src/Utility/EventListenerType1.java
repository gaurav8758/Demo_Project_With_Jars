package Utility;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventListenerType1 implements WebDriverEventListener 
{
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
	// Things to be done after changing the value in the webelement argo
	}

	public void afterClickOn(WebElement arg0, WebDriver arg1) {
	// Things to be done after clicking an element arg0
	}

	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
	// Things to be done  after findby of webelement arg1
	}

	public void afterNavigateBack(WebDriver arg0) {
	// Things to be done after navigating back
	}

	public void afterNavigateForward(WebDriver arg0) {
	// Things to be done after navigating forward
	}

	public void afterNavigateTo(String arg0, WebDriver arg1) {
	// Things to be done after navigating to the given URL say, arg0
	}

	public void afterScript(String arg0, WebDriver arg1) {
	// Things to be done after script execution
	}

	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {
	// Things to be done before Changing value in the webelement arg0
	}
	
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
	// Things to be done before Clicking an element arg0
	}
	
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
	// Things to be done before a Findby of an web element arg1
	}
	
	public void beforeNavigateBack(WebDriver arg0) {
	// Things to be done before navigating back
	}
	
	public void beforeNavigateForward(WebDriver arg0) {
	// Things to be done before Navigating forward
	}

	public void beforeNavigateTo(String arg0, WebDriver arg1) {
	// Things to be done before navigating to a url arg0
	}

	public void beforeScript(String arg0, WebDriver arg1) {
	// Things to be done before javascript execution
	}

	public void onException(Throwable arg0, WebDriver arg1) {
		System.out.println("There is an exception in the script, please find the below error description" );
		arg0.printStackTrace();
	}

}