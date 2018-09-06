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
}
