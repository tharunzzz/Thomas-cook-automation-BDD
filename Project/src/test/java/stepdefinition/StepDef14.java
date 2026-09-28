package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForexCardActions;
import pages.HomePageActions;

public class StepDef14 {
	ExtentTest test;
	HomePageActions homePageObj;
	ForexCardActions forexobj;
	@Given("User Enters the Thomas Cook website fourteen")
	public void user_enters_the_thomas_cook_website_fourteen() {
		test=Hooks.report.createTest("test14");
		homePageObj=new HomePageActions(test);
		forexobj=new ForexCardActions(test);
	}
	@When("I hover on forex fourteen")
	public void i_hover_on_forex_fourteen() {
	   forexobj.giftcard();
	}
	@Then("I verify offer and screenshot")
	public void i_verify_offer_and_screenshot() {
	  forexobj.giftoffers();
	}
}
