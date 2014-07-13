/**
 * @file Name: ReadFromProcess.java
 * @description: ReadFromProcess
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-6-30 13:27:00
 */
import java.io.*;
public class ReadFromProcess
{
	public static void main(String[] args) throws Exception
	{
		//create a process
		Runtime runtime = Runtime.getRuntime();
		Process proc = runtime.exec("javac.exe");
		
		//read from the process	
		InputStreamReader isr = new InputStreamReader(proc.getErrorStream()); 
		BufferedReader br = new BufferedReader(isr);
		
		while(br.readLine()!=null)
		{
			System.out.println(br.readLine());
		}
	}	
}