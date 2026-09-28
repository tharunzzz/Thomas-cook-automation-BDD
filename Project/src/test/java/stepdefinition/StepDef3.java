package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForexCardActions;
import pages.HomePageActions;

public class StepDef3 {
	ExtentTest test;
	HomePageActions homePageObj;
	ForexCardActions forexobj;
	@Given("User Enters the Thomas Cook website third")
	public void user_enters_the_thomas_cook_website_third() {
		test=Hooks.report.createTest("test3");
		homePageObj=new HomePageActions(test);
		forexobj=new ForexCardActions(test);
	}
	@When("I click on forex three")
	public void i_click_on_forex_three() {
		homePageObj.clickOnForex();
	}
	@When("I click on study Abroad")
	public void i_click_on_study_abroad() {
		forexobj.studyAbroad();
	}
	@Then("verify the page")
	public void verify_the_page() {
		forexobj.studyAbroad2();
	}
}
