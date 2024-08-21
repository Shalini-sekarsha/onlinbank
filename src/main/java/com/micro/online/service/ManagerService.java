package com.micro.online.service;



import java.util.List;

import com.micro.online.model.Manager;


 
 
public interface ManagerService {
 
 
		public Manager newManager(Manager newManager);
 
		public List<Manager> getManagers();
 
		public Manager managerfind(int managerId);
 
		public List<Integer> getManagerIdList();
 
		public Manager updateManager(Manager manager);
 
		public Manager managerLogin(String manname, String manpassword);
		public Manager findBymanname(String manname);
	}
 
