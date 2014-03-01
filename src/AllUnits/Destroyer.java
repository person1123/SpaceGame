package AllUnits;
import OverView.Space;


public class Destroyer extends SpaceUnit
{
	public Destroyer(Space builtAt)
	{
		mapLocation=builtAt;
		movement=2;
		power=9;
		lives=1;
	}
}
