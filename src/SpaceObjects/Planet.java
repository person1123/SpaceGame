package SpaceObjects;
import java.util.ArrayList;

import AllUnits.LandUnit;
import AllUnits.PDS;
import AllUnits.SpaceDock;
import AllUnits.Unit;
import Interfaces.*;
import OverView.*;


public class Planet extends SpaceObject implements Carries, BattleField
{
	public Player controlledBy;
	public Planet(Space exists)
	{
		mapLocation=exists;
	}
	@ Override
	public int getCapacity(Class type)
	{
		if(type==LandUnit.class) {
			return Integer.MAX_VALUE;
		} else if(type==PDS.class) {
			return 2;
		}
		else if(type==SpaceDock.class)
			return 1;
		
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void battle(Game g) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ArrayList<Unit> getUnits() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Space getLocation() {
		// TODO Auto-generated method stub
		return mapLocation;
	}

	
}
