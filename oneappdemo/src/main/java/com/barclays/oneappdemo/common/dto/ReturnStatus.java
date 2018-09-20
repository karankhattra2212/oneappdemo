package com.barclays.oneappdemo.common.dto;

import org.springframework.stereotype.Component;

@Component
public class ReturnStatus {

    private String returnCode;
    private String returnStatus;
    private String returnDescription;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }

    public String getReturnDescription() {
        return returnDescription;
    }

    public void setReturnDescription(String returnDescription) {
        this.returnDescription = returnDescription;
    }
}
