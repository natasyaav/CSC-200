import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Flow extends JFrame {
	public Flow() {
		FlowLayout flowLayout = new FlowLayout();
		JPanel panel = new JPanel(flowLayout);
		JTextField [] textField = new JTextField[4];
		for(int i=0;i<textField.length; i++) {
			textField[i] = new JTextField("Flow Layout " +(i+1));
			panel.add(textField[i]);
		}
		add(panel);
		setSize(500,200);
		setVisible(true);
	}	
		public static void main(String[] args) {
		new Flow();
	}
}
