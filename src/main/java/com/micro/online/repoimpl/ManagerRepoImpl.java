package com.micro.online.repoimpl;


import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.micro.online.model.Manager;
import com.micro.online.repository.ManagerRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.NonUniqueResultException;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
 
@Repository
public class ManagerRepoImpl implements ManagerRepo {
 
	@Autowired
	EntityManager entityMan;
 
	public Manager newManager(Manager newManager) {
		entityMan.persist(newManager);
		return newManager;
	}
 
	@SuppressWarnings("unchecked")
 
	public List<Manager> getManagers() {
		return entityMan.createQuery("from Manager").getResultList();
	}
 
	public Manager managerfind(int manId) {
		return entityMan.find(Manager.class, manId);
	}
 
	
 
	public Manager updateManager(Manager manager) {
		entityMan.merge(manager);
		return manager;
	}
 
	

	public List<Integer> getManagerIdList() {
		Query q = entityMan.createQuery("SELECT c.manId FROM Manager");
		return q.getResultList();
	}

	public Manager ManagerLogin(String manname, String manpassword) {
		Query query1 = entityMan.createQuery("from Manager u where u.manname =?1 and u.manpassword=?2");
		query1.setParameter(1, manname);
		query1.setParameter(2, manpassword);
 
		return (Manager) query1.getSingleResult();
 
	}
	@Override
	public Manager findBymanname(String manname) {
		 String jpql = "SELECT u FROM Manager u WHERE u.manname = :manname";
		    TypedQuery<Manager> query = entityMan.createQuery(jpql, Manager.class);
		    query.setParameter("manname", manname);
		    
		    try {
		        return query.getSingleResult();
		    } catch (NoResultException | NonUniqueResultException e) {
		        return null;
		    }
	}
}


