package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utility.Datatable;
import atu.testng.reports.ATUReports;

public class Page_UnsecureHome {
	WebDriver driver;

	@FindBy(xpath = "//i[contains(.,'Facebook logo')]")
	private WebElement Image_facebooklogo;
	
	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement textbox_emailaddress;
	
	@SuppressWarnings("deprecation")
	public Page_UnsecureHome(WebDriver threadDriver){
		driver = threadDriver;
		ATUReports.add("Usersecure Home Page", false);
		//new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(Image_facebooklogo));
	}
	
	public void EnterEmailAddress(Datatable dataTable) throws Exception{
		textbox_emailaddress.click();
		textbox_emailaddress.sendKeys("Just one!");
		System.out.println(dataTable.GetSheetCount());
		textbox_emailaddress.sendKeys(dataTable.Value("entervaluetext"));
		dataTable.SetValue("secondvariable", "newvalue");
	    driver.findElement(By.id("u_0_1")).clear();
	    driver.findElement(By.id("u_0_1")).sendKeys("asdfasdf");
	    driver.findElement(By.id("u_0_3")).clear();
	    driver.findElement(By.id("u_0_3")).sendKeys(dataTable.Value("entername"));
	    driver.findElement(By.id("u_0_5")).clear();
	    driver.findElement(By.id("u_0_5")).sendKeys("ricardo");

	}
	
	
}
