package com.Salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePageCheck extends ProjectSpecificMethods{
	
	public HomePageCheck verifyHomePage001() {
		verifyDisplayed(locateElement(Locators.XPATH, "//span[@class='breadcrumbDetail uiOutputText']"));
		reportStep("Homepage is loaded", "pass");
		return this;
	}
	
	public AppLauncher clickAppLauncher() {
		click(locateElement(Locators.CLASS_NAME, "slds-r5"));
		click(locateElement(Locators.XPATH, "//button[text()='View All']"));
		reportStep("AppLauncher - View all link is clicked", "pass");
		return new AppLauncher();
	}
	
	}
	

