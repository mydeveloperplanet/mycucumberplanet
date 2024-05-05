@regression
Feature: Employee Actions
  Actions to be made for an employee

  @TC_01
  Scenario: Add employee
    Given an empty employee list
    When an employee is added
    Then the employee is added to the employee list

  @TC_02
  Scenario: Remove employees
    Given a filled employee list
    When the employees list is removed
    Then the employee list is empty