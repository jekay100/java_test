package com.trilever;

class singleTon
{
	public int a = 10;
	private singleTon() //����private����������ֹJDK�Լ�����������
	{
	}
	private static singleTon h; //����static field�����ڻ��洴���ĵ�������ͬʱ����Ƿ�����
	public static singleTon f() //����static�������Դ����������󣬷��ظö������á�
	{
		if(h==null)
		{
			h=new singleTon();
		}
		return h;
	}
}

public class singletonTest
{
	public static void main(String[] args)
	{
		System.out.println(singleTon.f().a); //ʹ��static�������󴴽�����������������
	}
}