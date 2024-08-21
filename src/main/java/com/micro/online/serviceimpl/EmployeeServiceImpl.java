package com.micro.online.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.micro.online.model.Employee;
import com.micro.online.repository.EmployeeRepo;
import com.micro.online.service.EmployeeService;
 
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
 
	@Autowired
	EmployeeRepo employeedao;
 
	@Override
	public Employee newEmployee(Employee newEmployee) {
		return employeedao.newEmployee(newEmployee);
	}
 
	@Override
	public List<Employee> getEmployees() {
 
		return employeedao.getEmployees();
 
	}
 
	@Override
	public Employee employeefind(int empId) {
		return employeedao.employeefind(empId);
	}
 
	@Override
	public List<Integer> getEmployeeIdList() {
		return employeedao.getEmployeeIdList();
	}
 
	@Override
	public Employee updateEmployee(Employee employee) {
		return employeedao.updateEmployee(employee);
	}
 
	
	public Employee employeeLogin(String empName, String empPassword) {
		return employeedao.EmployeeLogin(empName, empPassword);
	}

	@Override
	public Employee findByEmpName(String empName) {
		return employeedao.findByEmpName(empName);
	}
}
