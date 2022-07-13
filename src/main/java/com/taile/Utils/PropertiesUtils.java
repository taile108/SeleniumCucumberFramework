package com.taile.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {

    public static Properties properties = new Properties();
    public static         FileInputStream fis;


    public static Properties loadProperties(String filePath){
        try{
            fis = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return properties;
    }

    public static Properties loadApplicationProperties(){
        return loadProperties("src/test/resources/config/application.properties");
    }

    public static Properties loadFrameworkProperties(){
        return loadProperties("src/test/resources/config/framework.properties");
    }

    public static Properties loadUserProperties() {
        return loadProperties("src/test/resources/config/user.properties");
    }
}
