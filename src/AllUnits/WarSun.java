package AllUnits;

import java.util.ArrayList;

import Interfaces.Carries;
import OverView.Space;

public class WarSun extends SpaceUnit implements Carries
{
	public WarSun(Space builtAt)
	{
		mapLocation=builtAt;
		movement=2;
		power=3;
		lives=2;
	}
	@Override
	public int getCapacity(Class type) {
		if(type==GroundForce.class||type==Fighter.class||type==PDS.class)
			return 6;
		return 0;
	}

	@Override
	public ArrayList<Unit> getUnits() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Space getLocation() {
		// TODO Auto-generated method stub
		return mapLocation;
	}

}
