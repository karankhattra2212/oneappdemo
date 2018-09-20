package com.barclays.oneappdemo.dao;

import com.barclays.oneappdemo.dto.DeviceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class OneAppDaoDevice {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public DeviceDTO findDeviceById(int device_id){
        return jdbcTemplate.queryForObject("Select *top from Device where deviceid=", new Object[]{
                device_id}, new BeanPropertyRowMapper<DeviceDTO>(DeviceDTO.class)
        );
    }


    class DeviceRowMapper implements RowMapper<DeviceDTO>{
         @Override
        public DeviceDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
             DeviceDTO device = new DeviceDTO();
             device.setDeviceid(rs.getInt(1));
             device.setAppversion(rs.getInt(3));
             device.setLastmodified(rs.getTimestamp(4));
             return device;
         }
    }
}
