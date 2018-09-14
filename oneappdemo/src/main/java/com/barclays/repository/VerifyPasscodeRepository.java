package com.barclays.repository;

import com.barclays.dao.rowmapper.VerifyPasscodeRowMapper;
import com.barclays.dto.VerifyPasscode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class VerifyPasscodeRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public String getCustomerIdByDeviceId(long deviceId) {
        VerifyPasscode verifyPasscode = jdbcTemplate.queryForObject("Select CUSTOMERID from DEVICE where DEVICEID=?",
                new Object[]{deviceId},
                new VerifyPasscodeRowMapper.GetCustomerIdByDeviceIdRowMapper());
        return verifyPasscode.getCustomerId();
    }

    public String getPasscodeByCustomerId(long customerId) {
        VerifyPasscode verifyPasscode = jdbcTemplate.queryForObject("Select PASSCODE from CUSTOMER where CUSTOMERID=?",
                new Object[]{customerId},
                new VerifyPasscodeRowMapper.GetPasscodeByCustomerIdRowMapper());
        return verifyPasscode.getPasscode();
    }
}
