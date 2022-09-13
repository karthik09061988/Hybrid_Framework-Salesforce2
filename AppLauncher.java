package com.Salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class AppLauncher extends ProjectSpecificMethods{
	
	public Individuals clickIndividualsLink() {
		clearAndType(locateElement(Locators.XPATH, "//input[@placeholder='Search apps or items...']"), "Indi");
		click(locateElement(Locators.XPATH, "//p[@class='slds-truncate']"));
		reportStep("Individuals link is clicked", "pass");
		return new Individuals();
	}

}
