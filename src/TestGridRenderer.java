import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import OverView.HexGrid;
import OverView.HexNode;


public class TestGridRenderer extends JPanel {
	HexGrid grid;
	
	int fc = 0;
	
	public TestGridRenderer() {
		grid = new HexGrid(3);
		
		for(int i=0;i<grid.nodes.length;i++) {
			grid.nodes[i] = new HexNode(i,grid);
		}
		
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
		
		HexNode[] adjacents = grid.nodes[target].adjacentNodes();
		
		for(int i=0;i<grid.nodes.length;i++) {
			g.setColor(new Color(255,150,255));
			for(int j=0;j<adjacents.length;j++) {
				if(grid.nodes[i]==adjacents[j]) {
					g.setColor(new Color(255,0,0));
				}
			}
			
			if(target==i) {
				g.setColor(new Color(255,255,0));
				System.out.println("current spot: "+i);
			}
			
			grid.nodes[i].draw(g);
		}
	}
	
}
