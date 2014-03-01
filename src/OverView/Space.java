package OverView;
import java.util.ArrayList;

import AllUnits.SpaceUnit;
import AllUnits.Unit;
import Interfaces.BattleField;
import Interfaces.Carries;
import SpaceObjects.SpaceObject;


public class Space extends HexNode implements Carries,  BattleField
{
	public Space(int num, HexGrid grd) 
	{
		super(num, grd);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<SpaceObject> objects=new ArrayList<SpaceObject>();
	public ArrayList<SpaceUnit> ships;
	public int getCapacity(Class type) 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void battle(Game g) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Unit> getUnits() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
