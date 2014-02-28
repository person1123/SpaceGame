package AllUnits;
import Interfaces.Carries;
import SpaceObjects.*;


public class SpaceDock extends LandUnit implements Carries
{
	public SpaceDock(Planet builtAt)
	{
		power=0;
		cost=4;
		unitAttachedTo=builtAt;	
	}

	@ Override
	public int getCapacity(Class type)
	{
		// TODO Auto-generated method stub
		return 0;
	}
}
