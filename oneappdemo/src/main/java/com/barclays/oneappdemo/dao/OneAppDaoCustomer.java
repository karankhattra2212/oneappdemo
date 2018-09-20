package com.barclays.oneappdemo.dao;

import com.barclays.oneappdemo.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class OneAppDaoCustomer {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public CustomerDTO findCustomerById(String customer_id){
        return jdbcTemplate.queryForObject("select * from customer where customerid=",new Object[]{
                customer_id},
                new BeanPropertyRowMapper <CustomerDTO> (CustomerDTO.class)
                );
    }

    class CustomerRowMapper implements RowMapper <CustomerDTO> {
        @Override
        public CustomerDTO mapRow(ResultSet rs, int rowNum) throws SQLException{
            CustomerDTO cust = new CustomerDTO();
            cust.setCustomerid(rs.getString(1));
            return cust;
        }

    }

}
