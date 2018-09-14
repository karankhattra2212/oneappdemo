package com.barclays.controller;

import com.barclays.dto.ReturnStatus;
import com.barclays.dto.VerifyPasscode;
import com.barclays.repository.VerifyPasscodeRepository;
import com.barclays.util.OneAppStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Objects.isNull;

@RestController
public class VerifyPasscodeController {

    @Autowired
    VerifyPasscodeRepository repository;

    @PostMapping(value = "/verifyPasscode")
    public ReturnStatus verifyEnteredPasscode(@RequestBody VerifyPasscode verifyPasscode) {
        if (isNull(verifyPasscode)) {
            return OneAppStatus.getReturnStatus("999");
        }

        if (isValidPasscode(verifyPasscode)) {
            return OneAppStatus.getReturnStatus("0000");
        } else {
            return OneAppStatus.getReturnStatus("999");
        }
    }

    private boolean isValidPasscode(VerifyPasscode verifyPasscode) {
        if (isNull(verifyPasscode.getDeviceId())) {
            return false;
        } else {
            verifyPasscode.setCustomerId(repository.getCustomerIdByDeviceId(Long.parseLong(verifyPasscode.getDeviceId())));
            return checkForPasscodeMatch(verifyPasscode);
        }
    }

    private boolean checkForPasscodeMatch(VerifyPasscode verifyPasscode) {
        if (isNull(verifyPasscode.getDeviceId()) || isNull(verifyPasscode.getCustomerId())) {
            return false;
        } else {
            return verifyPasscode.getPasscode()
                    .equals(repository.getPasscodeByCustomerId(Long.parseLong(verifyPasscode.getCustomerId())));
        }


    }

}
