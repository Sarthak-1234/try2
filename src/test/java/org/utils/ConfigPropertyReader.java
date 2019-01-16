package org.utils;

import java.io.IOException;
import java.util.Properties;

/**
 * This is the utility class for data read write
 *
 * @author QAIT
 *
 */
public class ConfigPropertyReader {

    private static String defaultConfigFile = "Config";
    public static String type="";
    
    /**
     * construtor of this class
     */
    public ConfigPropertyReader() {
    }

    /**
     *
     * This method will get the properties pulled from a file located relative to the base dir
     *
     * @param propFile complete or relative (to base dir) file location of the properties file
     * @param Property property name for which value has to be fetched
     * @return String value of the property
     */
    public static String getProperty(String propFilename, String Property) {
    	
    	if(type.equalsIgnoreCase("chrome")||type.equalsIgnoreCase("Firefox")||type.equalsIgnoreCase("ie")) {
    	
        try {
        	String proFilenew = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\desktop\\"+propFilename+".properties";
            Properties prop = ResourceLoader.loadProperties(proFilenew);
            return prop.getProperty(Property);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    	}
    	
    	else {
    		
    		try {
            	String proFilenew = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\mobile\\"+propFilename+".properties";
                Properties prop = ResourceLoader.loadProperties(proFilenew);
                return prop.getProperty(Property);
            } catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        	}
    		
    }
    
    
    public static String getConfigTypeProperty(String propFilename, String Property) {
        try {
        	String proFilenew = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\"+propFilename+".properties";
            Properties prop = ResourceLoader.loadProperties(proFilenew);
            return prop.getProperty(Property);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static String getConfigProperty(String property){
    	type=getConfigTypeProperty(defaultConfigFile, property);
        return type;
    }
    
    public static String getAccessProperty(String propFilename1, String Property1){
    	
    		try {
        	String proFilenew1 = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\"+propFilename1+".properties";
        	System.out.println(proFilenew1);
            Properties prop2 = ResourceLoader.loadProperties(proFilenew1);
            return prop2.getProperty(Property1);
    		}catch(Exception e) {
    			e.printStackTrace();
    			return null;
    		}
        
        }
    
    }

