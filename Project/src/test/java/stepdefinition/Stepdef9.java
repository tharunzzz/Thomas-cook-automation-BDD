package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForexCardActions;
import pages.HomePageActions;

public class Stepdef9 {
	ExtentTest test;
	HomePageActions homePageObj;
	ForexCardActions forexobj;
	@Given("User Enters the Thomas Cook website nine")
	public void user_enters_the_thomas_cook_website_nine() {
		test=Hooks.report.createTest("test8");
		homePageObj=new HomePageActions(test);
		forexobj=new ForexCardActions(test);
	}
	@When("I click on forex nine")
	public void i_click_on_forex_nine() {
		homePageObj.clickOnForex();
	}
	@Then("I click on linkedin and verify nine")
	public void i_click_on_linkedin_and_verify_nine() {
		forexobj.clickOnLinkedin();
	}
}
