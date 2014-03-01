package AllUnits;
import Interfaces.*;
import OverView.Space;
import SpaceObjects.*;


public class Fighter extends Unit 
{
	int lives;
	public Carries mapLocation;
	public Fighter(Planet builtAt)
	{
		mapLocation= (Carries)(builtAt.mapLocation);
		power=9;
		lives=1;
	}
	public boolean canFight(BattleField b)
	{
		return b instanceof Space && b==mapLocation.getLocation();
	}
}
