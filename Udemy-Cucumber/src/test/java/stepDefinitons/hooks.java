package stepDefinitons;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

	
	// @Before executes in every scenario that has @NetBanking
	@Before("@NetBanking")
	public void netBankingSetup() {
		System.out.println("*********************");

		System.out.println("setup the entires in the NetBanking database");
	}
	
	// @After without additional tag means it will execute for every scenario 
	@After
	public void tearDown() {
		System.out.println("clear the entries");
	}
	
	@Before("@Mortgage")
	public void mortgageSetup() {
		System.out.println("setup the entires in the Mortgage database");
	}
	
}


// Before -> Background -> Scenario -> After 