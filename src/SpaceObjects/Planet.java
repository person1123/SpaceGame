package SpaceObjects;
import AllUnits.LandUnit;
import AllUnits.PDS;
import Interfaces.*;
import OverView.*;


public class Planet extends SpaceObject implements Carries, BattleField
{

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
			
		}
		
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void battle(Game g) {
		// TODO Auto-generated method stub
		
	}

	
}
