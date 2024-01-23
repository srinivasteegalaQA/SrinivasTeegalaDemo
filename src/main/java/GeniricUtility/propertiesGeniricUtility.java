package GeniricUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class propertiesGeniricUtility {
	
	public String getDataFromFile(String key) throws Exception
	{
	
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\login.properties");
		Properties po = new Properties();
		po.load(fi);
		String data = po.getProperty(key);
		return data;
	}
	
}
