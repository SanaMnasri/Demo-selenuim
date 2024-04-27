@loginOutline
Feature: je souhaite me connecter avec plusieur compte a l application

  Scenario Outline: je souhaite me connecter avec plusieur compte a l application SWAGLABES
    Given Je me connecte sur lapplication SWAGLABAS
    When Je saisie le user name "<username>"
    When Je saisie le mot de passe "<password>"
    And je clique sur le bouton login

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_userr            | secret_sauce |
