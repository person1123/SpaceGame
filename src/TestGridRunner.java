import javax.swing.JFrame;


public class TestGridRunner extends JFrame {
	
	public static void main(String[] args) {
		TestGridRunner r = new TestGridRunner();
		
		r.setVisible(true);
	}
	
	public TestGridRunner() {
		super();
		
		setContentPane(new TestGridRenderer());
		
		setSize(600,600);
	}
	
}
