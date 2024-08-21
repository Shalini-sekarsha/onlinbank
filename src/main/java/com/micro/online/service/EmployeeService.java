package com.micro.online.service;

import java.util.List;

import com.micro.online.model.Employee;

 
 
public interface EmployeeService {
 
 
		public Employee newEmployee(Employee newEmployee);
 
		public List<Employee> getEmployees();
 
		public Employee employeefind(int employeeId);
 
		public List<Integer> getEmployeeIdList();
 
		public Employee updateEmployee(Employee employee);
 
		public Employee employeeLogin(String employeeName, String employeePassword);
		
		public Employee findByEmpName(String empName);
	}
 
