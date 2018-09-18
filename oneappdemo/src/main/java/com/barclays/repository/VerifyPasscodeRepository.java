package com.barclays.repository;

import com.barclays.dao.rowmapper.VerifyPasscodeRowMapper;
import com.barclays.dto.VerifyPasscode;
import com.barclays.util.OneAppConstants.SQLQueries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class VerifyPasscodeRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public String getCustomerIdByDeviceId(long deviceId) {
        VerifyPasscode verifyPasscode = jdbcTemplate.queryForObject(SQLQueries.QUERY_GET_CUSTOMER_ID_BY_DEVICE_ID.getQuery(),
                new Object[]{deviceId},
                new VerifyPasscodeRowMapper.GetCustomerIdByDeviceIdRowMapper());
        return verifyPasscode.getCustomerId();
    }

    public String getPasscodeByCustomerId(long customerId) {
        VerifyPasscode verifyPasscode = jdbcTemplate.queryForObject(SQLQueries.QUERY_GET_CUSTOMER_ID_BY_DEVICE_ID.getQuery(),
                new Object[]{customerId},
                new VerifyPasscodeRowMapper.GetPasscodeByCustomerIdRowMapper());
        return verifyPasscode.getPasscode();
    }
}