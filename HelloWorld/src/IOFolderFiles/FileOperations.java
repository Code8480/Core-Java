package IOFolderFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
	
	//Create New File
	public static void createFile(String filePath) {
		
		File newFileObj = new File(filePath);
		try {
		if(newFileObj.createNewFile()) {
			System.out.println("New File has been created" + newFileObj.getName());
		} else {
			System.out.println("File already exists");
		}} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//Write to a File
public static void writeFile(String filePath) {
		
	try {	
	FileWriter mywriter = new FileWriter(filePath);
			mywriter.write("Welcome to Java File Handling...");
			mywriter.close();
			System.out.println("Successful Write Oprtation");
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

//Reading from a File
public static void readFromFile(String filePath) {
	
	try {	
	File read = new File(filePath);
		Scanner myreader = new Scanner(read);
		
		while(myreader.hasNextLine()) {
			String data = myreader.nextLine();
			System.out.println(data);
		}
		myreader.close();
	} catch (FileNotFoundException e) {
		System.out.println("An error occured");
		e.printStackTrace();
	}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filePath = "C:\\myfiles\\myfile.txt";
//		createFile(filePath);
//		
//		writeFile(filePath);
		
		readFromFile(filePath);

	}

}
