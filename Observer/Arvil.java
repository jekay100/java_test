package com.trilever;
import java.util.LinkedList;
import java.util.List;
public class Arvil
{
	//�¼�����
	Event e = new Event();
	List<Iboy> Iboys = new LinkedList<>();
	//ע��۲���
	public void addListenner()
	{
		Iboys.add(new Jim());
		Iboys.add(new Lilei());
	}
	//�����¼�
	public void setEvent(int i)
	{
		e.happy=i;
	}
	public List<Iboy> getBoys()
	{
		return Iboys;
	}
}
