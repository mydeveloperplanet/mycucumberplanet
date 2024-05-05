package com.mydeveloperplanet.mycucumberplanet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    private final EmployeeService service = new EmployeeService();

    @Given("an empty employee list")
    public void an_empty_employee_list() {
        service.removeEmployees();
    }
    @When("an employee is added")
    public void an_employee_is_added() {
        service.addEmployee("John", "Doe");
    }
    @Then("the employee is added to the employee list")
    public void the_employee_is_added_to_the_employee_list() {
        assertEquals(1, service.getEmployees().size());
    }

    @Given("a filled employee list")
    public void a_filled_employee_list() {
        service.addEmployee("John", "Doe");
        service.addEmployee("Miles", "Davis");
        assertEquals(2, service.getEmployees().size());
    }
    @When("the employees list is removed")
    public void the_employees_list_is_removed() {
        service.removeEmployees();
    }
    @Then("the employee list is empty")
    public void the_employee_list_is_empty() {
        assertEquals(0, service.getEmployees().size());
    }

}
