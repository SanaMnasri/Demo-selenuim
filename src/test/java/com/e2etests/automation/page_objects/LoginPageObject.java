package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class LoginPageObject {
public ConfigFileReader configFileReader;	
	
//recherche des elements
	@FindBy(how = How.ID, using = "user-name")
	public static WebElement username;

	@FindBy(how = How.ID, using = "password")
	public static WebElement password;

	@FindBy(how = How.ID, using = "login-button")
	public static WebElement login;
	@FindBy(how = How.XPATH, using = "//span[@class='title']")
	public static WebElement title;

	@FindBy(how = How.XPATH, using = "//div[@id='login_button_container']//form//h3")
	public static WebElement messageErreur;
	@FindBy(how = How.ID, using = "react-burger-menu-btn")
	public static WebElement Menu;
	@FindBy(how = How.ID, using = "logout_sidebar_link")
	public static WebElement logout;

	public Actions actions;

	// methodes
	public LoginPageObject() {
		PageFactory.initElements(Setup.getDriver(), this);
		actions = new Actions(Setup.getDriver());
		configFileReader= new ConfigFileReader();
	}

	public void connectToapp() {
		Setup.getDriver().get(configFileReader.getProperties("url"));

	}

	public void saisieUsername(String usr) {
		username.sendKeys(usr);

	}

	public void saisiePassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickBtn() {
		login.click();

	}

	public void clickMenu() {
		Menu.click();
		actions.moveToElement(logout).perform();
	

	}

	public void clicklogout() {
		logout.click();
	}

	public String getCurrentUrl() {
		return Setup.getDriver().getCurrentUrl();
	}

	public boolean userNamedisplayed() {
		return username.isDisplayed();
	}
	public void filUsername() {
		username.sendKeys(configFileReader.getProperties("username"));
		
		
	}
	public void filPassword() {
		password.sendKeys(configFileReader.getProperties("password"));
		
	}
}
