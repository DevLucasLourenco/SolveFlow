package models.users.receiver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import models.users.patterns.PatternUserProfile;
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

    private void __operate(Request request){
        ResolveRequest resolveReq = new ResolveRequest(request);
        resolveReq.run();
        
        appendToRequestConcludedList(request);
        __removeFromRequests(request);
        getRequests().remove(request);
    }

    private void __removeFromRequests(Request request){
        Iterator<Request> iterator = requests.iterator();
        while (iterator.hasNext()){
            Request element = iterator.next();
            if (element.equals(request)){
                System.out.println("vtnc");
                iterator.remove();
            }
        }
        
    }
    
    public void receiveRequest(Request request){
        appendToRequestList(request);
    }
    
    public void operateRequest(){
        if (!this.requests.isEmpty()){
            for (Request req : this.requests){
                __operate(req);
            }
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
