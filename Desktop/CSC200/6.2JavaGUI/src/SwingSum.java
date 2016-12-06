import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingSum extends JFrame {
	
	public SwingSum() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel ("Enter numbers to calculate the sum");
		JLabel output = new JLabel();
		output.setText("----");
		JTextField num1 = new JTextField(20);
		JTextField num2 = new JTextField(20);
		
		JButton button = new JButton("Find Sum");
		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
			double data1 = Double.parseDouble(num1.getText());
			double data2 = Double.parseDouble(num2.getText());
			double sum = data1+data2;
			output.setText(String.valueOf(sum));
		}
		});
		
		panel.add(label);
		panel.add(num1);
		panel.add(num2);
		panel.add(button);
		panel.add(output);
		add(panel); 
		setVisible(true);
		setSize(300,200);
	}
	public static void main(String[] args) {
		new SwingSum();
	}
}
