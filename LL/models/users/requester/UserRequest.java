package models.users.requester;

import models.users.receiver.UserReceive;
import models.users.patterns.PatternUserProfile;
import service.requests.Request;
import service.requests.ResolveRequest;


public class UserRequest extends PatternUserProfile{


    public void sendRequest(UserReceive user){
        Request req = new Request();
        req.setRequestName(" Teste");
        req.setRequestDataSent("");
        req.setRequestDataUntilLimit("");
        req.setRequestSolicitation("");

        user.receiveRequest(req);
    }
    

    public void receiveConclusion(ResolveRequest requestConcluded){
        if (requestConcluded.isConcluded()){
            
        }
    }

}
