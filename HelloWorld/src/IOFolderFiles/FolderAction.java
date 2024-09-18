package IOFolderFiles;

import java.io.File;

public class FolderAction {
	
	public static void createFolder(String folderpath) {
		
		File folder = new File(folderpath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("Folder Created "+ folderpath);
			}
	}
	
public static boolean checkFolderExists(String folderpath) {
		
		File folder = new File(folderpath);
		return folder.exists();
//		if(!folder.exists()) {
//			folder.mkdir();
//			System.out.println("Folder Created "+ folderpath);
//			}
//		System.out.println("Folder already exists");
	}

public static void renameFolder(String oldPath, String newPath) {
	
	File oldFolder = new File(oldPath);
	File newFolder = new File(newPath);
	if(oldFolder.exists()) {
		oldFolder.renameTo(newFolder);
		System.out.println("Folder Rename to: "+ newPath);
		}
	
	}

public static void deleteFolder(String folderpath) {
	
	File folder = new File(folderpath);
		if(folder.exists()) {
			for(File file :folder.listFiles()) {
				file.delete();
			}
			folder.delete();
		System.out.println("Folder Deleted");
		}
	
	}

	public static void main(String[] args) {
		
		String folderpath = "C:\\myfiles";
		createFolder(folderpath);
		boolean folderExists = checkFolderExists(folderpath);
		System.out.println(folderExists);
//		renameFolder("C:\\myfiles", "C:\\myfiles1");
//		deleteFolder(folderpath);
	}

}
