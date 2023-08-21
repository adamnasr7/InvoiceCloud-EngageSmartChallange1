package utilities;

import java.io.FileInputStream;

import java.util.Properties;

public class ConfigurationReader {

    private static final Properties properties = new Properties();

    static {
        //static block executes only once and before everything else.

        try {
            FileInputStream fileInputStream = new FileInputStream("configuration.properties");
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}