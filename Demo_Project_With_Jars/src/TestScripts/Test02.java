package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import atu.testng.reports.ATUReports;

import Utility.baseClass;

public class Test02 extends baseClass {
	@Test
    public void testcase02()throws Exception{
        getDriver().get("http://facebook.com");
        WebElement textBox = getDriver().findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        textBox.click();
        textBox.sendKeys("Test two!");
        Thread.sleep(2000);
        ATUReports.add("Testing Test1", false);
    }
}
