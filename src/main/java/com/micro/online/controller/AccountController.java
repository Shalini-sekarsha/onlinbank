//package com.micro.online.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/accounts")
//public class AccountController {
//
//    @Autowired
//    private AccountServiceImpl accountService;
//
//    @PostMapping
//    public Account createAccount(@RequestBody Account account) {
//        return accountService.createAccount(account);
//    }
//
//    @GetMapping("/{id}")
//    public Account getAccountById(@PathVariable Long id) {
//        return accountService.getAccountById(id);
//    }
//
//    @PutMapping("/{id}")
//    public void updateAccount(@PathVariable Long id, @RequestBody Account account) {
//        account.setId(id);
//        accountService.updateAccount(account);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteAccount(@PathVariable Long id) {
//        accountService.deleteAccount(id);
//    }
//}
//
