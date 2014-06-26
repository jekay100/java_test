/**
 * @file Name: runtimeTest.java
 * @description:
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-5-23 11:09:56
 */

public class runtimeTest 
{

	public static void main(String[] args)throws Exception
	{

		//通过这个static方法来获得Runtime实例对象。
		Runtime rt=Runtime.getRuntime();

		//output the num of the processors of the jvm
		System.out.println(rt.availableProcessors());
		
		//output the max memory of the jvm
		System.out.println(rt.maxMemory());
		
		//output the total memory of the jvm
		System.out.println(rt.totalMemory());
		
		//output the free memory of the jvm
		System.out.println(rt.freeMemory());
		
		//exec the programs in the system by jvm
		rt.exec("D:/Program Files/PuTTY/putty.exe");
	}

}
