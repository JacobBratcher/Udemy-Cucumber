package stepDefinitons;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainSteps {
	
@Given("User is on NetBanking landing page")
public void user_is_on_net_banking_landing_page() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User landed on the NetBanking landing page");
}

@Given("User is on Practice landing page")
public void user_is_on_practice_landing_page() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User landed on the Practice landing page");
}

@When("User signup into application")
public void user_signup_into_application(List<String> data) {
	//driver.findElement(sendKeys(data.get(0)
	System.out.println(data.get(0));
	System.out.println(data.get(1));
	System.out.println(data.get(2));
	System.out.println(data.get(3));
}

/*
 * @When("User logins into application with {string} and password {string}")
 * public void user_logins_into_application_with_and_password(String username,
 * String password) { // Write code here that turns the phrase above into
 * concrete actions System.out.println(username +"and password is "+password); }
 */

// username and password string is replaced with any data type in this example - (.+)
// cap symbol ^ at the beginning and dollar symbol $ is required at the end when using this data type 
@When("^User logins into application with (.+) and password (.+)$")
public void user_logins_into_application_with_and_password(String username, String password) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(username +"and password is "+password);
}

@Then("Homepage is displayed")
public void homepage_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Homepage is displayed");
}

@Then("Cards are displayed")
public void cards_are_displayed() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Cards are displayed on the page");
	}

@Given("setup the entries in the database")
public void setupEntries() {
	System.out.println("*********************");
	System.out.println("setup the entries in the database");
}

@When("launch the browser from config variables")  
public void launchBrowser() {
	System.out.println("launch the browser from config variables");
}

@When("hit the home page url of banking site") 
public void urlLaunch() {
	System.out.println("hit the home page url of banking site ");
}

}