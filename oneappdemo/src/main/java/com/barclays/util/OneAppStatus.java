package com.barclays.util;

import com.barclays.dto.ReturnStatus;

import static java.util.Objects.isNull;

public class OneAppStatus {

    private OneAppStatus() {
        throw new IllegalStateException();
    }

    public static ReturnStatus getReturnStatus(String code) {
        if (isNull(code)) {
            return setReturnStatus("999");
        } else {
            return setReturnStatus(code);
        }
    }

    private static ReturnStatus setReturnStatus(String s) {
        ReturnStatus returnStatus = new ReturnStatus();
        if ("0000".equals(s)) {
            returnStatus.setReturnCode("0000");
            returnStatus.setReturnStatus("Success!");
            returnStatus.setReturnDescription("You request is completed successfully.");
        } else {
            returnStatus.setReturnCode("999");
            returnStatus.setReturnStatus("Error!");
            returnStatus.setReturnDescription("An error occurred, Please try again.");
        }
        return returnStatus;
    }
}
