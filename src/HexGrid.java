
public class HexGrid {

	public HexNode[] nodes;
	
	public HexNode node(int shell, int circ) {
		//mod circ so it wraps wheee
		
		int loc = 0;
		for(int i=0;i<shell;i++) {
			loc += nodesInShell(i);
		}
		
		loc+=circ % nodesInShell(shell);
		
		if(loc<nodes.length)
			return nodes[loc];
		return null;
	}
	
	public int nodesInShell(int shell) {
		if(shell==0)
			return 1;
		return 6*shell;
	}
}
