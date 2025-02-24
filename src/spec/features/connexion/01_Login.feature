@login
Feature: Login
  En tant que utilisateur je souhaite tester la page de connexion

  @login_valide_credential
  Scenario: Login avec des données valides
    Given Je me connecte sur l application Orange
    When Je saisis le user name "Admin"
    And Je saisis le user mot de passe "admin123"
    And Je clique sur le bouton Login
    Then Redirection vers la page Dashborad "Dashboard"
