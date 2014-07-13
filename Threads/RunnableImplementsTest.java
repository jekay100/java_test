/**
 * @file Name: RunnableImplementsTest.java
 * @description:Test the RunnableImplementsTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-7 10:50:00
 */
public class  RunnableImplementsTest implements Runnable
{
	//run method includes the code you want to exec in the current Thread. 
	public void run()
	{
		//for different thread exec the different func
		System.out.println(Thread.currentThread().getName());
	}
	//the main thread
	public static void main(String[] args) 
	{
		for(int i=0;i<100;i++)
		{
			//construct a new thread and run it
			(new Thread(new RunnableImplementsTest())).start();
		}
		
		System.out.println(Thread.currentThread().getName());
	}
}
