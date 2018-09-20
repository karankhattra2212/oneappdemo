package com.barclays.oneappdemo.util;

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
        COLUMN_CUSTOMERID("CUSTOMERID"), COLUMN_PASSCODE("PASSCODE"),
        COLUMN_RETURN_CODE("RETURN_CODE"), COLUMN_RETURN_STATUS("RETURN_STATUS"),
        COLUMN_RETURN_DESC("RETURN_DESC");

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
        QUERY_GET_PASCCODE_BY_CUSTOMEE_ID("Select PASSCODE from CUSTOMER where CUSTOMERID=?"),
        QUERY_GET_RETURN_STATUS_BY_RETURN_CODE("Select RETURN_CODE,RETURN_STATUS,RETURN_DESC from STATUS where RETURN_CODE=?");

        private String query;

        SQLQueries(String query) {
            this.query = query;
        }

        public String getQuery() {
            return query;
        }
    }
}
