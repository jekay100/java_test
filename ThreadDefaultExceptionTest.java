/**
 * @file Name: ThreadDefaultExceptionTest.java
 * @description:Test the ThreadDefaultExceptionTest class, the thread itself but not the * threadgroup deal with all the exceptions for the threads
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-8 14:53:00
 */
public class ThreadDefaultExceptionTest implements Runnable
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
		//set the exception dealer func 
		// the thread itself but not the threadgroup deal with all the exceptions for the threads
		Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
			public void uncaughtException(Thread t, Throwable e) 
			{
				System.out.println("The Error occure in the thread: "+t.currentThread().getName()+e.getMessage());
			}
		}); 
		
		ThreadDefaultExceptionTest tgt = new ThreadDefaultExceptionTest();
		Thread t = new Thread(tgt);
		t.start();
		
		Thread t1 = new Thread(tgt);
		t1.start();
		
		//the thread dealing fun can also deal the exception came out of the main thread
		System.out.println(20/0);
	}
}
