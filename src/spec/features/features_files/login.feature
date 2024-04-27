
@login
Feature: Test de la foctionalite autentification de lapplication SWAGLABAS
Autant que utlisateur je souhaite teste la page de la connexion de l application SWAGLABAS
Background: 
Given Je me connecte sur lapplication SWAGLABAS
  @connexion_cas_passont
  Scenario: Je souhaite tester la connexion avec un cas passant
   
    When Je saisie le user name "standard_user"
    And Je saisie le mot de passe "secret_sauce"
    And je clique sur le bouton login
    Then je me redirige vers la page dacceuil "Products"
 @connexion_cas_non_passant
  Scenario: Je souhaite tester la connexion avec un cas passant
   
    When Je saisie le user name "sana"
    And Je saisie le mot de passe "sana123"
    And je clique sur le bouton login
    Then un message dereeur saffiche "Epic sadface: Username and password do not match any user in this service"
    @disconnect
    Scenario: Je deconnecte de la plication swaglabas
       When Je saisie le user name "standard_user"
    When Je saisie le mot de passe "secret_sauce"
    And je clique sur le bouton login
    And je clique sur le bouton Menu
   When Je clique sur le bouton logout
    Then je me rederige vers l page d authentification "https://www.saucedemo.com/"
    
    @disconnect1
    Scenario: Je deconnecte de la plication swaglabas
 
    When Je saisie le user name "standard_user"
    When Je saisie le mot de passe "secret_sauce"
    And je clique sur le bouton login
    And je clique sur le bouton Menu
    And Je clique sur le bouton logout
    Then je verifie que la deconexion effecuer  boolean 
    @loginconfigfile
    Scenario: Je souhaite tester la connexion avec un cas passant
   
    When Je saisie le user name
    And Je saisie le mot de passe
    And je clique sur le bouton login
    Then je me redirige vers la page dacceuil "Products"
    
    