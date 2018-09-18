package com.barclays.util;

public class OneAppConstants {

    public enum CryptographyConstants {
        PADDING_MESSAGE("AES/CBC/PKCS5Padding"),
        PADDING_COMM_KEY("RSA/ECB/PKCS1PADDING");

        private String value;

        CryptographyConstants(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }


    public enum StringConstants {
        DEFAULT_SUCCESS_CODE("0000"), DEFAULT_ERROR_CODE("999"),
        COLUMN_CUSTOMERID("CUSTOMERID"), COLUMN_PASSCODE("PASSCODE");

        private String value;

        StringConstants(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum SQLQueries {
        QUERY_GET_CUSTOMER_ID_BY_DEVICE_ID("Select CUSTOMERID from DEVICE where DEVICEID=?"),
        QUERY_GET_PASCCODE_BY_CUSTOMEE_ID("Select PASSCODE from CUSTOMER where CUSTOMERID=?");

        private String query;

        SQLQueries(String query) {
            this.query = query;
        }

        public String getQuery() {
            return query;
        }
    }
}
