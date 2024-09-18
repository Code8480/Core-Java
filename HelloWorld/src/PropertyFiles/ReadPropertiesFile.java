package PropertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadPropertiesFile {

	public static void main(String[] args) {

		Properties properties = new Properties();

		String filePath = System.getProperty("user.dir") + "\\data\\example.properties";

		try {
			FileInputStream file = new FileInputStream(filePath);

			properties.load(file);

			file.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error Occured : " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error Occured : " + e.getMessage());
		}
		
		String name = properties.getProperty("Name");
		String email = properties.getProperty("Email");
		String age = properties.getProperty("Age");
		
		System.out.println(name + " " + age + " " + " " +email);
		
		Set<String> keys = properties.stringPropertyNames();
		System.out.println(keys);
		
		for(String s: keys) {
			System.out.println(s);
		}
		
		Collection<Object> values = properties.values();
		System.out.println(values);
		
		for(String key : properties.stringPropertyNames()) {
			
			System.out.println(key + " " + properties.getProperty(key));
		}
		

	}

}
