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
