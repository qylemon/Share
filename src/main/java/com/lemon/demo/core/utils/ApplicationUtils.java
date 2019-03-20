package com.lemon.demo.core.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

import java.util.Random;
import java.util.UUID;

/**
 * @Author: Qy
 * @Date: 2019-02-10 16:39
 */
public class ApplicationUtils {
    /**
     * 产生一个36个字符的UUID
     *
     * @return UUID
     */
    public static String randomUUID() {
        return UUID.randomUUID().toString();
    }

    /**
     * 产生一个32个字符的UUID
     *
     * @return UUID
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * md5加密
     *
     * @param value 要加密的值
     * @return md5加密后的值
     */
    public static String md5Hex(String value) {
        return DigestUtils.md5Hex(value);
    }

    /**
     * sha1加密
     *
     * @param value 要加密的值
     * @return sha1加密后的值
     */
    public static String sha1Hex(String value) {
        return DigestUtils.sha1Hex(value);
    }

    /**
     * sha256加密
     *
     * @param value 要加密的值
     * @return sha256加密后的值
     */
    public static String sha256Hex(String value) {
        return DigestUtils.sha256Hex(value);
    }

    /**
     * 获取多少位随机数
     * @param num
     * @return
     */
    public static String getNumStringRandom(int num){
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        //随机生成数字，并添加到字符串
        for(int i = 0;i<num;i++){
            str.append(random.nextInt(10));
        }
        return  str.toString();
    }

    /**
     * 获取区间内的随机数
     * @param min
     * @param max
     * @return
     */
    public static int getRandomBetween(int min, int max){
        Random random = new Random();
        int s = random.nextInt(max)%(max-min+1) + min;
        return s;
    }

    public static String salt(String pwd){
        String hashAlgorithmName = "md5";//加密方式
        Object credentials = pwd;//密码原值
        Object salt = "wxKYXuTPST5SG0jMQzVPsg==";//盐值
        int hashIterations = 1024;//加密1024次
        String saltpwd = new SimpleHash(hashAlgorithmName,credentials,salt,hashIterations).toBase64();
        return saltpwd;
    }

    public static String pwdmd(String pwd){
        //加密方式
        String hashAlgorithmName = "md5";
        //原密码
        String credentials = pwd;
        //加密次数
        int hashIterations = 1024;
        //加密盐值，大家可以用生成字符串的方法
        String hash = "wxKYXuTPST5SG0jMQzVPsg==";
        ByteSource credentialsSalt = ByteSource.Util.bytes(hash);
        String password = new SimpleHash(hashAlgorithmName, credentials, credentialsSalt, hashIterations).toHex();
        return password;
    }


}
