package dio.web.api.handler;

import java.util.Date;

public class ResponseError {
    private Date timesTemp = new Date();
    private String status = "error";
    private int statusCode = 400;
    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTimestemp() {
        return timesTemp;
    }

    public void setTimestemp(Date timesTemp) {
        this.timesTemp = timesTemp;
    }
}
