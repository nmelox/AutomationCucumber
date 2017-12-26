package Steps;

import org.openqa.selenium.WebDriver;
import Tools.Context;
import PageObject.HomePage;
import PageObject.SignOnPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LogOn {
	private Context context;
	private WebDriver driver;
	private HomePage home;
	private SignOnPage signOn;
	
	public LogOn (Context context){
		this.context = context;
		driver = context.getDriver();
	}
	
	@Given("^I enter a username (.*)")
	public void I_enter_a_username (String username){
		home.enterUserName(username);
	}
	
	@Given("^I enter a password (.*)")
	public void I_enter_password (String userpassword){
		home.enterPassword(userpassword);
	}
	
	 @When("^I click  Sign-In button")
	 public void I_click_Sign_In_button (){
		 home.clickSubmitButton();
	 }
	 
	 @Then("^login result must be (.*)")
	 public void Login_result_must_be (String result){
		 if (result.toUpperCase() == "BADLOGIN"){
			 signOn = new SignOnPage (driver);
			 signOn.verifyInPage();
		 } else{
			 return;
		 }
	 }
	 
}
