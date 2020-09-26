package Utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.commons.io.FileUtils;


public class CommonLibrary {

	
	public static void deleteFiles(File filpath) {
		 try {
				FileUtils.cleanDirectory(filpath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	        System.out.println("Files in [allure-results] folder deleted successfully");
    } 
		
	
	
}
