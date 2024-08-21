package com.micro.online.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.micro.online.model.Manager;


import com.micro.online.repository.ManagerRepo;

import com.micro.online.service.ManagerService;
 
@Service
@Transactional
public class ManagerServiceImpl implements ManagerService {
 
	@Autowired
	ManagerRepo managerdao;
 
	@Override
	public Manager newManager(Manager newManager) {
		return managerdao.newManager(newManager);
	}
 
	@Override
	public List<Manager> getManagers() {
 
		return managerdao.getManagers();
 
	}
 
	@Override
	public Manager managerfind(int manId) {
		return managerdao.managerfind(manId);
	}
 
	@Override
	public List<Integer> getManagerIdList() {
		return managerdao.getManagerIdList();
	}
 
	@Override
	public Manager updateManager(Manager manager) {
		return managerdao.updateManager(manager);
	}
 
	
	public Manager managerLogin(String manname, String manpassword) {
		return managerdao.ManagerLogin(manname, manpassword);
	}
	@Override
	public Manager findBymanname(String manname) {
		return managerdao.findBymanname(manname);
	}
}

