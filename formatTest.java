/**
 * @file Name: formatTest.java
 * @description:
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-5-25 14:16:56
 */
import java.text.*;
import java.util.*;
public class formatTest
{

	public static void main(String[] args)throws Exception
	{

		double d = 1234.432;
		//the use of numberformat
		NumberFormat curIns = NumberFormat.getCurrencyInstance(Locale.US);
		
		NumberFormat intIns = NumberFormat.getIntegerInstance();
	
		NumberFormat perIns =NumberFormat.getPercentInstance();

		System.out.println(curIns.format(d));

		System.out.println(intIns.format(d));

		System.out.println(perIns.format(d));

	
		//the use of dateformat
		Date date = new Date();

		DateFormat df=DateFormat.getDateTimeInstance();
		
		System.out.println(df.format(date));

		//define the style and the locale of the format
		DateFormat usShort=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.LONG,Locale.US);
		
		System.out.println(df.format(date));
	
		//the use of simpledateformat,format the style of the date  output.	
		//transform the date the string
		SimpleDateFormat sdf = new SimpleDateFormat("生日：Gy年M月d日,是今年的第D天");
		
		System.out.println(sdf.format(date));

		//transform the string to the date
		String dat = "2014/5%25 13.34/12";

		SimpleDateFormat sdf1 = new SimpleDateFormat("y/M%d H.m/s");

		Date da = sdf1.parse(dat);
		
		System.out.println(da);

	}

}
