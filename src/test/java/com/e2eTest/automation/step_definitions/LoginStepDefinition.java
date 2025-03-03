package com.e2eTest.automation.step_definitions;

import org.junit.jupiter.api.Assertions;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	ConfigFileReader configFileReader;
	LoginPage loginPage;
	SeleniumUtils seleniumUtils;

	public LoginStepDefinition() {
		configFileReader = new ConfigFileReader();
		loginPage = new LoginPage();
		seleniumUtils = new SeleniumUtils();
	}

	@Given("Je me connecte sur l application Orange")
	public void jeMeConnecteSurLApplicationOrange() throws InterruptedException {

		Setup.getDriver().get(configFileReader.getProperty("home.url"));
		Thread.sleep(3000);

	}

	@When("Je saisis le user name {string}")
	public void jeSaisisLeUserName(String username) {
		//loginPage.fillUsername(username);
		seleniumUtils.writeText(loginPage.getUsername(), username);
	}

	@When("Je saisis le user mot de passe {string}")
	public void jeSaisisLeUserMotDePasse(String password) {
		seleniumUtils.writeText(LoginPage.getPassword(), password);
	}

	@When("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {
		seleniumUtils.click(LoginPage.getBtnLogin());
	}

	@Then("Redirection vers la page Dashborad {string}")
	public void redirectionVersLaPageDashborad(String title) throws InterruptedException{
		Thread.sleep(3000);
		String txtPage = seleniumUtils.readText(LoginPage.getDashboardTitle());
		Assertions.assertEquals(title, txtPage);
	}

}
