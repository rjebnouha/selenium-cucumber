package com.automation.e2etests.steps_définitions;

import org.junit.jupiter.api.Assertions;
import com.automation.e2etests.pages_objects.AddEmpoyeePage;
import com.automation.e2etests.pages_objects.LoginPage;
import com.automation.e2etests.utils.ConfigFileReader;
import com.automation.e2etests.utils.SeleniumUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeStep_definition {

	LoginStepDefinition loginStepDefinition;
	LoginPage loginPage;
	AddEmpoyeePage ajoutEmployePage;
	ConfigFileReader configFileReader;
	SeleniumUtils seleniumUtils;

	public AddEmployeeStep_definition() {

		loginStepDefinition = new LoginStepDefinition();
		loginPage = new LoginPage();
		ajoutEmployePage = new AddEmpoyeePage();
		configFileReader = new ConfigFileReader();
		seleniumUtils = new SeleniumUtils();
	}

	@Given("J ouvre le site OrangeHRM et Je connect à OrangeHRM en tant qu administrateur")
	public void jeConnectÀOrangeHRMEnTantQuAdministrateur() throws InterruptedException {
		loginStepDefinition.openSiteAndLogin();
		
	}

	@When("Je clique sur le menu PIM")
	public void jeCliqueSurLeMenuPIM() throws InterruptedException  {
		seleniumUtils.waitForElementToBeClickable(AddEmpoyeePage.getPim());
		seleniumUtils.waitForElementToBeClickable(AddEmpoyeePage.getPim());
		seleniumUtils.click(AddEmpoyeePage.getPim());

	}

	@When("Je clique sur le menu Add Employee")
	public void jeCliqueSurLeMenuAddEmployee() {
		seleniumUtils.waitForElementToBeClickable(AddEmpoyeePage.getAddemployee());
		seleniumUtils.click(AddEmpoyeePage.getAddemployee());

	}

	@When("Je remplire le formulaire")
	public void jeRemplireLeFormulaire() {
		
		seleniumUtils.waitForElementToBeClickable(AddEmpoyeePage.getfirstName());
		seleniumUtils.writeText(AddEmpoyeePage.getfirstName(), configFileReader.getProperty("firstName"));
		
		seleniumUtils.waitForElementToBeClickable(AddEmpoyeePage.getmiddleName());
		seleniumUtils.writeText(AddEmpoyeePage.getmiddleName(), configFileReader.getProperty("middleName"));
		
		seleniumUtils.waitForElementToBeClickable(AddEmpoyeePage.getlastName());
		seleniumUtils.writeText(AddEmpoyeePage.getlastName(), configFileReader.getProperty("lastName"));
		
		seleniumUtils.waitForElementToBeClickable(AddEmpoyeePage.getid());
		seleniumUtils.writeText(AddEmpoyeePage.getid(), configFileReader.getProperty("id"));

	}

	@When("Je clique sur Save")
	public void jeCliqueSurSave() {
		seleniumUtils.click(AddEmpoyeePage.getbtnsave());
	}

	@Then("Une notification verte avec le message {string} est visible")
	public void uneNotificationVerteAvecLeMessageEstVisible(String notification) {
		String result = seleniumUtils.readText(AddEmpoyeePage.getnotification());
		Assertions.assertEquals(result, notification);
	}

	@Then("Sa fiche employé s’affiche dans le système")
	public void saFicheEmployéSAfficheDansLeSystème() {
		String expectedFirstName = configFileReader.getProperty("firstName");
		String expectedLastName = configFileReader.getProperty("lastName");
		String fullName = seleniumUtils.readText(AddEmpoyeePage.getEmployeeName());
		Assertions.assertTrue(fullName.contains(expectedFirstName));
		Assertions.assertTrue(fullName.contains(expectedLastName));

	}


}
