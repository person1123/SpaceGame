package AllUnits;

import java.util.ArrayList;

import Interfaces.Carries;
import OverView.Space;

public class Carrier extends SpaceUnit implements Carries
{
	public Carrier(Space builtAt)
	{
		mapLocation=builtAt;
		movement=1;
		power=9;
		lives=1;
	}
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
