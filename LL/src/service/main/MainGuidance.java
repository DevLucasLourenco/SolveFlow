package service.main;

import models.users.receiver.UserReceive;
import models.users.requester.UserRequest;
import service.requests.Request;


public class MainGuidance {
    public static void main(String[] args) {
        
        UserRequest userRequester = new UserRequest("Lucas", "123.456.789.10", 98765);
        UserReceive userReceiver = new UserReceive("Lucas 2", "987.654.321.01", 12345);

        Request request = new Request();
        request.setRequestName("Multiplicador");
        request.setRequestDataSent("30/07/2024");
        request.setRequestDataUntilLimit("02/08/2024");
        request.setRequestSolicitation("5*2");

        userRequester.sendRequest(userReceiver, request);

        System.out.println(userReceiver.getRequestConcluded());
        // userReceiver.operateRequest();

    }
}
