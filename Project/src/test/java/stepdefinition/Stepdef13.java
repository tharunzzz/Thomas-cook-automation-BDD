package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForexCardActions;
import pages.HomePageActions;

public class Stepdef13 {
	ExtentTest test;
	HomePageActions homePageObj;
	ForexCardActions forexobj;
	@Given("User Enters the Thomas Cook website thr")
	public void user_enters_the_thomas_cook_website_thr() {
		test=Hooks.report.createTest("test13");
		homePageObj=new HomePageActions(test);
		forexobj=new ForexCardActions(test);
	}
	@When("I hover on forex thr")
	public void i_hover_on_forex_thr() {
		homePageObj.hoverOverForex();
	}
	@When("I click on android thr")
	public void i_click_on_android_thr() {
		homePageObj.cickOnAndroid();
	}
	@Then("I verify android")
	public void i_verify_android() {
		forexobj.androidVerification();
	}
}
