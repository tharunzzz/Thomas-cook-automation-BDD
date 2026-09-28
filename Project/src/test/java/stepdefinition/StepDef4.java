package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForexCardActions;
import pages.HomePageActions;

public class StepDef4 {
	ExtentTest test;
	HomePageActions homePageObj;
	ForexCardActions forexobj;
	@Given("User Enters the Thomas Cook website four")
	public void user_enters_the_thomas_cook_website_four() {
		test=Hooks.report.createTest("test4");
		homePageObj=new HomePageActions(test);
		forexobj=new ForexCardActions(test);
	}
	@When("I click on forex four")
	public void i_click_on_forex_four() {
		homePageObj.clickOnForex();
	}
	@When("I click on forex study")
	public void i_click_on_forex_study() {
		forexobj.lounge();
	}
	@Then("verify the page four")
	public void verify_the_page_four() {
		forexobj.loungePage();
	}

}
