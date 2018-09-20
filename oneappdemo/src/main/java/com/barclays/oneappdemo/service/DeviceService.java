package com.barclays.oneappdemo.service;

import org.springframework.stereotype.Service;

@Service
public class DeviceService {

    public boolean CheckDeviceID(int ID) {

        if( ID != 0){
            return true;
        }

    return false;
    }
}
