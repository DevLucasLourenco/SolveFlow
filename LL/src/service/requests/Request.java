package service.requests;

public class Request {
    private String requestName;
    private String requestDataSent;
    private String requestDataUntilLimit;
    private int requestSolicitation;
    private int requestResult;
    
    

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
}
