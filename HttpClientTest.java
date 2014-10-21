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
		//�൱��һ�����������
		HttpClient httpCLient = new DefaultHttpClient();  

		// ����get����ʵ��,�൱��һ��http�������  
		HttpGet httpget = new HttpGet("http://www.163.com");  
		HttpPost httppost = new HttpPost("http://www.163.com");
		System.out.println("executing request+++++++++++++++ "+httpget.getURI());  

		try  
		{  
			// ʹ�ÿͻ���ִ��http���������� ������Ӧ����reponse  
			HttpResponse response = httpCLient.execute(httpget);  
			httpCLient.execute(request, context);
			// ȡ�÷�������Ӧ����response����������״̬����
			System.out.println("statusline-----------------"+response.getStatusLine());  
			
			// ȡ�÷�������Ӧ����response����������head���󲿷֣�ʵ����ÿһ��head����key-value�Ե���ʽ��
			org.apache.http.Header[] heads =response.getAllHeaders();
			//���header���ֵ�����	       
			for(org.apache.http.Header h:heads)
			{  
					System.out.println("header-----++++++"+h.getValue());  
			}  

			// ��ȡ��Ӧ����response��Ϣ�����body����  
			entity = response.getEntity();  
			if(entity != null){  
				// ��Ӧbody���ֵĳ���  
				System.out.println("��Ӧ���ݳ��ȣ�"+entity.getContentLength());
				//��body���ֵ�����������ļ���
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
