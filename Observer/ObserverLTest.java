package com.trilever;
//≤‚ ‘¿‡
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
