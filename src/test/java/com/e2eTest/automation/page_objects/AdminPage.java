package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class AdminPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//div[@class='oxd-sidepanel-body']//ul/li[1]/a/span")
	private static WebElement btnAdmin;

	@FindBy(how = How.XPATH, using = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	private static WebElement username;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement btnSearch;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Admin')]")
	private static WebElement usercherche;
	private String searchedUsername;

	/* Constructor */
	public AdminPage() {

		super(Setup.getDriver());

	}

	/* Methods */
	public void clickBtnadmin() {
		btnAdmin.click();

	}

	public void fillUsername(String user) {
		searchedUsername = user;
		username.sendKeys(user);

	}

	public void clickSearch() {
		btnSearch.click();

	}

	public String getSearchedUsername() {
		return searchedUsername;

	}
	 public String getFoundUsername() {
	        return usercherche.getText(); 
	    }

}
