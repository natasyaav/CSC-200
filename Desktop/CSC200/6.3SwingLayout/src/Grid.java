import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Grid extends JFrame {
	public Grid() {
		GridLayout gridLayout = new GridLayout(2,2);
		JPanel panel = new JPanel(gridLayout);
		JTextField [] textField = new JTextField[4];
		for(int i=0;i<textField.length; i++) {
			textField[i] = new JTextField("Grid Layout " + (i+1));
			panel.add(textField[i]);
		}
		add(panel);
		setSize(500,200);
		setVisible(true);	
	}
	public static void main(String[] args) {
		new Grid();
	}

}
