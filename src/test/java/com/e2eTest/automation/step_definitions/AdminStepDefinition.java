package com.e2eTest.automation.step_definitions;

import org.junit.jupiter.api.Assertions;

import com.e2eTest.automation.page_objects.AdminPage;
import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.ConfigFileReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminStepDefinition {

	AdminPage adminPage;
	LoginPage loginPage;
	ConfigFileReader configFileReader;

	
	public AdminStepDefinition() {
		configFileReader = new ConfigFileReader();
		adminPage = new AdminPage();
		loginPage = new LoginPage();
	}	

	@Then("Je clique sur le bouton Admin")
	public void jeCliqueSurLeBoutonAdmin() throws InterruptedException {
			   Thread.sleep(6000);
			   adminPage.clickBtnadmin();
			}

	
	@Then("Je saisis le Username")
	public void jeSaisisLeUsername() throws InterruptedException{
		Thread.sleep(6000);
		   adminPage.fillUsername("Admin");

	}
	@Then("Je clique sur le bouton Search")
	public void jeCliqueSurLeBoutonSearch() throws InterruptedException{
		Thread.sleep(6000);
	    adminPage.clickSearch();
	    Thread.sleep(6000);
	}
	@Then("l utilsateur recherché est affiché")
	public void lUtilsateurRecherchéEstAffiché() throws InterruptedException {
		Thread.sleep(6000);
		//Assertions.assertEquals(adminPage.getuser(),adminPage.getSearchedUsername()),
		 Assertions.assertEquals(adminPage.getFoundUsername(), adminPage.getSearchedUsername(), 
		            "Le nom d'utilisateur trouvé ne correspond pas !");
	}





	
}
