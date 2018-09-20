package com.barclays.oneappdemo.util;

import java.util.UUID;


public class OneAppUtil {
    private OneAppUtil() {
        throw new IllegalStateException();
    }

    //For generation customer ids by guid whie accepting terms and conditions
    public static String generateCustID(int guid){
        return UUID.randomUUID().toString() + "-" + guid;
    }
}
