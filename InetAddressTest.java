/**
 * @file Name: InetAddressTest.java
 * @description:Test the InetAddressTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-9 10:34:00
 */
import java.net.*;
public class InetAddressTest
{
	public static void main(String[] args)  throws Exception
	{
		//this InetAddress is an address class,it represents an IP address.
		//this class provades several methods to test the IP Address features.
		InetAddress iaddr = InetAddress.getByAddress(new byte[]{(byte)218,59,(byte)186,75});
		//get the host name of this IP address
		System.out.println(iaddr.getHostName()); 
		//test the ip address is reachable, just like the cmd line: ping
		System.out.println(iaddr.isReachable(5000)); 
		
	}
}
