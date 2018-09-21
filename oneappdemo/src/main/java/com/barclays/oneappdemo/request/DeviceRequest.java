package com.barclays.oneappdemo.request;

import com.barclays.oneappdemo.dto.CustomerDTO;

import java.sql.Timestamp;

public class DeviceRequest {
    private int deviceid;
    private CustomerDTO customer;
    private int appversion;
    private Timestamp lastmodified;

    public int getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(int deviceid) {
        this.deviceid = deviceid;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public int getAppversion() {
        return appversion;
    }

    public void setAppversion(int appversion) {
        this.appversion = appversion;
    }

    public Timestamp getLastmodified() {
        return lastmodified;
    }

    public void setLastmodified(Timestamp lastmodified) {
        this.lastmodified = lastmodified;
    }
}
