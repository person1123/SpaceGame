package OverView;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Arrays;


public class HexNode {
	HexGrid grid;
	public int shell, circ, number;
	
	public HexNode(int shll, int crc, HexGrid grd) {
		shell = shll;
		circ = crc;
		grid = grd;
		
		number = grid.nodesUpToShell(shell-1)+circ;
	}
	
	public HexNode(int num, HexGrid grd) {
		grid = grd;
		number = num;
		
		int shll = 0;
		
		while(number>=grid.nodesUpToShell(shll)) {
			shll++;
		}
		
		shll--;
		
		shell = shll;
		circ = number-grid.nodesUpToShell(shll);
	}
	
	//each shell has 6 more except 1st
	
	public HexNode[] adjacentNodes() {
		if(shell==0) {
			return Arrays.copyOfRange(grid.nodes,1,7);
		}
		
		HexNode[] nodes = new HexNode[6];
		
//		//same row
		nodes[0] = grid.node(shell,circ-1);
		nodes[1] = grid.node(shell,circ+1);
		System.out.println("first: "+shell+", "+(circ-1));
		System.out.println("second: "+shell+", "+(circ+1));
		

//		nodes[1] = grid.node(shell,5);
		
		if(circ%2==0) {
			//previous row
			nodes[2] = grid.node(shell-1,circ/2);
			
			//next row
			nodes[3] = grid.node(shell+1,circ/2*3-1);
			nodes[4] = grid.node(shell+1,circ/2*3);
			nodes[5] = grid.node(shell+1,circ/2*3+1);
		} else {
			//previous row
			nodes[2] = grid.node(shell-1,circ/2);
			nodes[3] = grid.node(shell-1,circ/2+1);
			
			//next row
			nodes[4] = grid.node(shell+1,circ*3-2);
			nodes[4] = grid.node(shell+1,circ*3-1);
		}
		
		return nodes;
	}
	
	public void draw(Graphics g) {
//		g.setColor(new Color(shell,(int)(circ*255.0/grid.nodesInShell(shell)),100));
		
		int y = (int)(Math.cos(2*circ*Math.PI/grid.nodesInShell(shell))*shell*50)+300;
		int x = (int)(Math.sin(2*circ*Math.PI/grid.nodesInShell(shell))*shell*50)+300;
		
		g.fillOval(x-25,y-25,50,50);
	}
}
