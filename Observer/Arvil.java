/*************************************************************************
	> File Name: Arvil.java
	> Author: trilever
	> Version: 1.0
	> Mail: trilever31204@gmail.com
	> Created Time: 2014-7-18 14:52:50
	> This program test the Arivl.
************************************************************************/
package com.trilever;
import java.util.LinkedList;
import java.util.List;
public class Arvil
{
	//�¼�����
	Event e = new Event();
	List<Iboy> Iboys = new LinkedList<>();
	//ע���۲���
	public void addListenner()
	{
		Iboys.add(new Jim());
		Iboys.add(new Lilei());
	}
	//�����¼���Ҳ���Ǳ��۲���״̬�ĸı�
	public void setEvent(int i)
	{
		e.happy=i;
	}
	public List<Iboy> getBoys()
	{
		return Iboys;
	}
}
