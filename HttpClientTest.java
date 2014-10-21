package com.wt;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.annotation.PostConstruct;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class HttpClientTest
{
	public static void main(String[] args)
	{
		InputStream is = null;
		OutputStream os = null;
		HttpEntity entity = null;
		//相当于一个浏览器对象
		HttpClient httpCLient = new DefaultHttpClient();  

		// 创建get请求实例,相当于一个http请求对象  
		HttpGet httpget = new HttpGet("http://www.163.com");  
		HttpPost httppost = new HttpPost("http://www.163.com");
		System.out.println("executing request+++++++++++++++ "+httpget.getURI());  

		try  
		{  
			// 使用客户端执行http请求对象，最后 返回响应对象reponse  
			HttpResponse response = httpCLient.execute(httpget);  
			httpCLient.execute(request, context);
			// 取得服务器响应对象response中所包含的状态对象
			System.out.println("statusline-----------------"+response.getStatusLine());  
			
			// 取得服务器响应对象response中所包含的head对象部分，实际上每一个head都是key-value对的形式。
			org.apache.http.Header[] heads =response.getAllHeaders();
			//输出header部分的内容	       
			for(org.apache.http.Header h:heads)
			{  
					System.out.println("header-----++++++"+h.getValue());  
			}  

			// 获取响应对象response消息对象的body部分  
			entity = response.getEntity();  
			if(entity != null){  
				// 响应body部分的长度  
				System.out.println("响应内容长度："+entity.getContentLength());
				//将body部分的内容输出到文件中
				is = entity.getContent();
				os = new FileOutputStream(new File("1.html"));
				byte[] b = new byte[1024];
				while(is.read(b)!=-1)
				{
					os.write(b);
				}
				is.close();
				os.close();
			}  
		} catch (ClientProtocolException e){  
			e.printStackTrace();  
		} catch (IOException e){  
			e.printStackTrace();  
		}finally{  
			httpCLient.getConnectionManager().shutdown();  
		}  
	}
}
