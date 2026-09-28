package pages;

import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.ForgetPinLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class ForgetPinActions {

	WebDriverHelper webDriverHelper = new WebDriverHelper(Base.driver);

	ForgetPinLocators loc = new ForgetPinLocators();

	ExtentTest test;

	public ForgetPinActions(ExtentTest test) {

		this.test = test;

	}

	/*
	 * Method Name: Send Key actions on input card number input field Author: Tharun
	 * S Description:Perform a click on card number input field. Performs a input
	 * action on the 'card number input field' element. Return Type: void
	 */
	public void inputCardNumber() {

		try {

			webDriverHelper.explicityWait(7, loc.getCardnoInput());

			webDriverHelper.clickOnElement(loc.getCardnoInput());

			webDriverHelper.explicityWait(7, loc.getCardnoInput());

			webDriverHelper.sendKeys(loc.getCardnoInput(), "23456789");

		} catch (Exception e) {

			e.getStackTrace();

			LoggerHandler.info("failed to input card");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed screenshotThree", test, "failed to input card");

		}

	}

	/*
	 * Method Name: Send Key actions on Exp Date input field Author: Tharun S
	 * Description:Perform a click on Exp Date input field. Performs a input action
	 * on the 'Exp Date input field' element. Return Type: void
	 */
	public void inputExpDate() {

		try {

			webDriverHelper.explicityWait(7, loc.getExpDate());

			webDriverHelper.clickOnElement(loc.getExpDate());

			webDriverHelper.explicityWait(7, loc.getExpDate());

			webDriverHelper.sendKeys(loc.getExpDate(), "1230");

		} catch (Exception e) {

			e.getStackTrace();

			LoggerHandler.info("failed to input expiry date");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed screenshotThree", test, "failed to expiry date");

		}

	}

	/*
	 * Method Name: Send Key actions on pin number input field Author: Tharun S
	 * Description:Perform a click on pin number input field. Performs a input
	 * action on the 'pin number input field' element. Return Type: void
	 */
	public void inputPinNumber() {

		try {

			webDriverHelper.explicityWait(7, loc.getPinnoInput());

			webDriverHelper.clickOnElement(loc.getPinnoInput());

			webDriverHelper.explicityWait(7, loc.getPinnoInput());

			webDriverHelper.sendKeys(loc.getPinnoInput(), "4321");

		} catch (Exception e) {

			e.getStackTrace();

			LoggerHandler.info("failed to input pin");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed screenshotThree", test, "failed to input pin");

		}

	}

	/*
	 * Method Name: click proceed Author: Tharun S Description: Performs a click
	 * action on the 'proceed' element. Return Type: void
	 */
	public void clickOnProceed() {

		try {

			webDriverHelper.explicityWait(7, loc.getProceed());

			webDriverHelper.clickOnElement(loc.getProceed());

		} catch (Exception e) {

			e.getStackTrace();

			LoggerHandler.info("failed to click procced");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed screenshotThree", test, "failed click proceed");

		}
	}

	/*
	 * Method Name: verify the text Author: Tharun S Description: Performs a
	 * verification on 'Error text' element. Return Type: void
	 */
	public void verify() {

		try {

			webDriverHelper.explicityWait(10, loc.getProceed());

			String val = webDriverHelper.getText(loc.getVerify());

			System.out.println(val);

			Assert.assertEquals(val, "Card Number length should be 16");

			Screenshot.captureScreenshot("last screenshot");

		} catch (Exception e) {

			e.getStackTrace();

			LoggerHandler.info("failed to click procced");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed screenshotThree", test, "failed click proceed");

		}
	}

}
