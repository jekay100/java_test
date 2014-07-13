/**
 * @file Name: DeamonThreadTest.java
 * @description:Test the DeamonThreadTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-7 16:41:00
 */
public class  DeamonThreadTest extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(Thread.currentThread().getName()+"----"+i);
		}
	}
	//the main thread
	public static void main(String[] args) throws Exception
	{
			//construct new thread 
			DeamonThreadTest t1 = new DeamonThreadTest();
			//set the thread t1 as Deamon Thread after the main thread ends it will also die
			t1.setDaemon(true); 				
			t1.start();
			System.out.println(Thread.currentThread().getName()+"-----"+"ends");
	}
}
