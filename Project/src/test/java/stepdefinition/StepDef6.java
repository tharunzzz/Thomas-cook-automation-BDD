package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForexCardActions;
import pages.HomePageActions;

public class StepDef6 {
	ExtentTest test;
	HomePageActions homePageObj;
	ForexCardActions forexobj;
	@Given("User Enters the Thomas Cook website six")
	public void user_enters_the_thomas_cook_website_six() {
		test=Hooks.report.createTest("test6");
		homePageObj=new HomePageActions(test);
		forexobj=new ForexCardActions(test);
	}
	@When("I click on forex six")
	public void i_click_on_forex_six() {
		homePageObj.clickOnForex();
	}
	@When("I click on learn more action")
	public void i_click_on_learn_more_action() {
		forexobj.learnMoreAction();
	}
	@Then("I enter email {string} also verify six")
	public void i_enter_email_also_verify_six(String string) {
		forexobj.learnMoreWindow(string);
	}
}
