package com.barclays.dao.rowmapper;

import com.barclays.dto.VerifyPasscode;
import com.barclays.util.OneAppConstants;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class VerifyPasscodeRowMapper {

    private VerifyPasscodeRowMapper(){
        throw new IllegalStateException();
    }

    public static class GetCustomerIdByDeviceIdRowMapper implements RowMapper<VerifyPasscode> {


        @Override
        public VerifyPasscode mapRow(ResultSet rs, int rowNum) throws SQLException {
            VerifyPasscode verifyPasscode = new VerifyPasscode();
            verifyPasscode.setCustomerId(String.valueOf(rs.getInt(OneAppConstants.StringConstants.COLUMN_CUSTOMERID.getValue())));
            return verifyPasscode;
        }
    }


    public static class GetPasscodeByCustomerIdRowMapper implements RowMapper<VerifyPasscode> {


        @Override
        public VerifyPasscode mapRow(ResultSet rs, int rowNum) throws SQLException {
            VerifyPasscode verifyPasscode = new VerifyPasscode();
            verifyPasscode.setPasscode(rs.getString(OneAppConstants.StringConstants.COLUMN_PASSCODE.getValue()));
            return verifyPasscode;
        }
    }
}
