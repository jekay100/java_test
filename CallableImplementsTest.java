/**
 * @file Name: CallableImplementsTest.java
 * @description:Test the CallableImplementsTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-7 10:50:00
 */
import java.util.concurrent.*;

public class  CallableImplementsTest implements Callable<String>
{
	//run method includes the code you want to exec in the current Thread. 
	public String call() throws Exception 
	{
		//for different thread exec the different func
		return Thread.currentThread().getName();
	}
	//the main thread
	public static void main(String[] args) throws Exception
	{
		for(int i=0;i<100;i++)
		{
			//construct a new thread and run it
			CallableImplementsTest  cit= new CallableImplementsTest();
			FutureTask<String> ft = new FutureTask<String>(cit);
			new Thread(ft).start();
			System.out.println(ft.get());
		}
		
		System.out.println(Thread.currentThread().getName());
	}
}
