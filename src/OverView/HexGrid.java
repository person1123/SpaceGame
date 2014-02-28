package OverView;

public class HexGrid {

	public HexNode[] nodes;
	
	public HexGrid(int shells) {
		nodes = new HexNode[nodesUpToShell(shells)];
	}

	public HexNode node(int shell, int circ) {
		//mod circ so it wraps wheee
		
		int loc = nodesUpToShell(shell);
		
		System.out.println("loc: "+loc);
		
		loc+=circ % nodesInShell(shell);
		
		if(circ % nodesInShell(shell)<0) {
			loc+=nodesInShell(shell);
		}
		
		if(loc<nodes.length)
			return nodes[loc];
		return null;
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
