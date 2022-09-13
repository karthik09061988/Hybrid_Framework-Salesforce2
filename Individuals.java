package com.Salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class Individuals extends ProjectSpecificMethods{
	
	public CreateIndividualPage clickCreateIndividualLink() {
		// TODO Auto-generated method stub
		click(locateElement(Locators.XPATH, "//div[@title='New']"));
		reportStep("Create Individual Button is clicked", "pass");
		return new CreateIndividualPage();
	}

}
