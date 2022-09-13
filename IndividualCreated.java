package com.Salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class IndividualCreated extends ProjectSpecificMethods{
	
	
	public IndividualCreated EditIndividual(){
		click(locateElement(Locators.XPATH, "//div[@title='Edit']"));
		reportStep("Edit button is clicked successfully", "pass");
		return this;
	}
	
	public IndividualCreated selectSalutation() {
		click(locateElement(Locators.XPATH,"//a[@class='select']"));
		click(locateElement(Locators.XPATH, "(//a[@role='menuitemradio'])[2]"));
		reportStep(" Salutation is selected successfully","pass");
		return this;
	}
	
	public IndividualCreated EnterFirstname(String data){
		clearAndType(locateElement(Locators.XPATH, "//input[contains(@class,'firstName compoundBorderBottom')]"), data);
		reportStep("First name is enterd successfully", "pass");
		return this;
	}
		
	
	public ViewIndividualPage ClickIndividualSaveButton(){
		click(locateElement(Locators.XPATH, "//button[@title='Save']//span[1]"));
		reportStep("Individual Record updated successfully", "pass");
		return new ViewIndividualPage ();
				
	}
	
	}