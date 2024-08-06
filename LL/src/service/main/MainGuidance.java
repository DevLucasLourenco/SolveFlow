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
        request.setRequestSolicitation(5);

        Request request2 = new Request();
        request2.setRequestName("Multiplicador2");
        request2.setRequestDataSent("30/07/2024");
        request2.setRequestDataUntilLimit("02/08/2024");
        request2.setRequestSolicitation(15);

        userRequester.sendRequest(userReceiver, request);
        userRequester.sendRequest(userReceiver, request2);
        
        // // first print out
        // System.out.println(userReceiver.getRequests());
        // for (Request req : userReceiver.getRequests()){
        //     req.showInfosOfRequest();
        // }
        
        // operating
        userReceiver.operateRequest();
        
        
        // second print out
        // System.out.println(userReceiver.getRequestConcluded());
        // for (Request req : userReceiver.getRequestConcluded()){
        //     req.showInfosOfRequest();

        userReceiver.sendConclusions(userRequester);

        // realizar Logs
        // continuar - exportar para JSON e XLSX        
    }
}
