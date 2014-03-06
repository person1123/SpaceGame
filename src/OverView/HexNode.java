package OverView;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Arrays;


public class HexNode {
	HexGrid grid;
	public int q, r;
	
	static int[][] neighbors = new int[][]{
	                                        {1,  0}, {1, -1}, { 0, -1},
	                                        {-1,  0}, {-1, +1}, { 0, +1}
											};
	
	public HexNode(int nq, int nr, HexGrid grd) {
		q = nq;
		r = nr;
		grid = grd;
	}
	
	//each shell has 6 more except 1st
	
	public HexNode[] adjacentNodes() {
		HexNode[] nodes = new HexNode[6];

		for(int i=0;i<neighbors.length;i++) {
			nodes[i] = grid.node(q+neighbors[i][0], r+neighbors[i][1]);
		}
		
		return nodes;
	}
	
	public void draw(Graphics g) {
//		g.setColor(new Color(q*10+30,r*10+30,100));
//		if(q==0)
//			g.setColor(new Color(255,255,0));
//		if(r==0)
//			g.setColor(new Color(0,0,255));
		
//		int y = (int)(Math.cos(2*circ*Math.PI/grid.nodesInShell(shell))*shell*50)+300;
//		int x = (int)(Math.sin(2*circ*Math.PI/grid.nodesInShell(shell))*shell*50)+300;
//		
//		int x = (int) (50 * Math.sqrt(3) * (q))+300;
//		int y = (int) (50 * (r - Math.sqrt(3)*q))+300;
		

		int x = (int) (50 * Math.sqrt(3) * (q+r/2))+300;
		int y = (int) (50 * 3/2 * (q))+300;
		
		g.fillOval(x-25,y-25,50,50);
	}
	
	public int y() {
		return -q-r;
	}
	
	public double hexDist(int oq, int or) {
		return (Math.abs(q-oq)+Math.abs(r-or)+Math.abs(y()+oq+or))/2;
	}
	
	public double hexDist(HexNode o) {
		return (Math.abs(q-o.q)+Math.abs(r-o.r)+Math.abs(y()-o.y()))/2;
	}
	
	public HexNode rotatedRight() {
		return grid.node(-r, -y());
	}
	
	public HexNode rotatedLeft() {
		return grid.node(-y(), -q);
	}
}
