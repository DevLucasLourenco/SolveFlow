package service.requests;


public class ResolveRequest {
    private Request request;
    private boolean concluded = false;


    public ResolveRequest(Request request){
        this.request = request;
    }

    public void run(){
        request.setRequestResult(request.getRequestSolicitation()*2);
        setConcluted(true);
    }

    // Getters & Setters 
    public boolean isConcluded() {
        return concluded;
    }

    public void setConcluted(boolean concluded) {
        this.concluded = concluded;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}