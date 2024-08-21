package com.micro.online.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.online.model.Manager;

import com.micro.online.service.ManagerService;


  
@RestController
@CrossOrigin("*")
@RequestMapping("/man")
public class ManagerController {
 
		@Autowired
		ManagerService managerservice;
 
	    
		
		@PostMapping("/domanagerinsert")
		public Manager insertManager(@RequestBody Manager newManager) {
			return managerservice.newManager(newManager);
 
		}
 
		@PutMapping("/updatemanager")
		public Manager updateManager(@RequestBody Manager manager) {
 
			return managerservice.updateManager(manager);
		}
 
		
		@GetMapping("/getallManagerList")
		public List<Manager> getManagers() {
			return managerservice.getManagers();
		}
 
		
		@GetMapping("/getmanid/{manId}")
		public Manager appfind(@PathVariable("manId") int manId) {
			return managerservice.managerfind(manId);
		}
 
		@GetMapping("/loginmanager/{manname}/{manpassword}")
		public boolean loginmanager(@PathVariable("manname") String manname,
				@PathVariable("manpassword") String manPassword) {
			
			Manager existingManager = managerservice.findBymanname(manname);
			try {
				if (existingManager != null && manPassword.equals(existingManager.getManpassword())) {
					return true;
				} else {
					return false;
				}
			} catch (Exception e) {
				return false;
			}
		}
}
 
	

