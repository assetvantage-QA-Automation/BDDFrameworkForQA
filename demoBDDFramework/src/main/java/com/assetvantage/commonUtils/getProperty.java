package com.assetvantage.commonUtils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class getProperty {

	public static String readmyFile(String fieldname) throws IOException {
		Properties prop = new Properties();
		FileReader reader=new FileReader("D:\\EclipseWorkspace\\demoDDTFramework\\src\\main\\java\\com\\assetvantage\\configFiles\\basicDetails.properties"); 
		prop.load(reader);
		return prop.getProperty (fieldname);
		}

}
