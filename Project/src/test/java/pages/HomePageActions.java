package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class HomePageActions {

	WebDriverHelper webDriverHelper = new WebDriverHelper(Base.driver);

	HomePageLocators act = new HomePageLocators();

	ExtentTest test;

	public HomePageActions(ExtentTest test) {

		this.test = test;

	}

	/*
	 * Method Name: HoverOver Forex Author: Tharun S Description: Performs a
	 * HoverOver action on the 'Forex' element. Return Type: void
	 */
	public void hoverOverForex() {

		try {
			webDriverHelper.explicityWait(60, act.getForexHover());

			webDriverHelper.hoverOverElement(act.getForexHover());

			LoggerHandler.info("hover over forex");

			test.log(Status.PASS, "hover over forex");

		} catch (Exception e) {

			e.getStackTrace();

			LoggerHandler.info("failed to hoverOverForex");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed screenshotOne", test, "failed to hoverOverForex");

		}

	}

	/*
	 * Method Name: click Foreign Exchange Author: Tharun S Description: Performs a
	 * click action on the 'Foreign Exchange' element. Return Type: void
	 */
	public void clickOnFxchange() {

		try {

			webDriverHelper.explicityWait(10, act.getFExchange());

			webDriverHelper.clickOnElement(act.getFExchange());

			LoggerHandler.info("click on foreign exchange");

			test.log(Status.PASS, "click on foreign exchange");

		} catch (Exception e) {

			e.getStackTrace();

			LoggerHandler.info("failed to click on foreign exchange");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed screenshotTwo", test, "failed to click on foreign exchange");

		}

	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void clickOnForex() {
		try {
			webDriverHelper.explicityWait(60, act.getForexHover());
			webDriverHelper.hoverOverElement(act.getForexHover());
			webDriverHelper.explicityWait(60, act.getForexHover());
			webDriverHelper.clickOnElement(act.getForexHover());
			LoggerHandler.info("click on forex");
			test.log(Status.PASS, "click on  forex");

		} catch (Exception e) {

			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed1", test, "failed");

		}
	}

	public void clickOnIntUni() {
		try {
			webDriverHelper.explicityWait(60, act.internationalUnivercity);
			webDriverHelper.hoverOverElement(act.internationalUnivercity);
			webDriverHelper.explicityWait(60, act.internationalUnivercity);
			webDriverHelper.clickOnElement(act.internationalUnivercity);
			LoggerHandler.info("click on international univercity");
			test.log(Status.PASS, "click on  international univercity");

		} catch (Exception e) {

			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed1", test, "failed");
		}

	}

	public void cickOnAndroid() {
		try {
			webDriverHelper.explicityWait(60, act.android);
			webDriverHelper.hoverOverElement(act.android);
			webDriverHelper.explicityWait(60, act.android);
			webDriverHelper.clickOnElement(act.android);
			webDriverHelper.switchToNewWindow();
		} catch (Exception e) {

			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed1", test, "failed");

		}

	}
}
