//package com.micro.online.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/requests")
//public class RequestController {
//
//    @Autowired
//    private RequestServiceImpl requestService;
//
//    @PostMapping
//    public Request createRequest(@RequestBody Request request) {
//        return requestService.createRequest(request);
//    }
//
//    @GetMapping("/application/{applicationId}")
//    public List<Request> getRequestsByApplication(@PathVariable Long applicationId) {
//        Application application = new Application(); // Fetch application by applicationId
//        application.setId(applicationId);
//        return requestService.getRequestsByApplication(application);
//    }
//
//    @GetMapping("/{id}")
//    public Request getRequestById(@PathVariable Long id) {
//        return requestService.getRequestById(id);
//    }
//
//    @PutMapping("/{id}")
//    public void updateRequestAction(@PathVariable Long id, @RequestParam String action) {
//        requestService.updateRequestAction(id, action);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteRequest(@PathVariable Long id) {
//        requestService.deleteRequest(id);
//    }
//}
//
