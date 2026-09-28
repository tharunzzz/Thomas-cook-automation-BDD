package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForexCardActions;
import pages.HomePageActions;

public class StepDef10 {
	ExtentTest test;
	HomePageActions homePageObj;
	ForexCardActions forexobj;
	@Given("User Enters the Thomas Cook website ten")
	public void user_enters_the_thomas_cook_website_ten() {
		test=Hooks.report.createTest("test10");
		homePageObj=new HomePageActions(test);
		forexobj=new ForexCardActions(test);
	}
	@When("I click on forex ten")
	public void i_click_on_forex_ten() {
		homePageObj.clickOnForex();
	}
	@Then("I click on information and verify")
	public void i_click_on_information_and_verify() {
		forexobj.thomasCookInfoVerification();
	}
}
