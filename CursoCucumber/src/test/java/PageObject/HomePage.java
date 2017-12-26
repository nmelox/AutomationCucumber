package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage {
	private WebDriver driver;
	
	private By userField = By.name("userName");
	private By passwordField = By.name("password");
	private By submitButton = By.name("submit");
	private By registerlink = By.name("REGISTER");
	
	public HomePage (WebDriver driver){
		this.driver = driver;
	}
	
	public void enterUserName (String username){
		driver.findElement(userField).sendKeys(username);
	}
	
	public void enterPassword (String userpassword){
		driver.findElement(passwordField).sendKeys(userpassword);
	}
	
	public void clickSubmitButton (){
		driver.findElement(submitButton).click();
	}
	
	public void goToRegisterPage (){
		driver.findElement(registerlink).click();
	}
}
