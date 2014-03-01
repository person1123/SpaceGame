package AllUnits;

import java.util.ArrayList;

import Interfaces.Carries;

public class Carrier extends SpaceUnit implements Carries
{
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
}
