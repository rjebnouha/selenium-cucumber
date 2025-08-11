@ajoutcompteemployee
Feature: Créer un compte utilisateur pour un employé existant

  @ajout_compte_employee
  Scenario: Ajouter un compte utilisateur pour un employé existant
    Given J ouvre le site OrangeHRM
    And Je suis connecté à OrangeHRM en tant qu’administrateur
    When Je clique sur le menu Admin
    And Je clique sur le menu User Management
    And Je clique sur le menu Users
    And Je clique sur le bouton Add
    And Je sélectionne un rôle d utilisateur
    And Je saisis le nom de l employé dans le champ
    And Je définis le statut
    And Je saisis un nom d utilisateur unique
    And Je saisis un mot de passe conforme
    And Je confirme le mot de passe
    And Je clique sur le bouton Save
    Then Un message de confirmation doit s afficher 'Successfully Saved'