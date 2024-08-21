//package com.micro.online.serviceimpl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.micro.online.model.Application;
//import com.micro.online.model.Request;
//import com.micro.online.repository.RequestRepo;
//
//@Service
//public class RequestServiceImpl {
//
//    @Autowired
//    private RequestRepo requestRepo;
//
//    public Request createRequest(Request request) {
//        
//        return requestRepo.createRequest(request);
//    }
//
//    public List<Request> getRequestsByApplication(Application application) {
//        return requestRepo.getRequestsByApplication(application);
//    }
//
//    public Request getRequestById(Long id) {
//        return requestRepo.getRequestById(id);
//    }
//
//    public void updateRequestAction(Long requestId, String action) {
//        requestRepo.updateRequestAction(requestId, action);
//    }
//
//    public void deleteRequest(Long id) {
//        requestRepo.deleteRequest(id);
//    }
//}
//
