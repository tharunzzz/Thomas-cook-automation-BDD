package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.Base;
import utils.Reporter;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
public class Hooks extends Base {


	    /* Variable Names: report,test
	     * Author: Tharun S
	    */
	    public static ExtentReports report;
	    /* Method Name:reportSetup
	     * Author: Tharun S
	     * Return Type: void
	    */

	    @BeforeAll
	    public static void reportSetup(){
	        report=Reporter.generateExtentReport();
	    }


	    /* Method Name: browserOpen
	     * Author: Tharun S
	     * Return Type: void
	    */

	    @Before
	    public void browserOpen(){
	        try {
				openBrowser();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }


	    /* Method Name: doneWithDriver
	     * Author: Tharun S
	     * Return Type: void
	    */

	    @After
	    public void doneWithDriver(){
	        driver.quit();
	    }

	    
	    /* Method Name: flushReport
	     * Author: Tharun S
	     * Return Type: void
	    */

	    @AfterAll
	    public static void flushReport(){
	        report.flush();
	    }
	}
