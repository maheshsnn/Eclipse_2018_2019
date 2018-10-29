Feature: Facebooks login smoke case

@tags
   Scenario: checking scenariothree
   Given: checking given in scenariothree
   When: checking when in scenariothree
   Then: checking then in scenariothree
   
   @data
     Scenario Outline: cheking scenarioone
    Given checking given in scenarioone
    When checking "<username>" and "<password>"
    Then checking scenarioone then

    Examples: 
      | username | password |
      | mahesh   | testdat  |

@driver
  Scenario Outline: Cheking for scenariotwo
    Given Checking given in scenariotwo
    When checking "<when>" in scenariotwo
    Then cheking them in scenariotwo

    Examples: 
      | when   |
      | mahesh |
      
   


