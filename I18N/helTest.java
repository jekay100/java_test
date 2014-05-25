/**
 * @file Name: helTest.java
 * @description:
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-5-25 8:44:36
 */
import java.util.*;
public class helTest
{

	public static void main(String[] args)throws Exception
	{
		//get the currentLocale
		Locale currentLocale=Locale.getDefault(Locale.Category.DISPLAY);
		//bind the resource file with the resourcebound
		ResourceBundle res=ResourceBundle.getBundle("mse",currentLocale);
		//search and replace the word hello with chinese ÄãºÃ.
		System.out.println(res.getString("hello"));

	}

}
