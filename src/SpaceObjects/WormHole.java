package SpaceObjects;

import java.util.ArrayList;

import OverView.*;

public class WormHole extends SpaceObject
{
	/*public Space getLocation(Game g)
	{
		for(Space s: g.hexes)
			for(SpaceObject so: s.objects)
				if(so instanceof WormHole && so==this)
					return s;
		return null;
	}*/
	public ArrayList<WormHole> counterparts;
}
