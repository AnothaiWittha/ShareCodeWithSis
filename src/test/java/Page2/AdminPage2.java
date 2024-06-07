package Page2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities2.Driver2;

public class AdminPage2 {

	public AdminPage2() {
		PageFactory.initElements(Driver2.getDriver(), this);
	}

	@FindBy(xpath = "//div[@class=\"orangehrm-dashboard-widget-name\"]")
	private WebElement timeAtWorkBoard;
	
	public WebElement getTimeAtWorkBoardText() {
		return timeAtWorkBoard;
	}

	public void setTimeAtWorkBoardTextt(WebElement timeAtWorkBoard) {
		this.timeAtWorkBoard = timeAtWorkBoard;
	}
	

}
