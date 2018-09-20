package com.barclays.oneappdemo.dto;

import com.barclays.oneappdemo.common.dto.ReturnStatus;

public class VerifyPasscodeResponse {

    private ReturnStatus returnStatus;

    public ReturnStatus getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(ReturnStatus returnStatus) {
        this.returnStatus = returnStatus;
    }
}
