package OverView;

public class HexGrid {

	public HexNode[][] nodes;
	int shells;
	
	public HexGrid(int sh) {
		shells = sh;
		nodes = new HexNode[2*(shells-1)][2*(shells-1)];
		
//		System.out.println(nodesUpToShell(shells));
	}

	public HexNode node(int q, int r) {
		if(q+shells-1<0 || q+shells-1>nodes.length
				|| r+shells-1<0 || r+shells-1>nodes[0].length)
			return null;
		System.out.println("q: "+q+" r: "+r);
		return nodes[q+shells-1][r+shells-1];
		/*//mod circ so it wraps wheee
		
		int loc = nodesUpToShell(shell);
		
		System.out.println("loc: "+loc);
		
		loc+=circ % nodesInShell(shell);
		
		if(circ % nodesInShell(shell)<0) {
			loc+=nodesInShell(shell);
		}
		
		if(loc<nodes.length)
			return nodes[loc];
		return null;*/
	}
	
	public HexNode[] ring(int rad) {
		HexNode[] results = new HexNode[6*rad];
		
		HexNode h = node(rad,0);
		
		int ct = 0;
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<rad;j++) {
				results[ct] = h;
				h = h.adjacentNodes()[i];
			}
		}
	}
	
	public int nodesUpToShell(int shell) {
		int spaces = 0;
		for(int i=0;i<shell;i++) {
			spaces += nodesInShell(i);
		}
		
		return spaces;
	}
	
	public int nodesInShell(int shell) {
		if(shell==0)
			return 1;
		return 6*shell;
	}
}
