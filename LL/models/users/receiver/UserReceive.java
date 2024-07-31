package models.users.receiver;

import java.util.ArrayList;
import java.util.List;

import models.users.patterns.PatternUserProfile;
import service.requests.Request;
import service.requests.ResolveRequest;


public class UserReceive extends PatternUserProfile{

    private List<Request> requests = new ArrayList<>();
    private List<Request> requestConcluded = new ArrayList<>();

    private void appendToRequestList(Request request){
        getRequests().add(request);
    }

    private void appendToRequestConcludedList(Request request){
        getRequestConcluded().add(request);
    }

    private void __operate(Request request){
        ResolveRequest resolveReq = new ResolveRequest(request);
        resolveReq.run();
        
        appendToRequestConcludedList(request);
        getRequests().remove(getRequests().indexOf(request));
    }
    
    public void receiveRequest(Request request){
        appendToRequestList(request);
    }
    
    public void operateRequest(){
        for (Request req : requests){
            __operate(req);
        }
    }


    // Getters & Setters
    public List<Request> getRequests() {
        return requests;
    }

    public List<Request> getRequestConcluded() {
        return requestConcluded;
    }

}
