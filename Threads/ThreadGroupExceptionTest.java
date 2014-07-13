/**
 * @file Name: ThreadGroupExceptionTest.java
 * @description:Test the ThreadGroupExceptionTest class, the threadgroup deal the * * * * exception for the thread
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-8 14:53:00
 */
public class ThreadGroupExceptionTest implements Runnable
{
	public void run()
	{	
		for(int i=0;i<100;i++)
		{
			System.out.println(100/(i-20));
		}
	}
	public static void main(String[] args) 
	{
		ThreadGroup tg = new ThreadGroup("tg1"){
			//set the thread exception dealer func
			//the threadgroup deal the exception for the thread
			public void uncaughtException(Thread t, Throwable e) 
			{
				System.out.println("The Error occure in the thread: "+t.currentThread().getName()+e.getMessage());
			}
		};
		
		ThreadGroupExceptionTest tgt = new ThreadGroupExceptionTest();
		//construct the thread, add it to the threadgroup
		Thread t = new Thread(tg,tgt);
		t.start();
		
		//construct the thread, add it to the threadgroup
		Thread t1 = new Thread(tg,tgt);
		t1.start();
		
		//calculate the num of the thread in the threadgroup
		System.out.println(tg.activeCount());
		
		//the threadgroup with dealing fun an deal with the exception came out of the threads in the threadgroup but not the thread came out of the threadgroup
		System.out.println(20/0);
	}
}
