package com.isimtl.javaii.club.util;

import org.apache.commons.codec.digest.DigestUtils;

import com.isimtl.javaii.club.model.User;

public class HashUtils {
	
	private static final String[] PWDS = {"ahall","dlast","egreen","igold","ldan","mstan","phill","rgarden","sbol","yying"};
	
	private static String getHash(String pValue)
	{
		return DigestUtils.sha1Hex(pValue);
	}
	
	public static boolean comparePwd(String pPwd, User pUser)
	{
		boolean result = false;
		
		if (null != pUser)
		{
			result = getHash(pPwd).equals(pUser.getPassword());
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		for(String userName:PWDS)
		{
			System.out.println(String.format("UserName : %s Password : %s  Hash : %s", userName,userName,HashUtils.getHash(userName)));
		}
	}
}
