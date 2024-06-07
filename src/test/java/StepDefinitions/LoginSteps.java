package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import Utilities2.CommonMethods2;
import Utilities2.ConfigurationReader2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods2 {

	@Given("the user in on the login page")
	public void the_user_in_on_the_login_page() {

		driver.get(ConfigurationReader2.getProperty("url"));
	}

	@When("the user enter valid username and valid password")
	public void the_user_enter_valid_username_and_valid_password() {

		click(lp.getUsernameBox());
		sendText(lp.getUsernameBox(), "Admin");

		click(lp.getPasswordBox());
		sendText(lp.getPasswordBox(), "admin123");

	}

	@And("click the login button")
	public void click_the_login_button() {

		click(lp.getSubmitButton());

	}

	@Then("the user should be logged in successfully with title")
	public void the_user_should_be_logged_in_successfully_with_title() {

		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		System.out.println("****the above text is actual Title*******");
		Assert.assertEquals(actualTitle, "OrangeHRM");

	}

	@And("should be redirectly to the dashboard")
	public void should_be_redirectly_to_the_dashboard() {

		WebElement dbText = amp.getTimeAtWorkBoardText();
		String dbShowText = dbText.getText();
		System.out.println(dbShowText);
		System.out.println("****the above text is actual Dashboard text*******");
		Assert.assertEquals(dbShowText, "Time at Work");

	}

	@When("the user enter invalid username and invalid password")
	public void the_user_enter_invalid_username_and_invalid_password() {

		click(lp.getUsernameBox());
		sendText(lp.getUsernameBox(), "Admin5555");

		click(lp.getPasswordBox());
		sendText(lp.getPasswordBox(), "admin123555555");
	}

	@Then("the user should see the error msg")
	public void the_user_should_see_the_error_msg() {

		WebElement errorMessage = lp.getErrorMsg();
		String actualErrorMsg = errorMessage.getText();
		System.out.println(actualErrorMsg);
		System.out.println("****the above text is actual Error Message*******");
		Assert.assertEquals(actualErrorMsg, "Invalid credentials");

	}

	@And("should not be logged in")
	public void should_be_logged_in() {

	}

}
