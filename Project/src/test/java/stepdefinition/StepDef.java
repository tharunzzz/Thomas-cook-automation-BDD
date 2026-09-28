package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForexCardActions;
import pages.HomePageActions;

public class StepDef {
	ExtentTest test;
	HomePageActions actobj;
	ForexCardActions fcaobj;
	
	@Given("User Enters the Thomas Cook website")
	public void user_enters_the_thomas_cook_website() {
		test=Hooks.report.createTest("test1");
		actobj=new HomePageActions(test);
		fcaobj=new ForexCardActions(test);
	}
	@When("Clicks on Forex")
	public void clicks_on_forex() {
	   actobj.clickOnForex();
	}
	@When("Clicks Forex Card")
	public void clicks_forex_card() {
	   fcaobj.cickOnCard();;
	}
	@Then("Verify Travel Prepaid Forex Card")
	public void verify_travel_prepaid_forex_card() {
		 fcaobj.verification1();
	}
}
