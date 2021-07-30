package com.flank.tools;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * @author flank
 * @date 2021/5/31 9:57
 */
public class MD5Golden {
    public static String md5(String plainText)
    {
        byte[] secretBytes = null;
        try {
            MessageDigest md  = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes("utf-8"));
            secretBytes = md.digest();
        }
        catch (Exception e) {
            throw new RuntimeException("no such algorithm！");
        }


        String md5code = new BigInteger(1, secretBytes).toString(16);
        int length = md5code.length();
        for (int i = 0; i < 32 - length; i++) {
            md5code = "0" + md5code;
        }
        return md5code;
    }
    public static String genSign(HashMap<String, String> params, String signKey)
    {
        params.put("sign_key", signKey);
        String result = "";
        try {
            List<Map.Entry<String, String>> infoIds = new ArrayList<Map.Entry<String, String>>(params.entrySet());
            Collections.sort(infoIds, new Comparator<Map.Entry<String, String>>() {
                public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                    return (o1.getKey()).toString().compareTo(o2.getKey());
                }
            });
            // 构造签名键值对的格式
            for (Map.Entry<String, String> item : infoIds) {
                if (item.getKey() != null || item.getKey() != "") {
                    String key = item.getKey();
                    String val = item.getValue();
                    if (result == "") {
                        result += key + "=" + val;
                    } else {
                        result += "&" + key + "=" + val;
                    }
                }
            }
            //System.out.println(result);
        } catch(Exception e) {
            throw new RuntimeException("error");
        }
        return md5(result);
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        HashMap<String, String> map = new HashMap<String, String>();
        // map.put("client_id", "client_id_test");
        // map.put("access_token", "access_token_test");
        // map.put("timestamp", "1562325354");
        String token ="b4884282482cc41b9aa2ef37f32b6261";
        //  传入参数
        map.put("username", "2017021007");
        map.put("phone", "18859803632");
        map.put("timestamp","1623119000201");
        String signKey = "jpcg123*";
        //加密获得token
        String sign = genSign(map, signKey);
        System.out.println(sign);
        System.out.println(token);
        //验证比较
        System.out.println(sign.equals(token));
    }

}
