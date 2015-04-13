package Utility;


import org.testng.annotations.Parameters;

import com.jacob.com.LibraryLoader;

import atu.alm.wrapper.ALMServiceWrapper;
import atu.alm.wrapper.IDefect;
import atu.alm.wrapper.ITestCase;
import atu.alm.wrapper.ITestCaseRun;
import atu.alm.wrapper.ITestSet;
import atu.alm.wrapper.enums.DefectPriority;
import atu.alm.wrapper.enums.DefectSeverity;
import atu.alm.wrapper.enums.DefectStatus;
import atu.alm.wrapper.enums.StatusAs;
import atu.alm.wrapper.exceptions.ALMServiceException;

	/**
	 * 
	 * @author Automation Tester http://automationtestingutilities.blogspot.in/
	 */
	public class ALMIntegration  {
		public static String qcURL = "";
		public static String qcUserName = "";
		public static String qcPassword = "";
		public static String qcDomain = "";
		public static String qcProject = "";
		public static String testFolderPath = "";
		public static String testSetName = "";
		public static int testSetID = 0;
		public static boolean qcFlag = false;

		public static void UpdateTestCaseStatus(String TestCaseName, String Status)
				throws ALMServiceException {
			System.out.println(System.getProperty("user.dir"));
			 System.setProperty("jacob.dll.path", System.getProperty("user.dir") + "\\jacob-1.18-M2-x86.dll");
			 LibraryLoader.loadJacobLibrary();

			ALMServiceWrapper wrapper = new ALMServiceWrapper(
					qcURL);
			wrapper.connect(qcUserName, qcPassword, qcDomain, qcProject);
			ITestCase loginTest;
			
			if (Status == "pass")
			{
				loginTest = wrapper.updateResult(
						testFolderPath, testSetName, testSetID,
						TestCaseName, StatusAs.PASSED);
			}
			else if (Status == "fail")
			{
				loginTest = wrapper.updateResult(
						testFolderPath, testSetName, testSetID,
						TestCaseName, StatusAs.FAILED);
			}
			else if (Status == "not completed")
			{
				loginTest = wrapper.updateResult(
						testFolderPath, testSetName, testSetID,
						TestCaseName, StatusAs.NOT_COMPLETED);
			}

			//wrapper.newAttachment("D:\\Data.xlsx", "My Attachment Description",
			//		loginTest);

			wrapper.close();
		}
	}
