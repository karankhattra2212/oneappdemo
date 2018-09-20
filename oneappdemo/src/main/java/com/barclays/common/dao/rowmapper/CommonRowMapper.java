package com.barclays.common.dao.rowmapper;

import com.barclays.common.dto.ReturnStatus;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.barclays.util.OneAppConstants.StringConstants.*;


public class CommonRowMapper {

    public static class GetReturnStatus implements RowMapper<ReturnStatus> {

        @Override
        public ReturnStatus mapRow(ResultSet rs, int rowNum) throws SQLException {
            ReturnStatus returnStatus = new ReturnStatus();
            returnStatus.setReturnCode(rs.getString(COLUMN_RETURN_CODE.getValue()));
            returnStatus.setReturnStatus(rs.getString(COLUMN_RETURN_STATUS.getValue()));
            returnStatus.setReturnDescription(rs.getString(COLUMN_RETURN_DESC.getValue()));
            return returnStatus;
        }
    }
}
