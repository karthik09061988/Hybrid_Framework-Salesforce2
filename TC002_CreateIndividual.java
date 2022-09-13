package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Salesforce.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class TC002_CreateIndividual extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "Create Individual";
		testDescription ="Create Individual with mandatory fields";
		authors="karthik";
		category ="Assessment";
		excelFileName="CreateIndividual";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password, String firstName, String lastName, String individualName) {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.verifyHomePage001()
		.clickAppLauncher()
		.clickIndividualsLink()
		.clickCreateIndividualLink()
		.enterLastname(lastName)
		.ClickNewIndividualSaveButton()
		.VerifyNewIndividual()
		.EditIndividual()
		.selectSalutation()
		.EnterFirstname(firstName)
		.ClickIndividualSaveButton()
		.verifyFirstName(individualName);
		
	}
}