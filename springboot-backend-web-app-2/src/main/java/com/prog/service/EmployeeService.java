package com.prog.service;

import java.util.List;

import com.prog.model.Employee;

public interface EmployeeService {
	List<Employee>getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	
}
