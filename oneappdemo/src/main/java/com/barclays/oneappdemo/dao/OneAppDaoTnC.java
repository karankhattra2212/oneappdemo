package com.barclays.oneappdemo.dao;

import com.barclays.oneappdemo.dto.TnCDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class OneAppDaoTnC {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public TnCDTO getLatestTnC(){
        return jdbcTemplate.queryForObject("Select top 1 * from APP_TNC order by last_modified_date desc",
                new Object[]{}, new BeanPropertyRowMapper<TnCDTO>(TnCDTO.class)
        );
    }

    class TnCRowMapper implements RowMapper< TnCDTO > {
        @Override
        public TnCDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
            TnCDTO tnc = new TnCDTO();
            tnc.setTerm_id(rs.getInt(1));
            tnc.setTerm_desc(rs.getString(2));
            tnc.setLast_modified_date(rs.getTimestamp(3));
            return tnc;
        }
    }

}
