

package com.barclays.oneappdemo.cryptography;


import sun.misc.BASE64Decoder;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;

import static com.barclays.oneappdemo.util.OneAppConstants.CryptographyConstants.PADDING_MESSAGE;
import static java.util.Objects.isNull;


public class CryptoHandler {

    private CryptoHandler() {
        throw new IllegalStateException();
    }

    public static String decryptMessage(String encryptedData, byte[] iv, Key key) throws Exception {

        if (isNull(encryptedData)) {
            return null;
        }
        Cipher cipher = Cipher.getInstance(PADDING_MESSAGE.getValue());
        IvParameterSpec ivSpec = new IvParameterSpec(iv);
        cipher.init(Cipher.DECRYPT_MODE, key, ivSpec);
        byte[] decodedValue = new BASE64Decoder().decodeBuffer(encryptedData);
        byte[] decValue = cipher.doFinal(decodedValue);
        return new String(decValue);
    }

    public static List<String> encryptMessage(String data, Key key) throws Exception {

        if (isNull(data)) {
            return new ArrayList<>();
        }
        List<String> encryptedValues = new ArrayList<>();
        Cipher c = Cipher.getInstance(PADDING_MESSAGE.getValue());
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(data.getBytes(StandardCharsets.UTF_8));
        byte[] ivBytes = c.getIV();
        byte[] ivVal = Base64.getEncoder().encode(ivBytes);
        encryptedValues.add(new String(ivVal));
        byte[] encryptedValue = Base64.getEncoder().encode(encVal);
        encryptedValues.add(new String(encryptedValue));
        return encryptedValues;
    }


}


