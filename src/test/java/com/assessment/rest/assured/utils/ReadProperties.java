package com.assessment.rest.assured.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static String readConfig(String key) {		
		Properties config = new Properties();	
		String data;
		try {
			config.load(new FileInputStream(new File("src/test/resources/Config.properties")));
			data = config.getProperty(key);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("'Config.properties' file not found in the project src/test/resources/ path.");
		} catch (IOException e) {
			throw new RuntimeException("Unable to read the config.properties file.");
		}
		return data;		 
	}

}