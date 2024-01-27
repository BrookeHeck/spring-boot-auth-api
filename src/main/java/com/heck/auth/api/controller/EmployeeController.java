package com.heck.auth.api.controller;

import com.heck.auth.api.ROLE;
import com.heck.auth.api.records.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {
    private static final List<Employee> EMPLOYEES = Arrays.asList(
        new Employee(1, "Bond", "James", ROLE.MANAGER),
        new Employee(2, "Hill", "Maria", ROLE.ASSISTANT_MANAGER),
        new Employee(3, "Joy", "Brandon", ROLE.CHECK_OUT_ASSOCIATE),
        new Employee(4, "Baker", "Cassandra", ROLE.ONLINE_ORDER_SHOPPER)
    );

    @GetMapping(path = "get/{employeeId}")
    public Employee getEmployee(@PathVariable("employeeId") Integer employeeId) {
        return EMPLOYEES.stream()
                .filter(employee -> Objects.equals(employeeId, employee.getId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Employee" + employeeId + " does not exist"));
    }
}
