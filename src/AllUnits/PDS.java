package AllUnits;
import Interfaces.*;
import OverView.*;
import SpaceObjects.*;


public class PDS extends LandUnit
{
	public PDS(Planet builtAt)
	{
		power=6;
		unitAttachedTo=builtAt;	
		
	}
	public boolean canFight()
	{
		return false;
	}
	public boolean canPopShot(Carries c)
	{
		boolean a = (unitAttachedTo instanceof Planet),
				b = (c instanceof Space),
				d = ((Space)c).objects.contains(unitAttachedTo);
		
		
		return a &&
				b &&
				d;
	}
	
}
