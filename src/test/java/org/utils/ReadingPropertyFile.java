package org.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadingPropertyFile {
	
	public  Properties prop1;
	public  FileInputStream fis;
	
	public ReadingPropertyFile(String Filename){
		
		prop1 = new Properties();
		try {
		System.out.println(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\"+Filename+"finalone.....");
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\"+Filename);
		System.out.println(fis);
		prop1.load(fis);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getProperty(String key) {
		
		return prop1.getProperty(key);
	}
	

}
