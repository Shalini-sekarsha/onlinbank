//package com.micro.online.model;
//
//
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//
//import java.sql.Timestamp;
//
//@Entity
//@Table(name = "request")
//public class Request {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "application_id")
//    private Application application;
//
//    @ManyToOne
//    @JoinColumn(name = "emp_id")
//    private Employee employee;
//
//    @ManyToOne
//    @JoinColumn(name = "man_id")
//    private Manager manager;
//
//	public Request() {
//		super();
//		
//	}
//
//	public Request(Long id, Application application, Employee employee, Manager manager) {
//		super();
//		this.id = id;
//		this.application = application;
//		this.employee = employee;
//		this.manager = manager;
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public Application getApplication() {
//		return application;
//	}
//
//	public void setApplication(Application application) {
//		this.application = application;
//	}
//
//	public Employee getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}
//
//	public Manager getManager() {
//		return manager;
//	}
//
//	public void setManager(Manager manager) {
//		this.manager = manager;
//	}
//
//	@Override
//	public String toString() {
//		return "Request [id=" + id + ", application=" + application + ", employee=" + employee + ", manager=" + manager
//				+ "]";
//	}
//
//    
//
//    
//}
//
