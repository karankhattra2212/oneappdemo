package com.barclays.controller;

import com.barclays.dto.VerifyPasscode;
import com.barclays.dto.VerifyPasscodeResponse;
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
    public VerifyPasscodeResponse verifyEnteredPasscode(@RequestBody VerifyPasscode verifyPasscode) {
        VerifyPasscodeResponse response = new VerifyPasscodeResponse();
        if (isNull(verifyPasscode)) {
            response.setReturnStatus(OneAppStatus.getReturnStatus("999"));

        }

        if (isValidPasscode(verifyPasscode)) {
            response.setReturnStatus(OneAppStatus.getReturnStatus("0000"));

        } else {
            response.setReturnStatus(OneAppStatus.getReturnStatus("999"));

        }
        return response;
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
