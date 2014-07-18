package com.trilever;
//事件对象，对事件的封装，目的是提供给观察者。
public class Event
{
	int happy = 0;
	public void setHappy(int i)
	{
		this.happy = i;
	}
}
