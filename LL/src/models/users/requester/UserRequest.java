package models.users.requester;

import java.util.ArrayList;
import java.util.List;

import models.users.patterns.PatternUserProfile;
import models.users.receiver.UserReceive;
import service.requests.Request;


public class UserRequest extends PatternUserProfile{
    private List<Request> AllConcludedRequests = new ArrayList<>();

    public UserRequest(String name, String cpf, int id){
        setName(name);
        setCpf(cpf);
        setID(id);
    }

    public void sendRequest(UserReceive user, Request req){
        user.receiveRequest(req);
    }

    public void receiveConclusion(Request requestConcluded){
        if (requestConcluded.isRequestStateOK()){
            AllConcludedRequests.add(requestConcluded);
        }
    }
}
