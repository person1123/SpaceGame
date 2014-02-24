import java.awt.Graphics;
import java.util.Arrays;


public class HexNode {
	HexGrid grid;
	public int shell, circ, number;
	
	//each shell has 6 more except 1st
	
	public HexNode[] adjacentNodes() {
		if(shell==0) {
			return Arrays.copyOfRange(grid.nodes,0,6);
		}
		
		HexNode[] nodes = new HexNode[6];
		
		//same row
		nodes[0] = grid.node(shell,circ-1);
		nodes[1] = grid.node(shell,circ-1);
		
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
		int y = (int)(Math.cos(circ*1.0/grid.nodesInShell(shell))*shell*50);
		int x = (int)(Math.sin(circ*1.0/grid.nodesInShell(shell))*shell*50);
		
		g.drawOval(x-25,y-25,50,50);
	}
}
