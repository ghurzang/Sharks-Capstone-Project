package step.definitions;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends Base {
	/*
	 * This class hosts two methods that will run before and after each scenario
	 * Cucumber has Hooks and we have BeforeHooks and AfterHooks
	 * Before Hooks executes a block of code before each scenario
	 * After Hooks executes a block of code after each scenario
	 *  
	 */
	
	@Before
	public void beforeHooks(Scenario scenario) {
		logger.info("scenario" +scenario.getName() +" started");
		selectBrowser(); //This method will select the browser
		launchBrowser(); //This method will launch the browser
	}
	
	@After
	public void afterHooks(Scenario scenario) {
		tearDown();
		logger.info("Scenario" +scenario.getName()+ " "+scenario.getStatus() );
	}

}
