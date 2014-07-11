/**
 * @file Name: UDPBTest.java
 * @description:Test the UDPBTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-10 17:21:00
 */
import java.net.*;
import java.io.*; 
public class UDPBTest
{
	final static int Server_PORT=30000;
	public static void main(String[] args) 
	{
		try
		{
			//construct client's DatagramSocket without specific port
			DatagramSocket dgs = new DatagramSocket();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String content = null;
			while((content=br.readLine())!=null)
			{
				InetAddress iaa = InetAddress.getByAddress(new byte[]{10,23,94,(byte)253});
				//construct a DatagramPacket, it is aimed at storing the data which will be transmitted by DatagramSocket,with server's address and port.
				//the DatagramPacket should has the address and the port it aimed at
				DatagramPacket dgp = new DatagramPacket(content.getBytes(),content.length(),iaa,Server_PORT); 
				//send the data
				dgs.send(dgp); 
			}
			
		}
		
		catch(Exception e)
		{
			System.out.println("error");
		}
	}
}
