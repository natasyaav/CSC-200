import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Border extends JFrame {
	public Border() {
		BorderLayout borderLayout = new BorderLayout();
		JPanel panel = new JPanel(borderLayout);
		JTextField textField1 = new JTextField("BorderLayout 1");
		JTextField textField2 = new JTextField("BorderLayout 2");
		JTextField textField3 = new JTextField("BorderLayout 3");
		JTextField textField4 = new JTextField("BorderLayout 4");
		JTextField textField5 = new JTextField("BorderLayout 5");
		panel.add(textField1, BorderLayout.NORTH);
		panel.add(textField2, BorderLayout.WEST);
		panel.add(textField3, BorderLayout.CENTER);
		panel.add(textField4, BorderLayout.EAST);
		panel.add(textField5, BorderLayout.SOUTH);
		add(panel);
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Border();
	}
}
