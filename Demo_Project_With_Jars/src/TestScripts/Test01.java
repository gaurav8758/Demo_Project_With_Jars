package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import atu.testng.reports.ATUReports;

import Pages.Page_UnsecureHome;
import Utility.Datatable;
import Utility.baseClass;

public class Test01 extends baseClass{

	@Test	
    public void testcase01()throws Exception{
        Page_UnsecureHome CurrentPage = PageFactory.initElements(getDriver(), Page_UnsecureHome.class);
        CurrentPage.EnterEmailAddress(dataTable);
        //CurrentPage.NewdataEntry();
    }
}
