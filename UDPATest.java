/**
 * @file Name: UDPATest.java
 * @description:Test the UDPATest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-10 17:21:00
 */
import java.net.*;
public class UDPATest
{
	final static int MAX_SIZE=102400;
	final static int PORT=30000;
	public static void main(String[] args) 
	{
		try
		{
			//construct a DatagramSocket with specific port
			DatagramSocket dgs = new DatagramSocket(PORT);
			while(true)
			{
				//construct a DatagramPacket, it is aimed at storing the data which get by DatagramSocket
				DatagramPacket dgp = new DatagramPacket(new byte[MAX_SIZE],MAX_SIZE);
				//store the data into the DatagramPacket
				dgs.receive(dgp); 
				System.out.println(new String(dgp.getData(),0,dgp.getLength()));
			}
		}
		
		catch(Exception e)
		{
			System.out.println("error");
		}
	}
}
