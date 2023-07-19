package com.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class CommenUtil extends Constent {
	final static String PROPERTIES_FILE_PATH = "C:\\Users\\Admin\\eclipse-workspace\\Demo\\src\\test\\resources\\Server.properties";

	static FileReader reader;
	static Properties properties = null;

	public static void loadproperties() {

		try {
			reader = new FileReader(PROPERTIES_FILE_PATH);
			properties = new Properties();
			properties.load(reader);
			URL = properties.getProperty("APP_URL");
			Browser = properties.getProperty("BROWSER");
			NAME = properties.getProperty("USER_NAME");
			MAIL=properties.getProperty("USER_MAIL");
			NUMBER=properties.getProperty("USER_NUMBER");
			SELF=properties.getProperty("USER_SELF");
			LOCATION=properties.getProperty("FILE_LOCATION");
			
		} catch (Throwable e) {
			e.printStackTrace();

		}
	}
}
