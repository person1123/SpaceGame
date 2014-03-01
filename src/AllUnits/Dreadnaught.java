package AllUnits;

import OverView.Space;

public class Dreadnaught extends SpaceUnit
{
	public Dreadnaught(Space builtAt)
	{
		mapLocation=builtAt;
		movement=1;
		power=5;
		lives=2;
	}
}
