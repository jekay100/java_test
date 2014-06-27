/*************************************************************************
    > File Name: chesse.java
    > Author: trilever
    > Version: 1.0
    > Mail: trilever31204@gmail.com 
    > Created Time: 2014-5-12 9:20:00
 ************************************************************************/
import java.io.*;
import java.util.*;
 
public class chesse
{
	static final int size=11;
	static String[][] chessp=new String[size][size];
	static
	{
		for(int i=0;i<size;i++)
			for(int j=0;j<size;j++)
			{
				chessp[i][j]="□";
			}
	}
	public void printMap()
	{
	for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(chesse.chessp[i][j]);
			}
			System.out.print("\n");
		}
	}

	public static void judge()
	{

	}
	
	public static void main(String[] args)throws Exception
	{
		chesse s=new chesse();
		s.printMap();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line="";
		while(((line=br.readLine())!=null))
		{
			Random r=new Random();
			if(line.charAt(1)==',')
			{
				String[] str=line.split(",");
				String status1=s.chessp[Integer.parseInt(str[0])-1][Integer.parseInt(str[1])-1];
				if((status1.equals("□")))
				{
					s.chessp[Integer.parseInt(str[0])-1][Integer.parseInt(str[1])-1]="●";
				}
				String status2=	s.chessp[r.nextInt(s.size)][r.nextInt(s.size)];
				if((status2.equals("□")))
				{
					s.chessp[r.nextInt(s.size)][r.nextInt(s.size)]="△";
				}
			}
			s.printMap();
		}
	}
}
