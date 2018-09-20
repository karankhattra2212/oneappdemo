package com.barclays.oneappdemo.util;

import com.barclays.oneappdemo.common.dto.ReturnStatus;
import com.barclays.oneappdemo.common.repository.ReturnStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OneAppStatus {

    @Autowired
    ReturnStatusRepository repository;


    public ReturnStatus getReturnStatus(String code) {
        return repository.getReturnStatusByReturnCode(code);
    }

}
