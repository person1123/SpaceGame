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
	public boolean inFight(BattleField b)
	{
		for(Unit u: units)
			if(u.canFight(b))
				return true;
		return false;
	}
	//public boolean canPopShot(Space s)
}
