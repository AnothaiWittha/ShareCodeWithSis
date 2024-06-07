package StepDefinitions;

import Utilities2.Driver2;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks2 {

	

	@Before
	public void setUp() {
		//call Driver class and getDriver method
		Driver2.getDriver();
		
		System.out.println("#########TEST STARTED ##########");
		
	}
	
	@After
	public void tearDown() {
		//call Driver class and closeDriver method
		Driver2.closeDriver();
		
		System.out.println("!!!!!!!!!!!!TEST ENDED !!!!!!!!!!!!!!");
		
	}
}




