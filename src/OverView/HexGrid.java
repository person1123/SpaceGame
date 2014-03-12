package OverView;

public class HexGrid {

	public HexNode[][] nodes;
	int shells;
	
	public HexGrid(int sh) {
		shells = sh;
		nodes = new HexNode[2*(shells-1)+1][2*(shells-1)+1];
		
//		System.out.println(nodesUpToShell(shells));
	}

	public HexNode node(int q, int r) {
		if(q+shells-1<0 || q+shells-1>nodes.length
				|| r+shells-1<0 || r+shells-1>nodes[0].length)
			return null;
		return nodes[q+shells-1][r+shells-1];
	}
	
	public void fillRing(int rad, HexNode[] nodes) {
		
	}
	
	public HexNode[] ring(int rad) {
		if(rad == 0) {
			return new HexNode[]{node(0,0)};
		}
		
		HexNode[] results = new HexNode[6*rad];
		
		HexNode h = node(-rad,rad);
		
		int ct = 0;
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<rad;j++) {
				results[ct] = h;
//				System.out.println(h);
//				HexNode[] adj = h.adjacentNodes();
//				for(int k=0;k<6;k++) {
//					System.out.print(adj[k]+", ");
//				}
//				System.out.println();
				h = h.adjacentNodes()[i];
				
				ct++;
			}
		}
		
		return results;
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
