package IOFolderFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAction {
	
	//For creating a new file
	public static void createFile(String filePath) {
		File file = new File(filePath);
		try {
			if(file.createNewFile()) {
				System.out.println("New File Created: " + file.getName());
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) { //Checked Exception - compiler identified
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("In Finally block");
		}
		
	}
	
	public static void writeFile(String filePath) {
		FileWriter mywriter;
		try {
			mywriter = new FileWriter(filePath);
			mywriter.write("Welcome to Java File Handling...");
			mywriter.close();
		} catch (IOException e) {
			System.out.println("An error occured...");
			e.printStackTrace();
		}
		System.out.println("Successfully written");
	}
	
	public static void readFile(String filePath) {
		File file = new File(filePath);
		Scanner myReader;
		try {
			myReader = new Scanner(file);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println("Reading: "+data);
			}
				myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occured while Reading...");
			e.printStackTrace();
		}
		
	}
		
	
	public static void main(String[] args) {
		
		String filePath = "C:\\myfiles\\FirstFile.txt";
//		createFile(filePath);
//		writeFile(filePath);
		readFile(filePath);

	}

}
