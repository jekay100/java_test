/*************************************************************************
	> File Name: Jim.java
	> Author: trilever
	> Version: 1.0
	> Mail: trilever31204@gmail.com
	> Created Time: 2014-7-18 14:52:50
	> This program test the Jim.
************************************************************************/
package com.trilever;

public class Jim implements Iboy
{

	@Override
	public void makeHappy(Event e)
	{
		switch (e.happy)
		{
		case 0:
			System.out.println("jim0");
			break;

		case 1:
			System.out.println("jim1");
			break;

		case 2:
			System.out.println("jim2");
			break;

		default:
			break;
		}
	}
}
