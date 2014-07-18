/*************************************************************************
	> File Name: ObserverLTest.java
	> Author: trilever
	> Version: 1.0
	> Mail: trilever31204@gmail.com
	> Created Time: 2014-7-18 14:52:50
	> This program test the ObserverLTest.
************************************************************************/
package com.trilever;
//������
public class ObserverLTest
{
	public static void main(String[] args)
	{
		Arvil a = new Arvil();
		a.addListenner();
		a.setEvent(2);
		for (Iboy i : a.getBoys())
		{
			i.makeHappy(a.e);
		}
	}

}
