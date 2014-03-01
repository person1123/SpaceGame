package AllUnits;
import SpaceObjects.*;


public class GroundForce extends LandUnit
{
	public GroundForce(Planet builtAt)
	{
		power=8;
		unitAttachedTo=builtAt;	
	}
	public boolean canFight()
	{
		return unitAttachedTo instanceof Planet;
	}
}
