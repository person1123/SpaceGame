package AllUnits;
import java.util.ArrayList;

import Interfaces.Carries;
import SpaceObjects.*;


public class SpaceDock extends LandUnit implements Carries
{
	int carrierCost=3, cruiserCost=2, destroyerCost=1, dreadnaughtCost=5, fighterCost=1, groundForceCost=1, pdsCost=2, warSunCost=12;
	public SpaceDock(Planet builtAt)
	{
		power=0;
		unitAttachedTo=builtAt;	
	}

	@ Override
	public int getCapacity(Class type)
	{
		// TODO Auto-generated method stub
		if(type==Fighter.class)
			return 3;
		return 0;
	}

	@Override
	public ArrayList<Unit> getUnits() {
		// TODO Auto-generated method stub
		return null;
	}
}
