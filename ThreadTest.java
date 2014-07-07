/**
 * @file Name: ThreadTest.java
 * @description:Test the ThreadTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-7 10:02:00
 */
public class  ThreadTest extends Thread
{
	public void f(String str)
	{
		System.out.println(str);
	}
	//run method includes the code you want to exec in the current Thread. 
	public void run()
	{
		//for different thread exec the different func
		f(Thread.currentThread().getName());
	}
	//the main thread
	public static void main(String[] args) 
	{
		for(int i=0;i<100;i++)
		{
			//construct a new thread and run it
			new ThreadTest().start();
		}
		
		System.out.println(Thread.currentThread().getName());
	}
}
