package models.users.requester;

import models.users.patterns.PatternUserProfile;
import models.users.receiver.UserReceive;
import service.requests.Request;
import service.requests.ResolveRequest;


public class UserRequest extends PatternUserProfile{

    public UserRequest(String name, String cpf, int id){
        setName(name);
        setCpf(cpf);
        setID(id);
    }

    public void sendRequest(UserReceive user, Request req){
        user.receiveRequest(req);
    }

    public void receiveConclusion(ResolveRequest requestConcluded){
        if (requestConcluded.isConcluded()){
            //...
        }
    }

}
