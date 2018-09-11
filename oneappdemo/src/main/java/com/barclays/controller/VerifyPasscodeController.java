package com.barclays.controller;

import com.barclays.dto.ReturnStatus;
import com.barclays.dto.VerifyPasscode;
import com.barclays.util.OneAppStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Objects.isNull;

@RestController
public class VerifyPasscodeController {

    @PostMapping(value = "/verifyPasscode")
    public ReturnStatus verifyEnteredPasscode(@RequestBody VerifyPasscode passcode) {

        if (isValidPasscode(passcode.getPasscode())) {
            return OneAppStatus.getReturnStatus("0000");
        } else {
            return OneAppStatus.getReturnStatus("999");
        }
    }

    private boolean isValidPasscode(String passcode) {
        if (isNull(passcode)) {
            return false;
        } else {
            return "123456".equals(passcode);
        }
    }

}
