package com.e2etests.automation.step_defintions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.LoginPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	private LoginPageObject loginPageObject;

	public LoginStepDefinition() {
		loginPageObject = new LoginPageObject();

	}

	@Given("Je me connecte sur lapplication SWAGLABAS")
	public void jeMeConnecteSurLapplicationSWAGLABAS() {
		loginPageObject.connectToapp();
	}

	@When("Je saisie le user name {string}")
	public void jeSaisieLeUserName(String usr) {
		loginPageObject.saisieUsername(usr);

	}

	@When("Je saisie le mot de passe {string}")
	public void jeSaisieLeMotDePasse(String pwd) {
		loginPageObject.saisiePassword(pwd);

	}

	@When("je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		loginPageObject.clickBtn();

	}

	@Then("je me redirige vers la page dacceuil {string}")
	public void jeMeRedirigeVersLaPageDacceuil(String Attendu) {
		String Obtenu = LoginPageObject.title.getText();
		Assert.assertEquals(Obtenu, Attendu);

	}

	@Then("un message dereeur saffiche {string}")
	public void unMessageDereeurSaffiche(String messageAttendu) {
		String messageObtenu = LoginPageObject.messageErreur.getText();
		Assert.assertEquals(messageObtenu, messageAttendu);
	}

	@Given("Je clique sur lre bouton Menu")
	public void jeCliqueSurLreBoutonMenu() {
		loginPageObject.clickMenu();
	}

	@Then("je me rederige vers l page d authentification {string}")
	public void jeMeRederigeVersLPageDAuthentification(String Att) {
		String Obtt = loginPageObject.getCurrentUrl();
		Assert.assertEquals(Obtt, Att);

	}

	@When("je clique sur le bouton Menu")
	public void jeCliqueSurLeBoutonMenu() {
		loginPageObject.clickMenu();
	}

	@When("Je clique sur le bouton logout")
	public void jeCliqueSurLeBoutonLogout() {
		loginPageObject.clicklogout();

	}
	
	@Then("je verifie que la deconexion effecuer  boolean")
	public void jeVerifieQueLaDeconexionEffecuerBoolean() {
		loginPageObject.userNamedisplayed();
	
	}
	
	@When("Je saisie le user name")
	public void jeSaisieLeUserName() {
		loginPageObject.filUsername();
	   
	}
	@When("Je saisie le mot de passe")
	public void jeSaisieLeMotDePasse() {
		loginPageObject.filPassword();
	  
	}









}
