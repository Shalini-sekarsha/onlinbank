//package com.micro.online.repository;
//
//import jakarta.persistence.EntityManager;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.micro.online.model.Account;
//
//@Repository
//public class AccountRepo {
//
//    @Autowired
//    private EntityManager entityManager;
//
//    public Account createAccount(Account account) {
//        entityManager.persist(account);
//        return account;
//    }
//
//    public Account getAccountById(Long id) {
//        return entityManager.find(Account.class, id);
//    }
//
//    public void updateAccount(Account account) {
//        entityManager.merge(account);
//    }
//
//    public void deleteAccount(Long id) {
//        Account account = getAccountById(id);
//        if (account != null) {
//            entityManager.remove(account);
//        }
//    }
//}
