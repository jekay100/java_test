/**
 * @file Name: MultiBroadCastTest.java
 * @description:Test the MultiBroadCastTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-11 9:09:00
 */
import java.net.*;
import java.io.*; 
public class MultiBroadCastTest
{
	//the default port
	final static int MULTI_PORT=30000;
	//the default IP address
	final static String CAST_IP="230.0.0.1";
	final static int MAX_SIZE=102400;
	public static void main(String[] args) throws Exception
	{
		new Thread(new SendThread()).start();
		new Thread(new RecieveThread()).start();
	}
}

//the send thread
class SendThread implements Runnable
{
	public void run()
	{
		try
		{ 	
			//construct a multicastsocket
			MulticastSocket socket = new MulticastSocket();
			socket.setTimeToLive(1);
			InetAddress iaa = InetAddress.getByName(MulticastSocketSendTest.CAST_IP) ;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String content = null;
			while((content=br.readLine())!=null)
			{
				//construct a DatagramPacket, it is aimed at storing the data which will be transmitted by DatagramSocket,with server's address and port.
				DatagramPacket dgp = new DatagramPacket(content.getBytes(),content.getBytes().length,iaa,MulticastSocketSendTest.MULTI_PORT); 
				//send the data
				socket.send(dgp); 
			}
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

//the receive thread
class RecieveThread implements Runnable
{
	public void run()
	{
		try
		{ 
			//construct a multicastsocket
			MulticastSocket socket = new MulticastSocket(MulticastSocketSendTest.MULTI_PORT);
			InetAddress iaa = InetAddress.getByName(MulticastSocketSendTest.CAST_IP) ;
			socket.setTimeToLive(1);
			socket.joinGroup(iaa);
			while(true)
			{
				//construct a DatagramPacket, it is aimed at storing the data which get by DatagramSocket
				DatagramPacket dgp = new DatagramPacket(new byte[MulticastSocketSendTest.MAX_SIZE],MulticastSocketSendTest.MAX_SIZE);
				//store the data into the DatagramPacket
				socket.receive(dgp); 
				System.out.println(new String(dgp.getData(),0,dgp.getLength()));
			}
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
