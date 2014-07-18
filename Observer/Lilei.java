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
