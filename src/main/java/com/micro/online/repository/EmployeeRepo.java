package com.micro.online.repository;

import java.util.List;

import com.micro.online.model.Employee;


 
public interface EmployeeRepo {
 
	public Employee newEmployee(Employee newEmployee);
 
	public List<Employee> getEmployees();
 
	public Employee employeefind(int empId);
 
	public List<Integer> getEmployeeIdList();
 
	public Employee updateEmployee(Employee employee);
 
	public Employee EmployeeLogin(String empName, String empPassword);
	
	public Employee findByEmpName(String empName);

//	public Employee employeeLogin(String empName, String empPassword);
}
