package com.barclays.cryptography;

import com.sun.org.apache.xml.internal.security.utils.Base64;
import sun.misc.BASE64Decoder;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;

import static com.barclays.util.OneAppConstants.CryptographyConstants.PADDING_MESSAGE;
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
        String ivVal = Base64.encode(ivBytes);
        encryptedValues.add(ivVal);
        String encryptedValue = Base64.encode(encVal);
        encryptedValues.add(encryptedValue);
        return encryptedValues;
    }


}
