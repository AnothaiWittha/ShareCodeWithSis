package Utilities2;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader2 {
	private static Properties configFile;

    static {
        
        try {				//from Constants Class
            String filePath = Constants2.config_filePath;
            FileInputStream input = new FileInputStream(filePath);
            
            configFile = new Properties();
            configFile.load(input);
            
            
            input.close();
            
        }catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public static String getProperty(String keyname) {
    	return configFile.getProperty(keyname);
    }
}



