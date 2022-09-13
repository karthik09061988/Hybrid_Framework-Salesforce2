package com.Salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class ViewIndividualPage extends ProjectSpecificMethods {

	public ViewIndividualPage verifyFirstName(String data) {
		verifyExactText(locateElement(Locators.XPATH,"//span[@class='uiOutputText']"), data);
		reportStep(data+" is matching with Individual name", "pass");
		return this;
		
			}

}
