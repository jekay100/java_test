/**
 * @file Name: AccoutThreadTest.java
 * @description:Test the AccoutThreadTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-7 20:35:00
 */
//The account of a person
class Account
{
	//the name of the person
	private String name;
	//the balanceAccount of the person
	private int account;
	Account()
	{
	}
	Account(String aName,int aAccount)
	{
		name=aName;
		account=aAccount;
	}
	public void setName(String aName)
	{
		this.name=aName;
	}
	public void setAccount(int aAccount)
	{
		this.account=aAccount;
	}
	public String getName()
	{
		return this.name;
	}
	public int getAccount()
	{
		return this.account;
	}
}
public class  AccoutThreadTest extends Thread
{
	//the amount of money you want to get 
	private int drawAccount;
	//the amount of money in your account
	private Account balanceAccount;
	AccoutThreadTest(int adrawAccount,Account abalanceAccount)
	{
		this.drawAccount=adrawAccount;
		this.balanceAccount=abalanceAccount;
	}
	public void run() 
	{
		//add the concurrelock on the code block
		synchronized(balanceAccount)
		{
			if(drawAccount<=balanceAccount.getAccount())
			{
				System.out.println(Thread.currentThread().getName()+", You have got the money you want to draw: "+drawAccount);
				balanceAccount.setAccount(balanceAccount.getAccount()-drawAccount);
				System.out.println("The amount of money you left in the account is: "+balanceAccount.getAccount());
			}
			else
			{
				System.out.println(Thread.currentThread().getName()+", The amount of money in your account is not enough!");
			}
		}
	}
	//the main thread
	public static void main(String[] args) throws Exception
	{
		Account ac = new Account("wt",1000);
		new AccoutThreadTest(800,ac).start();
		new AccoutThreadTest(800,ac).start();
	}
}
