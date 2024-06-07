package Page2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities2.Driver2;

public class LoginPage2 {

	public LoginPage2() {
		PageFactory.initElements(Driver2.getDriver(), this);
	}

	@FindBy(xpath = "//*[@name=\"username\"]")
	private WebElement usernameBox;

	@FindBy(xpath = "//*[@name=\"password\"]")
	private WebElement passwordBox;
	
	@FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")
	private WebElement submitButton;
	
	
	@FindBy(xpath = "//*[@role=\"alert\"]")
	private WebElement errorMsg;
	
	
	
	

	public WebElement getUsernameBox() {
		return usernameBox;
	}

	public void setUsernameBox(WebElement usernameBox) {
		this.usernameBox = usernameBox;
	}

	public WebElement getPasswordBox() {
		return passwordBox;
	}

	public void setPasswordBox(WebElement passwordBox) {
		this.passwordBox = passwordBox;
	}
	
	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	public void setSubmitButton(WebElement submitButton) {
		this.submitButton = submitButton;
	}
	
	public WebElement getErrorMsg() {
		return errorMsg;
	}
	
	public void setSErrorMsg(WebElement errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	
}
