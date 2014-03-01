package AllUnits;
import java.awt.image.BufferedImage;

import Interfaces.*;

import OverView.*;


public abstract class Unit
{
	public int power;
	public BufferedImage sprite;
	public boolean canFight(BattleField b)
	{
		return false;
	}
	public Player getPlayer(Game g)
	{
		for(Player p :g.players)
			for(Unit u: p.units)
				if(u==this)
					return p;
		return null;		
	}
	public boolean canPopShot(Carries C)
	{
		return false;
	}
}
