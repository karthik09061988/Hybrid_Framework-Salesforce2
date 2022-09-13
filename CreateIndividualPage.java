package com.Salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CreateIndividualPage extends ProjectSpecificMethods{
	
	public CreateIndividualPage enterLastname(String data) {
		clearAndType(locateElement(Locators.XPATH, "//input[contains(@class,'lastName compoundBLRadius')]"), data);
		reportStep(data+" Last name is entered successfully","pass");
		return this;
	}
	
	public CreateIndividualPage ClickNewIndividualSaveButton(){
		click(locateElement(Locators.XPATH, "//button[@title='Save']//span[1]"));
		reportStep("New Individual button is clicked successfully", "pass");
		return this;
	}
		
		public IndividualCreated VerifyNewIndividual(){
			verifyDisplayed(locateElement(Locators.XPATH, "//div[@title='Edit']"));			
			reportStep("New Individual is created", "pass");
			return new IndividualCreated();
				
	}
}