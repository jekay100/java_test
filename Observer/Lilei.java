/*************************************************************************
	> File Name: Lilei.java
	> Author: trilever
	> Version: 1.0
	> Mail: trilever31204@gmail.com
	> Created Time: 2014-7-18 14:52:50
	> This program test the Lilei.
************************************************************************/
package com.trilever;

public class Lilei implements Iboy
{
	@Override
	public void makeHappy(Event e)
	{
		switch (e.happy)
		{
		case 0:
			System.out.println("lilei0");
			break;

		case 1:
			System.out.println("lilei1");
			break;

		case 2:
			System.out.println("lilei2");
			break;

		default:
			break;
		}
	}
}
