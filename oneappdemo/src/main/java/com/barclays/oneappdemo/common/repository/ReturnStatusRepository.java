package com.barclays.oneappdemo.common.repository;

import static com.barclays.oneappdemo.util.OneAppConstants.SQLQueries.QUERY_GET_RETURN_STATUS_BY_RETURN_CODE;

import com.barclays.oneappdemo.common.dao.rowmapper.CommonRowMapper;
import com.barclays.oneappdemo.common.dto.ReturnStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ReturnStatusRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public ReturnStatus getReturnStatusByReturnCode(String code){
        return jdbcTemplate.queryForObject(QUERY_GET_RETURN_STATUS_BY_RETURN_CODE.getQuery(),
                new Object[]{code},
                new CommonRowMapper.GetReturnStatus()
                );

    }
}
