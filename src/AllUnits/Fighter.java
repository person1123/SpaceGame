package AllUnits;
import Interfaces.*;
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
}
