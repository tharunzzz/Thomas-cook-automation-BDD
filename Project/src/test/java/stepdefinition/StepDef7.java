package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForexCardActions;
import pages.HomePageActions;

public class StepDef7 {
	ExtentTest test;
	HomePageActions homePageObj;
	ForexCardActions forexobj;
	@Given("User Enters the Thomas Cook website seven")
	public void user_enters_the_thomas_cook_website_seven() {
		test=Hooks.report.createTest("test7");
		homePageObj=new HomePageActions(test);
		forexobj=new ForexCardActions(test);
	}
	@When("I click on forex seven")
	public void i_click_on_forex_seven() {
		homePageObj.clickOnForex();
	}
	@Then("I click on customer navigation and verify seven")
	public void i_click_on_customer_navigation_and_verify_seven() {
		forexobj.customer();
	}
}
