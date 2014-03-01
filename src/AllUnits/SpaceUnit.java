package AllUnits;
import Interfaces.BattleField;
import OverView.Space;


public abstract class SpaceUnit extends Unit
{
	public int movement;
	//public HexNode location
	public int lives;
	public Space mapLocation;
	public boolean canMove(Space s)//calculates if a unit can move to a space hex based on its movement and hex adjacencies
	{
		return false;//does not need to be overrided for space units, just use variable movement
	}
	public boolean canFight(BattleField b)
	{
		return b instanceof Space && b==mapLocation;
	}
}
