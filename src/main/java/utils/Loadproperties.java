package utils;

import constants.ProjectBaseConstantPaths;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Loadproperties {

    public static String getPropertyvalue(String key) throws IOException {
        Properties prop = new Properties();
        FileInputStream input = new FileInputStream(ProjectBaseConstantPaths.LOCATORS_FILE);
        try {
            prop.load(input);

        } catch (Exception e) {
            e.printStackTrace();
        }

        String data = prop.getProperty(key);
        return data;
    }

    public static String getConfigvalue(String key) throws IOException {
        Properties prop = new Properties();
        FileInputStream input = new FileInputStream(ProjectBaseConstantPaths.CONFIG_FILE);
        try {
            prop.load(input);

        } catch (Exception e) {
            e.printStackTrace();
        }

        String data = prop.getProperty(key);
        return data;
    }
    public static String gettestdatavalue(String key) throws IOException {
        Properties prop = new Properties();
        FileInputStream input = new FileInputStream(ProjectBaseConstantPaths.TESTDATA_FILE);
        try {
            prop.load(input);

        } catch (Exception e) {
            e.printStackTrace();
        }

        String data = prop.getProperty(key);
        return data;
    }
}
