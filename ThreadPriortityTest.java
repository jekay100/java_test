/**
 * @file Name: ThreadPriortityTest.java
 * @description:Test the ThreadPriortityTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-7 16:41:00
 */
public class  ThreadPriortityTest extends Thread
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
			ThreadPriortityTest t1 = new ThreadPriortityTest();
			ThreadPriortityTest t2 = new ThreadPriortityTest();
			//set the priority of the threads
			t1.setPriority(Thread.MAX_PRIORITY); 				
			t2.setPriority(Thread.MAX_PRIORITY-1); 				
			t1.start();
			t2.start();
	}
}
