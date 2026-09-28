package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.KnowyourCardBalanceLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;


public class KnowyourCardBalanceActions {
	
	
	WebDriverHelper help=new WebDriverHelper(Base.driver);
	

	KnowyourCardBalanceLocators loc=new KnowyourCardBalanceLocators();
	
	
	ExtentTest test;
	
	 
    public KnowyourCardBalanceActions(ExtentTest test) {
		
		this.test=test;
		
	}
    
    
    /*
	Method Name: click on input Type of card
	Author: Tharun S
	Description: Performs a click action on the 'input Type of card' element. 
	Return Type: void
    */
	public void clickOninputType() {
		
		try{
			
		Base.driver.navigate().refresh();
		
		Thread.sleep(5000);;
		
		help.explicityWait(10,loc.getLoginType());
		
		help.clickOnElement(loc.getLoginType());
		
		Thread.sleep(3000);
		
		help.explicityWait(10,loc.getWebLoginPin());
		
		help.clickOnElement(loc.getWebLoginPin());
		

		LoggerHandler.info("click on web login");
		
		test.log(Status.PASS,"click on web login");
		
		
		}catch(Exception e) {
			
			e.getStackTrace();
			
			LoggerHandler.info("failed to click on InputType");
			
			test.log(Status.FAIL,"Failed test");
			
			Reporter.attachScreenshotToReport("failed screenshotThree", test, "failed to failed to click on input type");
			
		}
		
	}
	
	
	/*
	Method Name: Send Key actions on user name input field
	Author: Tharun S
	Description:Perform a click on user name input field.
	            Performs a input action on the 'user name input field' element. 
	Return Type: void
    */
	public void usernameInput() {
		
		try{
			
		help.explicityWait(7,loc.getLoginType());
		
		help.clickOnElement(loc.getUsernameInput());
		
		help.explicityWait(7,loc.getUsernameInput());
		
		help.sendKeys(loc.getUsernameInput(),"abcd");
		

		LoggerHandler.info("user input success");
		
		test.log(Status.PASS,"user input success");
		
		
		}catch(Exception e) {
			
			e.getStackTrace();
			
			LoggerHandler.info("failed to input username");
			
			test.log(Status.FAIL,"Failed test");
			
			Reporter.attachScreenshotToReport("failed screenshotThree", test, "failed to input username");
			
		}
		
	}
	

	/*
	Method Name: Send Key actions on pin number input field
	Author: Tharun S
	Description:Perform a click on pin number input field. 
	            Performs a input action on the 'pin number input field' element. 
	Return Type: void
    */
    public void pinInput() {
	
	try{
		
	help.explicityWait(7,loc.getPinInput());
	
	help.clickOnElement(loc.getPinInput());
	
	help.explicityWait(7,loc.getPinInput());
	
	help.sendKeys(loc.getUsernameInput(),"2222");
	

	LoggerHandler.info("pin input success");
	
	test.log(Status.PASS,"pin input success");
	
	
	}catch(Exception e) {
		
		e.getStackTrace();
		
		LoggerHandler.info("failed to input pin");
		
		test.log(Status.FAIL,"Failed test");
		
		Reporter.attachScreenshotToReport("failed screenshotThree", test, "failed to input pin");
		
	}
	
}

    
    /*
	Method Name: click on Forget pin
	Author: Tharun S
	Description: Performs a click action on the 'Forget pin' element. 
	Return Type: void
    */
    public void clickOnForgetPin() {
	
	try{
		
	help.explicityWait(7,loc.getForgotPin());
	
	help.clickOnElement(loc.getForgotPin());
	

	LoggerHandler.info("click on forget pin");
	
	test.log(Status.PASS,"click on forget pin");
	
}catch(Exception e) {
		
		e.getStackTrace();
		
		LoggerHandler.info("failed to click on forget pin");
		
		test.log(Status.FAIL,"Failed test");
		
		Reporter.attachScreenshotToReport("failed screenshotThree", test, "failed to click on forget pin");
		
	}
	
}



}
