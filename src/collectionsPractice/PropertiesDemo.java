package collectionsPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("src/algorithm/extras/info.properties");
        properties.load(fis);
        System.out.println(properties);
        String string = properties.getProperty("SomeOtherInformation");
        System.out.println(string);
        properties.setProperty("DBPass", "SomePass");
        FileOutputStream fileOutputStream = new FileOutputStream("src/algorithm/extras/info.properties");
        properties.store(fileOutputStream, "Updated info.properties and performed housekeeping");
    }
}
