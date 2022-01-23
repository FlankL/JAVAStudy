package com.flank.tools;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author flank
 * @date 2021/5/17 10:18
 */
public class MD5 {
    public static void main(String[] args) {
        String text="111111";
        String md5ByGolden = md5ByGolden(text);
        String md5 = MD5(text);
        System.out.println(md5==md5ByGolden);

    }
    public static String MD5(String sourceStr){
        String result = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(sourceStr.getBytes());
            byte b[] = md.digest();
            int i;
            StringBuilder buf = new StringBuilder();
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0){
                    i += 256;}
                if (i < 16){
                    buf.append("0");}
                buf.append(Integer.toHexString(i));
            }
            result = buf.toString().substring(8, 24);

        } catch (NoSuchAlgorithmException e) {
            System.out.println("加密失败");
        }
        return result;
    }

    /**
     * 金牌橱柜
     * @param plainText
     * @return
     */
    public static String md5ByGolden(String plainText)
    {
        byte[] secretBytes = null;
        try {
            MessageDigest md  = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes("utf-8"));
            secretBytes = md.digest();
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("no such algorithm！");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


        String md5code = new BigInteger(1, secretBytes).toString(16);
        int length = md5code.length();
        for (int i = 0; i < 32 - length; i++) {
            md5code = "0" + md5code;
        }
        return md5code;
    }
}
