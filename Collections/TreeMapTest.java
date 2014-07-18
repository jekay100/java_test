/**
 * @file Name: TreeMapTest.java
 * @description:
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-5-30 17:55:01
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
public class TreeMapTest
{
	public static void main(String[] args)
	{
		//use TreeMap class
		//class String has implements the interface comparable itself that we do not have to implement it by ourselves.
		TreeMap<String, Integer> ts = new TreeMap<>();
		ts.put("张三",90);
		ts.put("李四",80);
		ts.put("王五",70);
		ts.put("赵六",60);
		System.out.println(ts);

		//use TreeMap class
		//class apple do not has implements the interface comparator itself that we must implement it by ourselves
		TreeMap<apple,Integer> ts1 = new TreeMap<>(new Comparator<apple>(){
		@Override
		public int compare(apple o1,apple o2)
		{
			if(o1.weight>o2.weight)
			{
				return 1;
			}
	
			else if(o1.weight<o2.weight)
			{
				return -1;
			}

			else
			{
				return 0;
			}
		}
		});

		ts1.put(new apple("green",4.3),4);
		ts1.put(new apple("blue",6.7),5);
		ts1.put(new apple("black",5.3),6);
		System.out.println(ts1);

		//use TreeMap class
		//class String has implements the interface comparator itself but we want it compare as the method we want 
		//that we implement it by ourselves
		TreeMap<String,Integer> ts2 = new TreeMap<>(new Comparator<String>(){
		@Override
		public int compare(String o1,String o2)
		{
			if(o1.length()>o2.length())
			{
				return 1;
			}
	
			else if(o1.length()<o2.length())
			{
				return -1;
			}

			else
			{
				return 0;
			}
		}
		});
		ts2.put("green",4);
		ts2.put("blue",5);
		ts2.put("esddfa",6);
		System.out.println(ts2);
	}
}
