import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import OverView.HexGrid;
import OverView.HexNode;


public class TestGridRenderer extends JPanel {
	HexGrid grid;
	
	int fc = 0;
	
	public TestGridRenderer() {
		grid = new HexGrid(4);
		
		int rad = 1;
		int ct = 0;
		for(int i=-rad;i<=rad;i++) {
			for(int j=-rad;j<=rad;j++) {
				grid.nodes[i+3][j+3] = new HexNode(i,j,grid);
				if(grid.nodes[i+3][j+3].hexDist(0,0)>rad) {
					System.out.println("not in "+i+", "+j+"'s house");
					System.out.println("dist: "+grid.nodes[i+3][j+3].hexDist(0,0));
					grid.nodes[i+3][j+3]=null;
				} else {
					System.out.println("in "+i+", "+j+"'s house");
				}
				
				ct++;
			}
		}
		System.out.println(ct);
		
		Thread t = new Thread(new Runnable(){

			@Override
			public void run() {
				while(true) {
					
					try {
						Thread.sleep(1000/30);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					repaint();
				
				}
			}
			
		});
		
		t.start();
	}
	
	public void paint(Graphics g) {
		fc++;
		
		int target = (fc/100)%grid.nodes.length;
		
		HexNode[] adjacents=null;
		if(grid.nodes[target][target]!=null)
			adjacents = grid.nodes[target][target].adjacentNodes();
		
		for(int i=0;i<grid.nodes.length;i++) {
			for(int k=0;k<grid.nodes[i].length;k++) {
				g.setColor(new Color(255,150,255));
				
				if(adjacents!=null) {
					for(int j=0;j<adjacents.length;j++) {
						if(grid.nodes[i][k]==adjacents[j]) {
							g.setColor(new Color(255,0,0));
						}
					}
				}
				
				if(target==i-3 && target==k-3) {
					g.setColor(new Color(255,255,0));
					System.out.println("current spot: "+i);
				}
				
				if(grid.nodes[i][k]!=null) {
					grid.nodes[i][k].draw(g);
				}
			}
		}
	}
	
}
