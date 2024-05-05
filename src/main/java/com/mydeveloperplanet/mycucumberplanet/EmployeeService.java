package com.mydeveloperplanet.mycucumberplanet;

import java.util.Collection;
import java.util.HashMap;

public class EmployeeService {

    private final HashMap<Long, Employee> employees = new HashMap<>();
    private Long index = 0L;

    public void addEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        employees.put(index, employee);
        index++;
    }

    public Collection<Employee> getEmployees() {
        return employees.values();
    }

    public void removeEmployees() {
        employees.clear();
    }
}
