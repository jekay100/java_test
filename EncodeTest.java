/**
 * @file Name: EncodeTest.java
 * @description:Test the EncodeTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-9 10:57:00
 */
import java.net.*;
public class EncodeTest
{
	public static void main(String[] args)  throws Exception
	{
		encode the string in sepecific charset
		String enStr = URLEncoder.encode("你好","GBK");
		System.out.println(enStr);
		String deStr = URLDecoder.decode(enStr,"GBK");
		System.out.println(deStr);
	}
}
