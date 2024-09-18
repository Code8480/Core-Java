package PropertyFiles;

import java.io.FileWriter;
import java.io.IOException;

public class CSVFile {

	public static void main(String[] args) {
		
		String csvFileName = System.getProperty("user.dir")+"\\data\\example.csv";
		
		try {
		FileWriter writer = new FileWriter(csvFileName);
		
		writer.append("Name,Age,Email \n");
		writer.append("John,30,j@email.com \n");
		writer.append("Smith,35,smith@email.com \n");
		writer.append("Jacob,38,jacob@email.com \n");
		
		writer.close();
		} catch (IOException e) {
			System.out.println("Error Occured : " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("CSV file created at:"+csvFileName);
		

	}

}
