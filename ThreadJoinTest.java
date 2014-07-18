/**
 * @file Name: ThreadJoinTest.java
 * @description:Test the ThreadJoinTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-7 15:43:00
 */
public class  ThreadJoinTest extends Thread
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
		for(int i=0;i<100;i++)
		{
			System.out.println(Thread.currentThread().getName()+"-----"+i);
			//construct new thread 
			ThreadJoinTest t1 = new ThreadJoinTest();
			ThreadJoinTest t2 = new ThreadJoinTest();
			if(i==20)
			{
				t1.start();
				t2.start();
				
				t1.join();
				t2.join();
			}
		}
	}
}
