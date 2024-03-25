package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	@Given("^User is on NetBanking landing page$")
	public void user_is_on_NetBanking_landing_Page() {
		// actual code in selenium, appium, rest assured
		System.out.println("navigated to login url");
	}

	@When("User login into application with {string} and {string}")
	public void user_login_into_application(String string1, String string2) {
	    // actual code
	    System.out.println("User logged in with "+string1+" and "+string2);
	}

	@Then("^Home page is populated$")
	public void home_page_is_Populated() {
		// actual code
		System.out.println("validated home page");
	}

	@Then("^cards are displayed$")
	public void cards_are_Displayed() {
		// actual code
		System.out.println("validated cards");
	}
}
