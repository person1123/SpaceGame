package AllUnits;
import Interfaces.Carries;


public  abstract class LandUnit extends Unit
{
	public Carries unitAttachedTo;
	public boolean canGoToSpace()
	{
		return true;
	}
	public boolean onPlanet()
	{
		return true;
	}
	public boolean inSpace()
	{
		return false;
	}
}
