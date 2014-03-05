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
		
		int ct = 0;
		for(int i=-3;i<3;i++) {
			for(int j=-3;j<3;j++) {
				grid.nodes[i+3][j+3] = new HexNode(i,j,grid);
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
		
		HexNode[] adjacents = grid.nodes[target][target].adjacentNodes();
		
		for(int i=0;i<grid.nodes.length;i++) {
			for(int k=0;k<grid.nodes[i].length;k++) {
				g.setColor(new Color(255,150,255));
				for(int j=0;j<adjacents.length;j++) {
					if(grid.nodes[i][k]==adjacents[j]) {
						g.setColor(new Color(255,0,0));
					}
				}
				
				if(target==i && target==k) {
					g.setColor(new Color(255,255,0));
					System.out.println("current spot: "+i);
				}
				
				grid.nodes[i][k].draw(g);
			}
		}
	}
	
}
