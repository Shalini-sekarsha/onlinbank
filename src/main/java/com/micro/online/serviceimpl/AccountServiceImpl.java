//package com.micro.online.serviceimpl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.micro.online.model.Account;
//import com.micro.online.repository.AccountRepo;
//
//@Service
//public class AccountServiceImpl {
//
//    @Autowired
//    private AccountRepo accountRepo;
//
//    public Account createAccount(Account account) {
//        
//        return accountRepo.createAccount(account);
//    }
//
//    public Account getAccountById(Long id) {
//        return accountRepo.getAccountById(id);
//    }
//
//    public void updateAccount(Account account) {
//        accountRepo.updateAccount(account);
//    }
//
//    public void deleteAccount(Long id) {
//        accountRepo.deleteAccount(id);
//    }
//}
//
