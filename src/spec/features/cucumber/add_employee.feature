@ajoutemployé
Feature: Ajouter un nouveau employé

  @ajout_employé
  Scenario: Ajouter un nouveau employé avec succès
    Given J ouvre le site OrangeHRM et Je connect à OrangeHRM en tant qu administrateur
    When Je clique sur le menu PIM
    And Je clique sur le menu Add Employee
    And Je remplire le formulaire
    And Je clique sur Save
    Then Une notification verte avec le message 'Successfully Saved' est visible
    Then Sa fiche employé s’affiche dans le système

    
    