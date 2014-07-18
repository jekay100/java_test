/**
 * @file Name: hashmapTest.java
 * @description:
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-5-30 16:00:00
 */
import java.util.*;
class apple
{
	String color;
	double weight;
	public apple()
	{
		this.color = "red";
		this.weight = 10.0;
	}

	public apple(String acolor,double aweight)
	{
		this.color = acolor;
		this.weight = aweight;
	}

	//the override of toString()
	@Override
	public String toString()
	{
		return "apple[color:"+this.color+"weight:"+this.weight+"]";
	}
	//the override of equals()
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		
		if(obj!=null&&obj.getClass()==apple.class)
		{
			apple app = (apple)obj;
			if((this.weight==app.weight)&&(this.color.equals(app.color)))
			{
				return true;
			}
		}
		return false;
	}
	//the override of hashcode()
	@Override
	public int hashCode()
	{
		return color.hashCode()+(int)weight;
	}
}
public class hashmapTest
{
	public static void main(String[] args)
	{
		//the use of LinkedHashMap
		//class String has it's own equals() and hashcode() method.
		LinkedHashMap<String,Integer> hp = new LinkedHashMap<>();
		hp.put("张三",90);
		hp.put("李四",80);
		hp.put("王五",70);
		hp.put("赵六",60);
		System.out.println(hp);

		//the use of HashMap
		//class apple do not has it's own equals() and hashcode() method.
		HashMap<apple,Integer> hp1 = new HashMap<>();
		hp1.put(new apple("green",4.3),4);
		hp1.put(new apple("blue",6.7),5);
		hp1.put(new apple("black",5.3),6);

		System.out.println(hp1);
	}
}
