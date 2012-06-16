package com.woolsk.financialControl.seguranca;

import java.security.MessageDigest;

import sun.misc.BASE64Encoder;

public class Digester {

	public String digesterPasswords(String senha){
		try{
			 MessageDigest digest = MessageDigest.getInstance("MD5");      
             digest.update(senha.getBytes());      
             BASE64Encoder encoder = new BASE64Encoder ();      
             return encoder.encode (digest.digest ());   
		}catch(Exception e){
			e.printStackTrace();
			return senha;
		}
	}
}
