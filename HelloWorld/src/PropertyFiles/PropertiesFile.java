package PropertyFiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) {
		
		Properties properties = new Properties();
		properties.setProperty("Name", "Rich");
		properties.setProperty("Email", "r@gmail.com");
		properties.setProperty("Age", "36");
		
		String filename = System.getProperty("user.dir") + "\\data\\example.properties";
		
		try {
			FileOutputStream file = new FileOutputStream(filename); //Writing to properties file
				
		properties.store(file, "Sample data in properties file...");
		
		file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Error Occured : " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error Occured : " + e.getMessage());
		}
		
		System.out.println("Properties file have been created at this path : " + filename);

	}

}
