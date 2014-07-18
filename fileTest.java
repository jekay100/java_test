/**
 * @file Name: fileTest.java
 * @description:The use of the class File
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-6-27 15:21:00
 */
import java.io.*;
import java.util.*;
public class fileTest
{
	public static void main(String[] args) 
	{
		//get the path of the file.
		File file = new File("E:/git/git_note");
		System.out.println(file.getPath());
		
		//list the roots of the disk
		File[] roots = File.listRoots(); 
		System.out.println(Arrays.toString(roots));
		
		//verify the existense of the directory then mkdir
		File file1 = new File("git_note");
		System.out.println(file1.exists());
		if(!file1.exists())
		{
			file1.mkdir();
		}	
		
		File file2 = new File("E:/Books");
		//list the directories in the disk
		File[] file3 = file2.listFiles();
		for(File temp_file:file3)
		{
			System.out.println(temp_file);
		}
				
		//list all the  files with specified suffin in the directory		
		myFilterlist(file2);
		//list all the files in the directory	
		mylist(file2);
	}

	//list all the  files with specified suffin in the directory
	public static void myFilterlist(File dir) 
	{
		File[] temp = dir.listFiles(new FileFilter()
			{
			public boolean accept(File pathname) 
			{
				try
				{
					if(pathname.getCanonicalPath().endsWith(".txt"))
						{
							return true;
						}
				}
				catch(IOException ex)
				{
					ex.printStackTrace();
				}
				return false;
			}
			}
			);
			for(File f2:temp)
			{	
				System.out.println(f2);
			}
						
			File[] temp1 = dir.listFiles();
			for(File f1:temp1)
			{
				if(f1.isDirectory())
					{
						myFilterlist(f1);
					}
			}
	}
	
	//list all the files in the directory
	public static void mylist(File dir) 
	{
		if(dir.isDirectory())
		{
			File[] temp = dir.listFiles();
		
			for(File f2:temp)
			{	
				if(f2.isFile())
				{
					System.out.println(f2);
				}
				else
				mylist(f2);
			}
		}
	}
}