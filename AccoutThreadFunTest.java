/**
 * @file Name: AccoutThreadFunTest.java
 * @description:Test the AccoutThreadFunTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-8 09:00:00
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
	//the synchronized method,the this get the synchronized lock
	public synchronized void draw(int drawAccount)
	{
		if(drawAccount<=account)
			{
				System.out.println(Thread.currentThread().getName()+", You have got the money you want to draw: "+drawAccount);
				account=account-drawAccount;
				System.out.println("The amount of money you left in the account is: "+account);
			}
		else
			{
				System.out.println(Thread.currentThread().getName()+", The amount of money in your account is not enough!");
			}
	}
}
public class  AccoutThreadFunTest extends Thread
{
	//the amount of money you want to get 
	private int drawAccount;
	//the amount of money in your account
	private Account balanceAccount;
	AccoutThreadFunTest(int adrawAccount,Account abalanceAccount)
	{
		this.drawAccount=adrawAccount;
		this.balanceAccount=abalanceAccount;
	}
	public void run() 
	{
		//the balanceAccount object call the synchronized method. this has the synchronized lock
		balanceAccount.draw(drawAccount);
	}
	//the main thread
	public static void main(String[] args) throws Exception
	{
		Account ac = new Account("wt",1000);
		//construct 2 different threads
		new AccoutThreadFunTest(800,ac).start();
		new AccoutThreadFunTest(800,ac).start();
	}
}
