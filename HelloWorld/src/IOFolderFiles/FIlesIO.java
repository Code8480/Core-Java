package IOFolderFiles;

import java.io.File;
import java.nio.file.Files;

public class FIlesIO {
	
	public static void createFolder(String folderpath)
	{
		File folder = new File(folderpath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("folder created : " + folderpath);
		}
		
		System.out.println("Folder already exists");
		
	}
	
	public static boolean checkFolderExist(String folderpath)
	{
		File folder = new File(folderpath);
		return folder.exists();
			
	}
	
//	public static void folderRename(String oldPath, String newPath) {
//		File oldFolder = new File(oldPath);
//		File newFolder = new File(newPath);
//		if(oldFolder.exists()) {
//			oldFolder.renameTo(newFolder);
//			System.out.println("Folder renamed to : " + newFolder);
//		}
//		
//	}
	
//	public static void deleteFolder(String folderPath) {
//		File folder = new File(folderPath);
//			if(folder.exists()) {
//				for (File file : folder.listFiles())
//				{
//					file.delete();
//				}
//				folder.delete();
//			
//			System.out.println("Folder deleted : " + folderPath);
//		}
//		
//	}

	public static void main(String[] args) {
		
		String folderpath = "C:\\myfiles";
		createFolder(folderpath);
		
		boolean print = checkFolderExist(folderpath);
		System.out.println("Folder exists here :" + print);
		
//		String newPath = "C:\\myfiles1"; 
//		folderRename(folderpath, newPath);
//		
//		deleteFolder(newPath);
		
		

	}

}
