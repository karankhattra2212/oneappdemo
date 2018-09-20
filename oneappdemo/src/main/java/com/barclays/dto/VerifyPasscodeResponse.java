package com.barclays.dto;

import com.barclays.common.dto.ReturnStatus;

public class VerifyPasscodeResponse {

    private ReturnStatus returnStatus;

    public ReturnStatus getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(ReturnStatus returnStatus) {
        this.returnStatus = returnStatus;
    }
}
