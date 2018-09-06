package com.barclays.cryptography;

import com.sun.org.apache.xml.internal.security.utils.Base64;
import sun.misc.BASE64Decoder;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;



public class CryptoHandler {

    public static String decryptMessage(String encryptedData, byte[] iv, Key key) throws Exception {

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        IvParameterSpec ivSpec = new IvParameterSpec(iv);
        cipher.init(Cipher.DECRYPT_MODE, key, ivSpec);
        byte[] decodedValue = new BASE64Decoder().decodeBuffer(encryptedData);
        byte[] decValue = cipher.doFinal(decodedValue);
        String decryptedValue = new String(decValue);
        return decryptedValue;
    }

    public static List<String> encryptMessage(String data, Key key) throws Exception {

        ArrayList<String> encryptedvals = new ArrayList<String>();
        Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(data.getBytes(StandardCharsets.UTF_8));
        byte[] ivBytes = c.getIV();
        String ivVal = Base64.encode(ivBytes);
        encryptedvals.add(ivVal);
        String encryptedValue = Base64.encode(encVal);
        encryptedvals.add(encryptedValue);
        return encryptedvals;
    }


}
