package service.requests;

public class Request {
    private String requestName;
    private String requestDataSent;
    private String requestDataUntilLimit;
    private String requestSolicitation;
    
    

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
    public String getRequestSolicitation() {
        return requestSolicitation;
    }
    public void setRequestSolicitation(String requestSolicitation) {
        this.requestSolicitation = requestSolicitation;
    }

    
}
