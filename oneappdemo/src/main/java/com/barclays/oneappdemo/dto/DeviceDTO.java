package com.barclays.oneappdemo.dto;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name ="device")
public class DeviceDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int deviceid;
    private CustomerDTO customerDTO;
    private int appversion;

    private Timestamp lastmodified;

    @Id
    public int getDeviceid(){
        return deviceid;
    }

    public void setDeviceid(int deviceid){
        this.deviceid = deviceid;
    }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="customerid")
    public CustomerDTO getCustomer(){
        return customerDTO;
    }

    public void setCustomer() {
        setCustomer();
    }

    public void setCustomer (CustomerDTO customer){
        this.customerDTO = customer;
    }
    public int getAppversion(){
        return appversion;
    }

    public void setAppversion(int appversion) {
        this.appversion = appversion;
    }

    public Timestamp getLastmodified(){
        return lastmodified;
    }

    public void setLastmodified(Timestamp lastmodified){
        this.lastmodified = lastmodified;
    }

}
