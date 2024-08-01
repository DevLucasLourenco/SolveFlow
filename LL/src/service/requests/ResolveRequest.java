package service.requests;


public class ResolveRequest {
    private Request request;


    public ResolveRequest(Request request){
        this.request = request;
    }

    public void run(){
        if (!request.isRequestStateOK()){
            request.setRequestResult(request.getRequestSolicitation() * 2);
            request.setRequestStateOK(true);
        }
    }

    // Getters & Setters 
    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}