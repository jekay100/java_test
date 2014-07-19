/**
 * @file Name: showhand.java
 * @description:
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com
 * @created Time: 2014-5-29 9:01:50
 * this program has arrived to the step of delieved the cards
 */
import java.util.*;
class card implements Comparable<card>
{
	//color of the card
	private String color;

	//number of the card
	private String numb;

	//initializer
	public card()
	{
		this.color = "hongtao";
		this.numb = "2";
	}

	public card(String acolor,String anumb)
	{
		this.color = acolor;
		this.numb = anumb;
	}

	//print the card
	public String g()
	{
		String str=this.color+this.numb;
		return str;
	}

	public int compareTo(card c)
	{
		if(arraysUtil.find(showhand.numbs,this.numb)>arraysUtil.find(showhand.numbs,c.numb))
		{
			return 1;
		}

		else if(arraysUtil.find(showhand.numbs,this.numb)<arraysUtil.find(showhand.numbs,c.numb))
		{
			return -1;
		}

		else
		{
			if(arraysUtil.find(showhand.cols,this.color)>arraysUtil.find(showhand.cols,c.color))
			{
				return 1;
			}
			else if(arraysUtil.find(showhand.cols,this.color)<arraysUtil.find(showhand.cols,c.color))
			{
				return -1;
			}
			else
			{
				return 0;
			}

		}
	}
}

//find the index of the elem in the array
class arraysUtil
{
	
	static int find(String[] strArrays,String str)
	{
		int len = strArrays.length;
		int i=0;
		for(;i<len;i++)
		{
			if(str.equals(strArrays[i])==true)
			{
				return i;
			}
		}

			return -1;
	}
}

class player
{
	//the name of the player
	private String name;
	//the cardlist of the player owns
	private ArrayList<card> cards;

	//initializer
	public player()
	{
		name = null;
		cards = new ArrayList<card>();
	}

	public player(String aname)
	{
		name = aname;
		cards = new ArrayList<card>();
	}

	//the player gets a new card
	public void addCards(card acard)
	{
		this.cards.add(acard);
	}

	public String showCards()
	{
		String str="cards:"+"��";
		for(int i=1;i<cards.size();i++)
		{
			 str = str.concat(" ").concat(cards.get(i).g());
		}
		return str;
	}
	//print the info of the player
	public void f()
	{
		System.out.println("name: "+name);
		System.out.println(this.showCards());
	}
}


public class showhand
{
	//the max and min number of the players
	final static int MAX_PLAYER_NUM=5;
	final static int MIN_PLAYER_NUM=2;
	//the inf of the cards
	final static String[] cols = new String[]{"����","����","����","÷��"};
	final static String[] numbs = new String[]{"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

	//the cardslist will be delivered
	final static LinkedList<card> CardsList = new LinkedList<>();
	//the plyerlist in the game
	static ArrayList<player> playerList = new ArrayList<>();

	//initial the cards and shuffle them
	public void initCards()
	{
		CardsList.clear();
		//initia the cardslist
		for(int i = 0;i<4;i++)
			for(int j = 0;j<13;j++)
			{
				card c = new card(cols[i],numbs[j]);
				CardsList.add(c);
			}
		//shuffle the cards
		Collections.shuffle(CardsList);

//		for(card m:CardsList)
//		{
//			System.out.println(m.g());
//		}
	}
	//initia the players
	public void initPlayers(String[] aplayers)
	{
		playerList.clear();
		//initia the playerlist
		if(aplayers.length>MAX_PLAYER_NUM||aplayers.length<MIN_PLAYER_NUM)
		{
			System.out.println("Error occures in the initiation of players ");
			return;
		}

		else
		{
			for(int i = 0;i < aplayers.length;i++)
			{
				player p = new player(aplayers[i]);
				playerList.add(p);
			}
		}
	}

	//deliver the card form the player No. pos
	public void deliverCard(int pos)
	{
		for(int i=pos;i<(pos+playerList.size());i++)
		{
			playerList.get(i%(playerList.size())).addCards(CardsList.pop());
		}
	}


	public static void main(String[] args)
	{

		showhand sh = new showhand();
		//initia the cardlist
		sh.initCards();
		//initia the plyerlist
		String[] str = new String[]{"����","����","����","����"};
		sh.initPlayers(str);
		System.out.println(CardsList.get(0).g());
		System.out.println(CardsList.get(1).g());
		System.out.println(CardsList.get(0).compareTo(CardsList.get(1)));

		sh.deliverCard(0);
		sh.deliverCard(0);
		sh.deliverCard(0);
		sh.deliverCard(0);
		sh.deliverCard(0);
		playerList.get(0).f();

//		sh.deliverCard(1);
		playerList.get(1).f();
//
//		sh.deliverCard(2);
		playerList.get(2).f();
//
//		sh.deliverCard(3);
		playerList.get(3).f();
	}

}
