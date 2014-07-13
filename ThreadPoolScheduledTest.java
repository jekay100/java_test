/**
 * @file Name: ThreadPoolScheduledTest.java
 * @description:Test the ThreadPoolScheduledTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-8 19:57:00
 */
import java.util.concurrent.*;

public class ThreadPoolScheduledTest implements Runnable
{
	@Override 
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(Thread.currentThread().getName()+"----"+i);
		}
	}
	public static void main(String[] args) 
	{
		//construct a thread pool with 10 threads in it
		ScheduledExecutorService ses = Executors.newScheduledThreadPool(10); 
		ses.scheduleAtFixedRate(new ThreadPoolScheduledTest(), 5, 3, TimeUnit.SECONDS); 
		// ses.shutdown(); 
	}
}
