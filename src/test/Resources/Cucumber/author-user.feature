Feature: Login feature
  Scenario Outline: I login as a user lequangnhat
    Given I enter user "<username>"
    Given I enter password "<password>"
    When I click login button
    Then I login success

    Examples:
      | username   | password | value |
      | lequangnhat | 123      | true  |
      | user1      | 123      | true  |
      | user2      | 123      | true  |
      | user3      | 123      | true  |
      | user4      | 123      | true  |
      | user5      | 123      | true  |
      | user6      | 123      | true  |
      | user7      | 123      | true  |
      | user8      | 123      | true  |
      | user100      | 123      | true  |