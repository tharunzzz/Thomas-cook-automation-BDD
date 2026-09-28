package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForexCardActions;
import pages.HomePageActions;

public class StepDef12 {
	ExtentTest test;
	HomePageActions homePageObj;
	ForexCardActions forexobj;
@Given("User Enters the Thomas Cook website twe")
public void user_enters_the_thomas_cook_website_twe() {
	test=Hooks.report.createTest("test11");
	homePageObj=new HomePageActions(test);
	forexobj=new ForexCardActions(test);
}
@When("I click on forex twe")
public void i_click_on_forex_twe() {
	homePageObj.clickOnForex();
}
@When("I click on exchange")
public void i_click_on_exchange() {
	forexobj.exchange();
}
@Then("I click on bangalore and verify")
public void i_click_on_bangalore_and_verify() {
	forexobj.BangaloreVerification();
}
}
