package com.micro.online.repoimpl;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.micro.online.model.Employee;
import com.micro.online.repository.EmployeeRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.NonUniqueResultException;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
 
@Repository
public class EmployeeRepoImpl implements EmployeeRepo {
 
	@Autowired
	EntityManager entityMan;
 
	public Employee newEmployee(Employee newEmployee) {
		entityMan.persist(newEmployee);
		return newEmployee;
	}
 
	@SuppressWarnings("unchecked")
 
	public List<Employee> getEmployees() {
		return entityMan.createQuery("from Employee").getResultList();
	}
 
	public Employee employeefind(int empId) {
		return entityMan.find(Employee.class, empId);
	}
 
	
 
	public Employee updateEmployee(Employee employee) {
		entityMan.merge(employee);
		return employee;
	}
 
	

	@Override
	public List<Integer> getEmployeeIdList() {
		Query q = entityMan.createQuery("SELECT c.empId FROM Employee");
		return q.getResultList();
	}

	@Override
	public Employee EmployeeLogin(String empName, String empPassword) {
		Query query1 = entityMan.createQuery("from Employee u where u.empName =?1 and u.empPassword=?2");
		query1.setParameter(1, empName);
		query1.setParameter(2, empPassword);
 
		return (Employee) query1.getSingleResult();
 
	}

	@Override
	public Employee findByEmpName(String empName) {
		String jpql = "SELECT e FROM Employee e WHERE e.empName = :empName";
	    TypedQuery<Employee> query = entityMan.createQuery(jpql, Employee.class);
	    query.setParameter("empName", empName);
	    
	    try {
	        return query.getSingleResult();
	    } catch (NoResultException | NonUniqueResultException	 e) {
	        return null;
	    }
	}
}
