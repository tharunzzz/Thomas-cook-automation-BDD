package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForexCardActions;
import pages.HomePageActions;

public class StepDef8 {
	ExtentTest test;
	HomePageActions homePageObj;
	ForexCardActions forexobj;
	@Given("User Enters the Thomas Cook website eight")
	public void user_enters_the_thomas_cook_website_eight() {
		test=Hooks.report.createTest("test8");
		homePageObj=new HomePageActions(test);
		forexobj=new ForexCardActions(test);
	}
	@When("I click on forex eight")
	public void i_click_on_forex_eight() {
		homePageObj.clickOnForex();
	}
	@When("I click on send money")
	public void i_click_on_send_money() {
		forexobj.sendMoney();
	}
	@Then("I click on cash and verify")
	public void i_click_on_cash_and_verify() {
		forexobj.clickOnCOnCash();
	}
}
