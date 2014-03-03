package OverView;
import java.util.ArrayList;

import GameCards.ObjectiveCard;
import GameCards.PoliticalCard;


public class Game
{
	public ArrayList<Player> players;
	public ArrayList<Space> hexes;
	public ArrayList<ObjectiveCard> avalibleObjectives;
	public ArrayList<PoliticalCard> laws;
	public Player speaker;
	public static void main(String[]args)
	{
		new Game();
		
	}
	public Game()
	{
		setUp();
		while(checkWin())
		{
			chooseStretegys();
			while(checkWin()&&!allPassed())
				actions();
			status();
		}
	}
	public void setUp()
	{
		
	}
	public void chooseStretegys()
	{
		Player current=speaker;
		if(players.size()<5)
			while(allPlayersHaveStrategy())
			{
				current.chooseStrategy();
				current=nextPlayer(current);
			}
		else
			while(allPlayersHaveTwoStrategy())
			{
				current.chooseStrategy();
				current=nextPlayer(current);
			}
				
	}
	public void actions()
	{
		Player current=getStarter();
		while(!allPassed())
		{
			current.actionPhase();
			current=nextPlayer(current);
		}
	}
	public void status()
	{
		
	}
	public boolean checkWin()//returns true if no one has won
	{
		return true;
	}
	public boolean allPassed()
	{
		for(Player p: players)
			if(p.passed)
				return false;
		return true;
	}
	public Player nextPlayer(Player p)
	{
		return p;
	}
	public boolean allPlayersHaveStrategy()
	{
		return false;
	}
	public boolean allPlayersHaveTwoStrategy()
	{
		return false;
	}
	public Player getStarter()
	{
		return players.get(0);
	}

}
