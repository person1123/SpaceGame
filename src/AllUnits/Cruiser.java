package AllUnits;

import OverView.Space;

public class Cruiser extends SpaceUnit
{
	public Cruiser(Space builtAt)
	{
		mapLocation=builtAt;
		movement=2;
		power=7;
		lives=1;
	}
}
