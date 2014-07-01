/**
 * @file Name: pathTest.java
 * @description:Test the path class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-1 16:37:00
 */
import java.nio.file.*;

public class pathTest
{
	public static void main(String[] args) throws Exception
	{
		//get the relative path
		Path path = Paths.get("1.java");
		Path path1 = Paths.get("4.java");
		Path path2 = Paths.get("C:/Python27/python.exe");
		
		//get the absolute path and get the path root
		System.out.println((path.toAbsolutePath().getRoot()));  

		//get the absolute path and git the path parents
		System.out.println((path.toAbsolutePath().getParent())); 
		
		//test the file can be read
		System.out.println(Files.isReadable(path)); 
		//test the file is hidden
		System.out.println(Files.isHidden(path)); 
		
		//copy the file in path to the file in path1
		Files.copy(path,path1,StandardCopyOption.REPLACE_EXISTING);
		
		//test the file can be exec
		System.out.println(Files.isExecutable(path2));
	}
}