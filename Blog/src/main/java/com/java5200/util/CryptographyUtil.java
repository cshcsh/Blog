package com.java5200.util;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * 加密工具
 * @author CSH
 * @date 2018年6月2日下午9:56:16
 */
public class CryptographyUtil {

	
	/**
	 * Md5加密
	 * @param str
	 * @param salt
	 * @return
	 */
	public static String md5(String str,String salt){
		return new Md5Hash(str,salt).toString();
	}
	
	public static void main(String[] args) {
		String password="123456";
		
		System.out.println("Md5加密："+CryptographyUtil.md5(password, "java5200"));
	}
}
