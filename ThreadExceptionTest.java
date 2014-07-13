/**
 * @file Name: ThreadExceptionTest.java
 * @description:Test the ThreadExceptionTest class, the thread itself but not the 		* threadgroup deal with its own but not all the exceptions for the thread
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-8 14:53:00
 */
public class ThreadExceptionTest implements Runnable
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
		
		ThreadExceptionTest tgt = new ThreadExceptionTest();
		
		Thread t = new Thread(tgt);
		//set the exception dealer func 
		// the thread itself but not the threadgroup deal with its own but not all the exceptions for the thread
		t.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
			public void uncaughtException(Thread t, Throwable e) 
			{
				System.out.println("The Error occure in the thread: "+t.currentThread().getName()+e.getMessage());
			}
		}); 
		t.start();
		
		Thread t1 = new Thread(tgt);
		//set the exception dealer func 
		// the thread itself but not the threadgroup deal with its own but not all the exceptions for the thread
		t1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
			public void uncaughtException(Thread t, Throwable e) 
			{
				System.out.println("The Error occure in the thread: "+t.currentThread().getName()+e.getMessage());
			}
		}); 
		t1.start();
		
		//the thread dealing fun can also deal the exception came out of the main thread
		Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
			public void uncaughtException(Thread t, Throwable e) 
			{
				System.out.println("The Error occure in the thread: "+t.currentThread().getName()+e.getMessage());
			}
		}); 
		System.out.println(20/0);
	}
}
