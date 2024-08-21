//package com.micro.online.repository;
//
//import jakarta.persistence.EntityManager;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.micro.online.model.Application;
//import com.micro.online.model.Request;
//
//import java.util.List;
//
//@Repository
//public class RequestRepo {
//
//    @Autowired
//    private EntityManager entityManager;
//
//    public Request createRequest(Request request) {
//        entityManager.persist(request);
//        return request;
//    }
//
//    public List<Request> getRequestsByApplication(Application application) {
//        return entityManager.createQuery("FROM Request WHERE application = :application", Request.class)
//                            .setParameter("application", application)
//                            .getResultList();
//    }
//
//    public Request getRequestById(Long id) {
//        return entityManager.find(Request.class, id);
//    }
//
//    public void updateRequestAction(Long requestId, String action) {
//        Request request = getRequestById(requestId);
//        if (request != null) {
//            request.setAction(action);
//            entityManager.merge(request);
//        }
//    }
//
//    public void deleteRequest(Long id) {
//        Request request = getRequestById(id);
//        if (request != null) {
//            entityManager.remove(request);
//        }
//    }
//}
//
