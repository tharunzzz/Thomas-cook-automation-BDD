package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForexCardActions;
import pages.HomePageActions;

public class StepDef2 {
	ExtentTest test;
	HomePageActions homePageObj;
	ForexCardActions forexobj;
	@Given("User Enters the Thomas Cook website second")
	public void user_enters_the_thomas_cook_website_second() {
		test=Hooks.report.createTest("test2");
		homePageObj=new HomePageActions(test);
		forexobj=new ForexCardActions(test);
	}
	@When("I click on forex")
	public void i_click_on_forex() {
		homePageObj.clickOnForex();
	}
	@When("I click on Product")
	public void i_click_on_product() {
		forexobj.clickOnProductStudyBuddy();
	}
	@When("I click on studyBuddy")
	public void i_click_on_study_buddy() {
		forexobj.clickOnstudyBuddy();
	}
	@When("I click on Dollar")
	public void i_click_on_dollar() {
		forexobj.usDollerSelection();
	}
	@Then("I click on forex amount and verify")
	public void i_click_on_forex_amount_and_verify() {

		forexobj.clickOnForexAmount();
	}
}
