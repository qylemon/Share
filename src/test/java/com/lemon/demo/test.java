package com.lemon.demo;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @Author: Qy
 * @Date: 2019-03-01 15:08
 */
public class test {

    public void salt(){
        String hashAlgorithmName = "md5";//加密方式
        Object crdentials = "123456";//密码原值
        Object salt = "wxKYXuTPST5SG0jMQzVPsg==";//盐值
        int hashIterations = 1024;//加密1024次
        String result = new SimpleHash(hashAlgorithmName,crdentials,salt,hashIterations).toBase64();
        System.out.println(result);
    }

    public void pwd(){
        //加密方式
        String hashAlgorithmName = "md5";
        //原密码
        String credentials = "123456";
        //加密次数
        int hashIterations = 1024;
        //加密盐值，大家可以用生成字符串的方法
        String hash = "wxKYXuTPST5SG0jMQzVPsg==";
        ByteSource credentialsSalt = ByteSource.Util.bytes(hash);
        String password = new SimpleHash(hashAlgorithmName, credentials, credentialsSalt, hashIterations).toHex();
        System.out.println(password);
    }

    public boolean checkIdCardNo(String idCardNo) throws Exception{
        try {
            if(StringUtils.isBlank(idCardNo)){
                return false;
            }
            int length = idCardNo.length();
            if(length == 15){
                Pattern p = Pattern.compile("^[0-9]*$");
                Matcher m = p.matcher(idCardNo);
                return m.matches();
            }else if(length == 18){
                String front_17 = idCardNo.substring(0, idCardNo.length() - 1);//号码前17位
                String verify = idCardNo.substring(17, 18);//校验位(最后一位)
                Pattern p = Pattern.compile("^[0-9]*$");
                Matcher m = p.matcher(front_17);
                if(!m.matches()){
                    return false;
                }else{
                    this.checkVerify(front_17, verify);
                }
            }
            return false;
        } catch (Exception e) {
            throw e;
        }
    }

    public static boolean checkVerify(String front_17,String verify) throws Exception{
        try {
            int[] wi = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2,1};
            String[] vi = {"1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2"};
            int s = 0;
            for(int i = 0; i<front_17.length(); i++){
                int ai = Integer.parseInt(front_17.charAt(i) + "");
                s += wi[i]*ai;
            }
            int y = s % 11;
            String v = vi[y];
            if(!(verify.toUpperCase().equals(v))){
                return false;
            }
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    public static void main(String []ages ) throws Exception {
        test t = new test();
        t.checkIdCardNo("21020319750310272Z");
    }

}
