package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter folder path:");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("Folders:");
		File[] folders = path.listFiles(File::isDirectory);
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		System.out.println("Files:");
		File[] files = path.listFiles(File::isFile);
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\subfolder").mkdir();
		System.out.println("Folder created: " + success);

		sc.close();
	}

}
