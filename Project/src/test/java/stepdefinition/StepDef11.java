package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForexCardActions;
import pages.HomePageActions;

public class StepDef11 {
	ExtentTest test;
	HomePageActions homePageObj;
	ForexCardActions forexobj;
	@Given("User Enters the Thomas Cook website eleven")
	public void user_enters_the_thomas_cook_website_eleven() {
		test=Hooks.report.createTest("test11");
		homePageObj=new HomePageActions(test);
		forexobj=new ForexCardActions(test);
	}
	@When("I click on forex eleven")
	public void i_click_on_forex_eleven() {
		homePageObj.clickOnForex();
	}
	@Then("I click on tours and travell and verify")
	public void i_click_on_tours_and_travell_and_verify() {
		forexobj.thomasCookToursAndTravel();
		forexobj.packages();
	}
}
