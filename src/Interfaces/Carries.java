package Interfaces;

import java.util.ArrayList;

import AllUnits.*;
import OverView.Space;
public interface Carries
{
	public int getCapacity(Class type);
	public ArrayList<Unit> getUnits();
	public Space getLocation();
}
