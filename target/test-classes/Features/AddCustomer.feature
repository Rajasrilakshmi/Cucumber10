Feature: AddCustomer flow
  
   Scenario: 
    Given user should be in the telecom home page
     And user click on add customer button
     When user enters all the fields with valid data
     And user clicks on submit button
    Then user should be displayed customer id is generated
  
   Scenario: 
     Given user should be in the telecom home page
    And user click on add customer button
     When user enters all the fields with valid data.
       | Rajasri | lakshmi | rajasri@gmail.com | Pondy | 9845673487 |
     And user clicks on submit button
     Then user should be displayed customer id is generated
  
  Scenario: 
    Given user should be in the telecom home page
    And user click on add customer button
    When user enters all the fields with valid datas
      | fname   | rajasri           |
      | lname   | r                 |
      | email   | rajasri@gmail.com |
      | address | chennai           |
      | phno    |        7984562309 |
    And user clicks on submit button
    Then user should be displayed customer id is generated

  
   Scenario: 
     Given user should be in the telecom home page
     And user click on add tariff button
     When user enters all the fields with valid dataA
       | 7000 | 200 | 120 | 100 | 5 | 10 | 2 |
     And user clicks on submit buttonA
     Then user should be displayed home is generated
  
  Scenario: 
    Given user should be in the telecom home page
    And user click on add tariff button
    When user enters all the fields with valid dataB
      | MonRen  | 7000 |
      | locMin  |  200 |
      | IntMin  |  120 |
      | Sms     |  100 |
      | locChrg |    5 |
      | IntChrg |   10 |
      | SmsChrg |    2 |
    And user clicks on submit buttonB
    Then user should be displayed home is generatedB
  
 
  
  Scenario: 
    Given user should be in the telecom home page
    And user click on add tariff button
    When user enters all the fields with valid dataC
      | 7000 | 200 | 120 | 100 | 5 | 10 | 2 |
      | 6000 | 100 | 140 |  90 | 6 | 11 | 1 |
      | 5000 |  50 | 160 |  80 | 7 | 12 | 3 |
    And user clicks on submit buttonA
    Then user should be displayed home is generated

  Scenario: 
    Given user should be in the telecom home page
    And user click on add tariff button
    When user enters all the fields with valid dataD
      | MonRen | locMin | IntMin | Sms | locChrg | IntChrg | SmsChrg |
      |   7000 |    200 |    120 | 100 |       5 |      10 |       2 |
      |   6000 |    100 |    140 |  90 |       6 |      11 |       1 |
      |   5000 |     50 |    160 |  80 |       7 |      12 |       3 |
    And user clicks on submit buttonA
    Then user should be displayed home is generated
