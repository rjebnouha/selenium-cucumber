package com.automation.e2etests.steps_définitions;

import org.junit.jupiter.api.Assertions;

import com.automation.e2etests.pages_objects.AddEmpoyeeAccountPage;
import com.automation.e2etests.pages_objects.AddEmpoyeePage;
import com.automation.e2etests.pages_objects.LoginPage;
import com.automation.e2etests.utils.ConfigFileReader;
import com.automation.e2etests.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployéCompte_StepsDefinition {
	AddEmpoyeeAccountPage addEmpoyeeAccountPage;
	LoginStepDefinition loginStepDefinition;
	LoginPage loginPage;
	ConfigFileReader configFileReader;
	SeleniumUtils seleniumUtils;

	public AddEmployéCompte_StepsDefinition() {

		addEmpoyeeAccountPage = new AddEmpoyeeAccountPage();
		loginStepDefinition = new LoginStepDefinition();
		loginPage = new LoginPage();
		configFileReader = new ConfigFileReader();
		seleniumUtils = new SeleniumUtils();
	}


	@Given("J ouvre le site OrangeHRM")
	public void jOuvreLeSiteOrangeHRM() {
	    
	}




	@Given("Je suis connecté à OrangeHRM en tant qu’administrateur")
	public void jeSuisConnectéÀOrangeHRMEnTantQuAdministrateur() throws InterruptedException {
		loginPage.seConnecterEnTantQuAdmin(configFileReader.getProperty("home.username"),
				configFileReader.getProperty("home.password"));
	}

	@When("Je clique sur le menu Admin")
	public void jeCliqueSurLeMenuAdmin() {
		seleniumUtils.click(AddEmpoyeeAccountPage.getadminMenu());

	}

	@When("Je clique sur le menu User Management")
	public void jeCliqueSurLeMenuUserManagement() {

		seleniumUtils.click(AddEmpoyeeAccountPage.getuserManagement());

	}

	@When("Je clique sur le menu Users")
	public void jeCliqueSurLeMenuUsers() {
		seleniumUtils.click(AddEmpoyeeAccountPage.getusers());
	}

	@When("Je clique sur le bouton Add")
	public void jeCliqueSurLeBoutonAdd() {
		seleniumUtils.click(AddEmpoyeeAccountPage.getadd());

	}

	@When("Je sélectionne un rôle d utilisateur")
	public void jeSélectionneUnRôleDUtilisateur() {
		seleniumUtils.writeText(AddEmpoyeeAccountPage.getuserRole(), configFileReader.getProperty("role"));

	}

	@When("Je saisis le nom de l employé dans le champ")
	public void jeSaisisLeNomDeLEmployéDansLeChamp() {
		seleniumUtils.writeText(AddEmpoyeeAccountPage.getemployeName(), configFileReader.getProperty("Employee Name"));

	}

	@When("Je définis le statut")
	public void jeDéfinisLeStatut() {
		seleniumUtils.writeText(AddEmpoyeeAccountPage.getstatus(), configFileReader.getProperty("Status"));
	}

	@When("Je saisis un nom d utilisateur unique")
	public void jeSaisisUnNomDUtilisateurUnique() {
		seleniumUtils.writeText(AddEmpoyeeAccountPage.getuserName(), configFileReader.getProperty("Username"));

	}

	@When("Je saisis un mot de passe conforme")
	public void jeSaisisUnMotDePasseConforme() {
		seleniumUtils.writeText(AddEmpoyeeAccountPage.getpassWord(), configFileReader.getProperty("passeword"));

	}

	@When("Je confirme le mot de passe")
	public void jeConfirmeLeMotDePasse() {
		seleniumUtils.writeText(AddEmpoyeeAccountPage.getconfirmpassWord(), configFileReader.getProperty("passeword"));

	}

	@When("Je clique sur le bouton Save")
	public void jeCliqueSurLeBoutonSave() {
		seleniumUtils.click(AddEmpoyeeAccountPage.getbtnsave());
	}

	@Then("Un message de confirmation doit s afficher {string}")
	public void unMessageDeConfirmationDoitSAfficher(String message) {
		String result = seleniumUtils.readText(AddEmpoyeePage.getnotification());
		Assertions.assertEquals(result, message);
	}

}
