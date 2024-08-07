package service.requests;

public class Request {
    private boolean requestStateOK=false;
    private String requestName;
    private String requestDataSent;
    private String requestDataUntilLimit;
    private int requestSolicitation;
    private int requestResult;


    public void showInfosOfRequest(){
        System.out.println("--------------------");
        System.out.println("Request Name: " + requestName);
        System.out.println("Request Complete: " + requestStateOK);
        System.out.println("Request Data Sent: " + requestDataSent);
        System.out.println("Request Data Until Limit: " + requestDataUntilLimit);
        System.out.println("Request Solicitation: " + requestSolicitation);
        System.out.println("Request Result: " + requestResult);
        System.out.println("--------------------");
        System.out.println("\n");
    }

    // Getters & Setters 
    public String getRequestName() {
        return requestName;
    }
    public void setRequestName(String requestName) {
        this.requestName = requestName;
    }
    public String getRequestDataSent() {
        return requestDataSent;
    }
    public void setRequestDataSent(String requestDataSent) {
        this.requestDataSent = requestDataSent;
    }
    public String getRequestDataUntilLimit() {
        return requestDataUntilLimit;
    }
    public void setRequestDataUntilLimit(String requestDataUntilLimit) {
        this.requestDataUntilLimit = requestDataUntilLimit;
    }
    public int getRequestSolicitation() {
        return requestSolicitation;
    }
    public void setRequestSolicitation(int requestSolicitation) {
        this.requestSolicitation = requestSolicitation;
    }
    public int getRequestResult() {
        return requestResult;
    }
    public void setRequestResult(int requestResult) {
        this.requestResult = requestResult;
    }
    public boolean isRequestStateOK() {
        return requestStateOK;
    }
    public void setRequestStateOK(boolean requestState) {
        this.requestStateOK = requestState;
    }
}
