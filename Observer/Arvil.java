package com.trilever;
import java.util.LinkedList;
import java.util.List;
public class Arvil
{
	//事件本身
	Event e = new Event();
	List<Iboy> Iboys = new LinkedList<>();
	//注册观察者
	public void addListenner()
	{
		Iboys.add(new Jim());
		Iboys.add(new Lilei());
	}
	//产生事件
	public void setEvent(int i)
	{
		e.happy=i;
	}
	public List<Iboy> getBoys()
	{
		return Iboys;
	}
}
