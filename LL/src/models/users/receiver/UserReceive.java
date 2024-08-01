package models.users.receiver;

import java.util.ArrayList;
import java.util.List;

import models.users.patterns.PatternUserProfile;
import models.users.requester.UserRequest;
import service.requests.Request;
import service.requests.ResolveRequest;


public class UserReceive extends PatternUserProfile{

    private List<Request> requests = new ArrayList<>();
    private List<Request> requestConcluded = new ArrayList<>();

    public UserReceive(String name, String cpf, int id){
        setName(name);
        setCpf(cpf);
        setID(id);
    }

    private void appendToRequestList(Request request){
        getRequests().add(request);
    }

    private void appendToRequestConcludedList(Request request){
        getRequestConcluded().add(request);
    }
    
    public void receiveRequest(Request request){
        appendToRequestList(request);
    }
    
    public void operateRequest(){
        if (!this.requests.isEmpty()){
            for (Request req : this.requests){
                ResolveRequest resolveReq = new ResolveRequest(req);
                resolveReq.run();

                appendToRequestConcludedList(req);
            }
        }
    }

    public void clearRequestsLists() {
        getRequestConcluded().clear();
        getRequests().clear();
    }

    public void sendConclusions(UserRequest user) {
        for (Request req : getRequestConcluded()){
            user.receiveConclusion(req);
        }
    }

    // Getters & Setters
    public List<Request> getRequests() {
        return this.requests;
    }

    public List<Request> getRequestConcluded() {
        return this.requestConcluded;
    }

}
