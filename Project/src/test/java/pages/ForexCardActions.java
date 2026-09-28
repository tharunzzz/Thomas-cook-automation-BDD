package pages;
import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.ForexCardLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class ForexCardActions {

	WebDriverHelper webDriverHelper = new WebDriverHelper(Base.driver);

	ForexCardLocators loc = new ForexCardLocators();

	ExtentTest test;

	public ForexCardActions(ExtentTest test) {

		this.test = test;

	}

	/*
	 * Method Name: clickProductDropdown Author: Tharun S Description: Performs a
	 * click action on the 'ProductDropdown' element. Return Type: void
	 */
	public void clickOnProductDropdown() {

		try {

			// webDriverHelper.hoverOverElement(loc.getProductDropdown());
			// Thread.sleep(2000);

			// webDriverHelper.explicityWait(20, loc.getProductDropdown());
			Base.driver.navigate().refresh();

			webDriverHelper.explicityWait(20, loc.getProductDropdown());

			webDriverHelper.clickOnElement(loc.getProductDropdown());

			LoggerHandler.info("click on product dropdown");

			test.log(Status.PASS, "click on product dropdown");

		} catch (Exception e) {

			e.getStackTrace();

			LoggerHandler.info("failed to click on product dropdown");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed screenshotThree", test,
					"failed to failed to click on product dropdown");

		}

	}

	/*
	 * Method Name: click OneCurrencyCard Author: Tharun S Description: Performs a
	 * click action on the 'One Currency Card' element. Return Type: void
	 */
	public void clickOnOneCurrencyCard() {

		try {

			webDriverHelper.explicityWait(10, loc.getOneCard());

			Dropdown.selectDropdown("One Currency Card");

			// help.clickOnElement(loc.getOneCard());

			LoggerHandler.info("click on one card");

			test.log(Status.PASS, "click on one card");

		} catch (Exception e) {

			e.getStackTrace();

			LoggerHandler.info("failed to click on product dropdown");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed screenshotThree", test,
					"failed to failed to click on product dropdown");

		}
	}

	/*
	 * Method Name: click on US DOller Author: Tharun S Description: Preforms a
	 * click action on the 'Currency Drowdown'. Performs a click action on the 'US
	 * Doller' element. Return Type: void
	 */
	public void usDollerSelection() {
		try {
			webDriverHelper.clickOnElement(loc.getCurrencyDropdown());
			Thread.sleep(3000);

			webDriverHelper.explicityWait(60, loc.getUsDollar());

			webDriverHelper.clickOnElement(loc.getUsDollar());
			Thread.sleep(3000);

			LoggerHandler.info("click on US Doller");

			test.log(Status.PASS, "click on US Doller");

		} catch (Exception e) {

			e.getStackTrace();

			LoggerHandler.info("failed to click on product dropdown");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed screenshotThree", test,
					"failed to failed to click on product dropdown");

		}
	}

	/*
	 * Method Name: Send Key actions on INR input field Author: Tharun S
	 * Description:Perform a click on INR Input field. Performs a input action on
	 * the 'INR field' element. Return Type: void
	 */
	public void inrInput() {

		try {

			webDriverHelper.explicityWait(7, loc.getInrInput());

			webDriverHelper.clickOnElement(loc.getInrInput());

			webDriverHelper.explicityWait(7, loc.getInrInput());

			webDriverHelper.sendKeys(loc.getInrInput(), "5000");

			LoggerHandler.info("value sent in inr field");

			test.log(Status.PASS, "value sent in inr field");

		} catch (Exception e) {

			e.getStackTrace();

			LoggerHandler.info("failed to click on product dropdown");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed screenshotThree", test,
					"failed to failed to click on product dropdown");

		}
	}

	/*
	 * Method Name: Send Key actions on mobile number input field Author: Tharun S
	 * Description:Perform a click on INR mobile number input field. Performs a
	 * input action on the 'mobile number Input' element. Return Type: void
	 */
	public void mobilenoInput() {

		try {

			webDriverHelper.explicityWait(7, loc.getMobileNoInput());

			webDriverHelper.clickOnElement(loc.getMobileNoInput());

			webDriverHelper.explicityWait(7, loc.getMobileNoInput());

			webDriverHelper.sendKeys(loc.getMobileNoInput(), "9876543210");

			LoggerHandler.info("input mobile number success");

			test.log(Status.PASS, "input mobile number success");

		} catch (Exception e) {

			e.getStackTrace();

			LoggerHandler.info("failed to input mobile number");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed screenshotThree", test, "failed to input mobile number");

		}

	}

	/*
	 * Method Name: Send Key actions on Email input Field Author: Tharun S
	 * Description:Perform a click on Email input field. Performs a input action on
	 * the 'Email input field' element. Return Type: void
	 */
	public void emailInput() {

		try {

			webDriverHelper.explicityWait(7, loc.getEmailInput());

			webDriverHelper.clickOnElement(loc.getEmailInput());

			webDriverHelper.explicityWait(7, loc.getMobileNoInput());

			webDriverHelper.sendKeys(loc.getEmailInput(), "abcd@gmail.com");

			LoggerHandler.info("email input success");

			test.log(Status.PASS, "email input success");

		} catch (Exception e) {

			e.getStackTrace();

			LoggerHandler.info("failed to input email");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed screenshotThree", test, "failed to failed to input email");

		}

	}

	/*
	 * Method Name: click Quote Author: Tharun S Description: Performs a click
	 * action on the 'Quote' element. Return Type: void
	 */
	public void clickonQuote() {

		try {

			webDriverHelper.explicityWait(7, loc.getGetQuote());

			webDriverHelper.clickOnElement(loc.getGetQuote());

			LoggerHandler.info("click on get quote");

			test.log(Status.PASS, "click on get quote");

		} catch (Exception e) {

			e.getStackTrace();

			LoggerHandler.info("failed to click on quote");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed screenshotThree", test, "failed to failed to click on quote");

		}

	}

	/*
	 * Method Name: click Know your Card Balance Author: Tharun S Description:
	 * Performs a click action on the 'Know your Card Balance' element. Return Type:
	 * void
	 */
	public void clickOnKnowyourCardBalance() {

		try {

			webDriverHelper.explicityWait(7, loc.getKnowYourCard());

			webDriverHelper.clickOnElement(loc.getKnowYourCard());

			webDriverHelper.switchToNewWindow();

		} catch (Exception e) {

			e.getStackTrace();

			LoggerHandler.info("failed to click on Know your Card Balance");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed screenshotThree", test,
					"failed to failed to click on Know your Card Balance");

		}
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public void cickOnCard() {
		try {
			webDriverHelper.explicityWait(60, loc.forexcard);
			webDriverHelper.javascriptScroll(loc.forexcard);
			webDriverHelper.explicityWait(60, loc.forexcard);
			webDriverHelper.clickOnElement(loc.forexcard);
			test.log(Status.PASS, "Assertion pass for test case 1");
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");
			LoggerHandler.info("click on forex card");
			test.log(Status.PASS, "click on forex card");
			webDriverHelper.switchToNewWindow();
		} catch (Exception e) {

			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed1", test, "failed");
		}
	}

	public void verification1() {
		try {
			webDriverHelper.explicityWait(60, loc.cardverification);
			String value = webDriverHelper.getText(loc.cardverification);
			System.out.println(value);
			Assert.assertEquals(value, "Travel Prepaid Forex Card");
			LoggerHandler.info("Assertion pass for test case 1");
			test.log(Status.PASS, "Assertion pass for test case 1");
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");
		} catch (Exception e) {

			e.getStackTrace();

			LoggerHandler.error("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("test1", test, "failed test1");
		}
	}

	public void clickOnProductStudyBuddy() {

		try {
			Base.driver.navigate().refresh();
			// webDriverHelper.hoverOverElement(loc.getProductDropdown());
			// Thread.sleep(2000);

			// webDriverHelper.explicityWait(20, loc.getProductDropdown());

			webDriverHelper.explicityWait(50, loc.getProductDropdown());

			webDriverHelper.clickOnElement(loc.getProductDropdown());
			test.log(Status.PASS, "Assertion pass for test case 1");
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");

			LoggerHandler.info("click on product dropdown");

			test.log(Status.PASS, "click on product dropdown");

		} catch (Exception e) {
			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed1", test, "failed");

		}

	}

	public void clickOnstudyBuddy() {

		try {

			webDriverHelper.explicityWait(20, loc.getOneCard());

			Dropdown.selectDropdown("Study Buddy card");

			// help.clickOnElement(loc.getOneCard());

			LoggerHandler.info("click on one card");

			test.log(Status.PASS, "click on one card");

		} catch (Exception e) {

			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed1", test, "failed");

		}
	}

	public void clickOnForexAmount() {
		try {
			webDriverHelper.explicityWait(20, loc.forexAmount);
			webDriverHelper.clickOnElement(loc.forexAmount);
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");
			LoggerHandler.info("click on forex amount");
			test.log(Status.PASS, "click on forex amount");

			webDriverHelper.explicityWait(20, loc.forexAmount);
			webDriverHelper.sendKeys(loc.forexAmount, "100");
			webDriverHelper.explicityWait(40, loc.distraction);
			webDriverHelper.clickOnElement(loc.distraction);
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");
			String value = webDriverHelper.getText(loc.distraction);
			Assert.assertEquals(value, "Forex Amount");
			Screenshot.captureScreenshot("INRverify");
			LoggerHandler.info("Assertion pass for test case 2");
			test.log(Status.PASS, "Assertion pass for test case 2");
			Reporter.attachScreenshotToReport("test2Pass", test, "Assertion pass for test case 2");
		} catch (Exception e) {
			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed1", test, "failed");
		}
	}

	public void studyAbroad() {
		try {
			webDriverHelper.explicityWait(20, loc.forexAmount);
			webDriverHelper.hoverOverElement(loc.studyAbroad);
			webDriverHelper.explicityWait(20, loc.forexAmount);
			webDriverHelper.clickOnElement(loc.studyAbroad);
			LoggerHandler.info("click on product dropdown");
			test.log(Status.PASS, "click on product dropdown");

		} catch (Exception e) {
			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed1", test, "failed");
		}
	}

	public void studyAbroad2() {
		try {
			webDriverHelper.explicityWait(60, loc.productSA);
			webDriverHelper.clickOnElement(loc.productSA);
			LoggerHandler.info("click on product dropdown");
			test.log(Status.PASS, "click on product dropdown");
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");
			webDriverHelper.explicityWait(60, loc.sendExpenses);
			webDriverHelper.clickOnElement(loc.sendExpenses);
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");
			LoggerHandler.info("click on send expenses");
			test.log(Status.PASS, "click on send expenses");
			webDriverHelper.explicityWait(60, loc.sACurrency);
			webDriverHelper.clickOnElement(loc.sACurrency);
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");
			LoggerHandler.info("click currency");
			test.log(Status.PASS, "click on currency");
			webDriverHelper.explicityWait(60, loc.getUsDollar());
			webDriverHelper.clickOnElement(loc.getUsDollar());
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");
			LoggerHandler.info("click on dollar");
			test.log(Status.PASS, "click on dollar");
			String text = webDriverHelper.getText(loc.recevingAmount);
			Assert.assertEquals(text, "Receiving amount");
			Screenshot.captureScreenshot("INRverify");
			LoggerHandler.info("Assertion pass for test case 3");
			test.log(Status.PASS, "Assertion pass for test case 3");
			Reporter.attachScreenshotToReport("test3Pass", test, "Assertion pass for test case 3");
		} catch (Exception e) {
			e.getStackTrace();

			LoggerHandler.info("failed3 ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed3", test, "failed3");
		}
	}

	public void lounge() {
		try {
			webDriverHelper.explicityWait(30, loc.forexEducation);
			webDriverHelper.javascriptScroll(loc.forexEducation);
			Thread.sleep(5000);
			webDriverHelper.explicityWait(30, loc.forexEducation);
			webDriverHelper.clickOnElement(loc.forexEducation);
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");
			LoggerHandler.info("click on dollar");
			test.log(Status.PASS, "click on dollar");
			webDriverHelper.switchToNewWindow();
		} catch (Exception e) {
			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed1", test, "failed");
		}
	}

	public void loungePage() {
		try {
			webDriverHelper.explicityWait(60, loc.lounge);
			webDriverHelper.javascriptScroll(loc.lounge);
			webDriverHelper.explicityWait(60, loc.lounge);
			webDriverHelper.clickOnElement(loc.lounge);
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");
			LoggerHandler.info("click on dollar");
			test.log(Status.PASS, "click on dollar");
			Thread.sleep(5000);
			String text = webDriverHelper.getText(loc.longueverify);
			Assert.assertEquals(text, "Minimum Load Value 3000 USD eqv.");
			Screenshot.captureScreenshot("lounge");
			LoggerHandler.info("Assertion pass for test case 4");
			test.log(Status.PASS, "Assertion pass for test case 4");
			Reporter.attachScreenshotToReport("test4Pass", test, "Assertion pass for test case 3");
		} catch (Exception e) {
			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed1", test, "failed");

		}
	}

	public void clickOnGetQut(String number) {
		try {
			webDriverHelper.explicityWait(60, loc.retriverQuote);
			webDriverHelper.javascriptScroll(loc.retriverQuote);
			Thread.sleep(3000);
			webDriverHelper.clickOnElement(loc.retriverQuote);
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");
			LoggerHandler.info("click on quote");
			test.log(Status.PASS, "click on quote");
			webDriverHelper.explicityWait(60, loc.moblieNoInput);
			webDriverHelper.clickOnElement(loc.moblieNoInput);
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");
			LoggerHandler.info("click on moblie no");
			test.log(Status.PASS, "click on moble no");
			webDriverHelper.explicityWait(60, loc.moblieNoInput);
			//
			webDriverHelper.sendKeys(loc.moblieNoInput, number);
			Thread.sleep(3000);
			Screenshot.captureScreenshot("mobilenumber");
			Reporter.attachScreenshotToReport("test5", test, "test 5 pass");
		} catch (Exception e) {
			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed1", test, "failed");
		}
	}

	public void learnMoreAction() {
		try {
			webDriverHelper.explicityWait(60, loc.learnMore);
			webDriverHelper.javascriptScroll(loc.learnMore);
			Thread.sleep(3000);
			webDriverHelper.clickOnElement(loc.learnMore);
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");
			LoggerHandler.info("click on learn more");
			test.log(Status.PASS, "click on learn more");
			webDriverHelper.switchToNewWindow();
		} catch (Exception e) {
			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed1", test, "failed");
		}
	}

	public void learnMoreWindow(String text) {
		try {
			webDriverHelper.explicityWait(60, loc.emailofLearnMore);
			webDriverHelper.javascriptScroll(loc.emailofLearnMore);
			Thread.sleep(3000);
			webDriverHelper.clickOnElement(loc.emailofLearnMore);
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");
			LoggerHandler.info("click on email");
			test.log(Status.PASS, "click on email");
			Thread.sleep(2000);
			webDriverHelper.sendKeys(loc.emailofLearnMore, text);
			Thread.sleep(2000);
			webDriverHelper.clickOnElement(loc.submitbtn);
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");
			LoggerHandler.info("click on submit");
			test.log(Status.PASS, "click on submit");
			Thread.sleep(3000);
			Screenshot.captureScreenshot("email");
			Reporter.attachScreenshotToReport("test6", test, "test 6 pass");

		} catch (Exception e) {
			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed1", test, "failed");
		}
	}

	public void customer() {
		try {
			webDriverHelper.explicityWait(60, loc.navigateButton);
			webDriverHelper.javascriptScroll(loc.navigateButton);
			Thread.sleep(3000);
			webDriverHelper.clickOnElement(loc.navigateButton);
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");
			LoggerHandler.info("click on navigate button");
			test.log(Status.PASS, "click on navigate button");

			webDriverHelper.explicityWait(60, loc.verifyCustomer);
			String text = webDriverHelper.getText(loc.verifyCustomer);
			Thread.sleep(2000);
			Assert.assertEquals(text, "K. Jayasankar");
			Thread.sleep(2000);
			Screenshot.captureScreenshot("ArcotCustomer");
			LoggerHandler.info("Assertion pass for test case 7");
			test.log(Status.PASS, "Assertion pass for test case 7");
			Reporter.attachScreenshotToReport("test7Pass", test, "Assertion pass for test case 7");

		} catch (Exception e) {
			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed1", test, "failed");
		}
	}

	public void sendMoney() {
		try {
			webDriverHelper.explicityWait(60, loc.sendMoney);
			webDriverHelper.hoverOverElement(loc.sendMoney);
			webDriverHelper.explicityWait(60, loc.sendMoney);
			webDriverHelper.clickOnElement(loc.sendMoney);
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");
			LoggerHandler.info("click on send money");
			test.log(Status.PASS, "click on send money");

		} catch (Exception e) {
			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed1", test, "failed");
		}
	}

	public void clickOnCOnCash() {
		try {
			webDriverHelper.explicityWait(60, loc.payInCash);
			webDriverHelper.javascriptScroll(loc.payInCash);
			Thread.sleep(3000);
			webDriverHelper.clickOnElement(loc.payInCash);
			Reporter.attachScreenshotToReport("payincash", test, "pass");
			LoggerHandler.info("click on pay in cash");
			test.log(Status.PASS, "click on pay in cash");

			webDriverHelper.explicityWait(60, loc.payInCash);
			Thread.sleep(2000);
			String text = webDriverHelper.getText(loc.paycashverify);
			System.out.println(text);
			Assert.assertEquals(text, "Can I pay in cash?");
			Screenshot.captureScreenshot("payInCash");
			LoggerHandler.info("Assertion pass for test case 8");
			test.log(Status.PASS, "Assertion pass for test case 8");
			Reporter.attachScreenshotToReport("test8Pass", test, "Assertion pass for test case 8");

		} catch (Exception e) {
			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed8", test, "failed");
		}
	}

	public void clickOnLinkedin() {
		try {
			webDriverHelper.explicityWait(20, loc.linkedin);
			webDriverHelper.javascriptScroll(loc.linkedin);
			Thread.sleep(3000);
			webDriverHelper.clickOnElement(loc.linkedin);
			Reporter.attachScreenshotToReport("linkedinu", test, "Assertion pass for test case 1");
			LoggerHandler.info("click on linkedin");
			test.log(Status.PASS, "click on linkedin");

			webDriverHelper.switchToNewWindow();
			webDriverHelper.explicityWait(20, loc.verifySignin);
			String value = webDriverHelper.getText(loc.verifySignin);
			Assert.assertEquals(value, "Sign in");
			Screenshot.captureScreenshot("linkedin");
			LoggerHandler.info("linkedin verified");
			test.log(Status.PASS, "linkedin verified");
			Reporter.attachScreenshotToReport("linkedinVerified", test, "failed to failed to click on quote");

		} catch (Exception e) {
			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed1", test, "failed");
		}
	}

	public void thomasCookInfoVerification() {
		try {
			webDriverHelper.explicityWait(20, loc.thomasCookInfo);
			webDriverHelper.javascriptScroll(loc.thomasCookInfo);
			Thread.sleep(3000);
			webDriverHelper.clickOnElement(loc.thomasCookInfo);
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");
			LoggerHandler.info("click on info");
			test.log(Status.PASS, "click on info");

			webDriverHelper.explicityWait(20, loc.thomasCookInfoVerification);
			String value = webDriverHelper.getText(loc.thomasCookInfoVerification);
			Assert.assertEquals(value, "ABOUT THE SITE");
			Screenshot.captureScreenshot("ThomasCookInfo");
			LoggerHandler.info("info verified");

			test.log(Status.PASS, "info verified");

			Reporter.attachScreenshotToReport("infoverified", test, "info verified");

		} catch (Exception e) {
			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed1", test, "failed");
		}
	}

	public void thomasCookToursAndTravel() {
		try {
			webDriverHelper.explicityWait(20, loc.internationalHolidays);
			webDriverHelper.javascriptScroll(loc.internationalHolidays);
			Thread.sleep(3000);
			webDriverHelper.clickOnElement(loc.internationalHolidays);
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");
			LoggerHandler.info("click on international holiday");
			test.log(Status.PASS, "click on international holiday");

			webDriverHelper.explicityWait(20, loc.packages);
			webDriverHelper.clickOnElement(loc.packages);
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");
			LoggerHandler.info("click on packages");
			test.log(Status.PASS, "click on packages");

		} catch (Exception e) {
			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failedp", test, "failed");
		}
	}

	public void packages() {
		try {
			webDriverHelper.explicityWait(20, loc.holidayPageVerification);
			String value = webDriverHelper.getText(loc.holidayPageVerification);
			Assert.assertEquals(value, "I want to Holiday in...");
			Screenshot.captureScreenshot("ThomasCookHolidayPackage");
			LoggerHandler.info("package verified");

			test.log(Status.PASS, "package verified");

			Reporter.attachScreenshotToReport("packageverified", test, "package verified");

		} catch (Exception e) {
			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failedp", test, "failed");
		}
	}

	public void exchange() {
		try {
			webDriverHelper.explicityWait(20, loc.exchange);
			webDriverHelper.javascriptScroll(loc.exchange);
			Thread.sleep(3000);
			webDriverHelper.clickOnElement(loc.exchange);
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");
			LoggerHandler.info("click on exchange");
			test.log(Status.PASS, "click on exchange");

			webDriverHelper.explicityWait(20, loc.exchange);
			webDriverHelper.clickOnElement(loc.Bangalore);
			Reporter.attachScreenshotToReport("test1Pass", test, "Assertion pass for test case 1");
		} catch (Exception e) {
			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed1", test, "failed");
		}
	}

	public void BangaloreVerification() {
		try {
			webDriverHelper.explicityWait(20, loc.BangaloreVerify);
			String value = webDriverHelper.getText(loc.BangaloreVerify);
			Assert.assertEquals(value, "Currency Exchange in Bangalore");
			Screenshot.captureScreenshot("BangaloreVerification");
			LoggerHandler.info("Bangalore verified");
			test.log(Status.PASS, "Bangalore verified");
			Reporter.attachScreenshotToReport("bangaloreverified", test, "bangalore verified");

		} catch (Exception e) {
			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed1", test, "failed");
		}
	}

	public void androidVerification() {
		try {
			webDriverHelper.explicityWait(20, loc.androidVerify);
			String value = webDriverHelper.getText(loc.androidVerify);
			System.out.println(value);
			Assert.assertEquals(value, "google_logo Play");
			Screenshot.captureScreenshot("google Play");
			LoggerHandler.info("google verified");
			test.log(Status.PASS, "google verified");
			Reporter.attachScreenshotToReport("google verified", test, "info verified");

		} catch (Exception e) {
			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed1", test, "failed");
		}
	}
	public void giftcard() {
		try {
			webDriverHelper.explicityWait(100, loc.gitCard);
			webDriverHelper.hoverOverElement(loc.gitCard);
			webDriverHelper.explicityWait(100, loc.gitCard);
			webDriverHelper.clickOnElement(loc.gitCard);
			LoggerHandler.info("giftcard click");
			test.log(Status.PASS, "giftcard click");
			Reporter.attachScreenshotToReport("verified", test, "giftcard click");
			webDriverHelper.explicityWait(100, loc.offers);
			webDriverHelper.clickOnElement(loc.offers);
		} catch (Exception e) {
			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed1", test, "failed");
		}
		}
	public void giftoffers() {
		try {
			Thread.sleep(3000);
			Screenshot.captureScreenshot("final");
			Reporter.attachScreenshotToReport("verified", test, "giftcard click");
		}catch (Exception e) {
			e.getStackTrace();

			LoggerHandler.info("failed ");

			test.log(Status.FAIL, "Failed test");

			Reporter.attachScreenshotToReport("failed1", test, "failed");
		}
		}
}
