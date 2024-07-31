package com.avactis.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties properties;

	public ReadConfig() {
		properties = new Properties();
		try {
			FileInputStream input = new FileInputStream("src/main/resources/config.properties");
			properties.load(input);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getProperty(String key) {
		return properties.getProperty(key);
	}

}
