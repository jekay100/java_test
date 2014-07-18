/**
 * @file Name: treeSetTest.java
 * @description:
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-5-27 9:28:39
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
public class treeSetTest
{

	public static void main(String[] args)
	{
		//use TreeSet class
		//class String has implements the interface comparable itself that we do not have to implement it by ourselves.
		TreeSet<String> ts = new TreeSet<>();
		ts.add("张三");
		ts.add("李四");
		ts.add("王五");
		ts.add("赵六");
		System.out.println(ts);

		//use TreeSet class
		//class apple do not has implements the interface comparator itself that we must implement it by ourselves
		TreeSet<apple> ts1 = new TreeSet<>(new Comparator<apple>(){
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


		ts1.add(new apple("green",4.3));
		ts1.add(new apple("blue",6.7));
		ts1.add(new apple("black",5.3));
		System.out.println(ts1);

		//use TreeSet class
		//class String has implements the interface comparator itself but we want it compare as t		//he method we want 
		//that we implement it by ourselves
		TreeSet<String> ts2 = new TreeSet<>(new Comparator<String>(){
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
		ts2.add("green");
		ts2.add("blue");
		ts2.add("esddfa");
		System.out.println(ts2);

	
	}

}
