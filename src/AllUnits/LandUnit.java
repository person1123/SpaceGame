package AllUnits;
import Interfaces.BattleField;
import Interfaces.Carries;
import SpaceObjects.Planet;


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
	public boolean canFight(BattleField b)
	{
		return b instanceof Planet && b==unitAttachedTo;
	}
}
