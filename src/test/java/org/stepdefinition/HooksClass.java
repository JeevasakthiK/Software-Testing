package org.stepdefinition;

import org.Base.Base_Class;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends Base_Class {
	@Before(order = 2)
	private void precondition1() {
		System.out.println("Preconditon 1 ....");
		maxi();
	}
	@Before(order = 3)
	private void precondition2() {
		System.out.println("Precondition 2.....");
		
	}
	@Before(order = 1,value = "@tag1")
	private void precondition3() {
		System.out.println("Precondition 3.....");
		launchBrowser();
	}
	@After(order = 5)
	private void postcondition1() {
		System.out.println("Postconditon 1.....");

	}

	@After(order = 10)
	private void postcondition2() {
		System.out.println("Postconditon 2.....");

	}

}
