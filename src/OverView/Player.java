package OverView;
import java.util.ArrayList;

import AllUnits.*;
import Interfaces.*;
import SpaceObjects.*;
public class Player
{
	public ArrayList<Unit> units;
	public int stratigicAlocation;
	public int fleetAlocation;
	public int commandAlocation;
	public ArrayList<ActionCard> actionCards;
	public SecretObjective secretObjectiveCard;
	public StrategyCard strategy;
	public boolean inFight(BattleField b)
	{
		for(Unit u: units)
			if(u.canFight(b))
				return true;
		return false;
	}
	public ArrayList<Unit> unitsInFight(BattleField b)
	{
		ArrayList<Unit> inFight=new ArrayList<Unit>();
		for(Unit u: units)
			if(u.canFight(b))
				inFight.add(u);
		return inFight;
	}
	//public boolean canPopShot(Space s)
}
