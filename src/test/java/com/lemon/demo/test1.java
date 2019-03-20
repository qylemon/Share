package com.lemon.demo;

import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;

/**
 * @Author: Qy
 * @Date: 2019-03-08 21:10
 */
//🤒
//💋徐蓉蓉
public class test1 {

    public static void main(String []ages ) throws Exception {
        String nickname = "Z_zh";
        if(nickname != null){
        //进行编码
            String a =Base64.encodeBase64String(nickname.getBytes("UTF-8"));
            //进行解码
//            String a = new String(Base64.decodeBase64(nickname), "UTF-8");
            System.out.println(a);
        }
    }
}
