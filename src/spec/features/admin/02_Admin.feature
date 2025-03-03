@Admin
Feature: Login
  En tant que utilisateur je souhaite tester la page de connexion

  Background: 
    Given Je me connecte sur l application Orange
    When Je saisis le user name "Admin"
    And Je saisis le user mot de passe "admin123"
    And Je clique sur le bouton Login
    Then Redirection vers la page Dashborad "Dashboard"

  @Admin_serach
  Scenario: chercher un utilisateur
    And Je clique sur le bouton Admin
    And Je saisis le Username
    And Je clique sur le bouton Search
    Then l utilsateur recherché est affiché
