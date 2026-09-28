package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForexCardActions;
import pages.HomePageActions;

public class StepDef5 {
	ExtentTest test;
	HomePageActions homePageObj;
	ForexCardActions forexobj;
	@Given("User Enters the Thomas Cook website five")
	public void user_enters_the_thomas_cook_website_five() {
		test=Hooks.report.createTest("test5");
		homePageObj=new HomePageActions(test);
		forexobj=new ForexCardActions(test);
	}
	@When("I hover over on forex five")
	public void i_hover_over_on_forex_five() {
		homePageObj.hoverOverForex();
	}
	@When("I click on international univercity")
	public void i_click_on_international_univercity() {
		homePageObj.clickOnIntUni();
	}
	@Then("I enter phone number {string} click on get Quote also verify five")
	public void i_enter_phone_number_click_on_get_quote_also_verify_five(String string) {
		forexobj.clickOnGetQut(string);
	}
}
