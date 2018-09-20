package com.barclays.oneappdemo.service;

import org.springframework.stereotype.Service;

@Service
public class DeviceService {

    public boolean checkDeviceID(int ID) {
        boolean flag = false;
        if( ID != 0){
            flag =  true;
        }
            return flag;
    }
}
