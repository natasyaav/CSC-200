import javax.swing.JOptionPane;

public class SwitchRole {
	public static void main(String[] args) {
		String[] choices = {"Administrator","Faulty","Staff","Student","Guest"};
		String userRole = (String) JOptionPane.showInputDialog(null, "Please choose a role", "Pick your Role", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
			int input = 0;
			switch (input) {
			case 1: userRole = "Administrator";
					break;
			case 2: userRole = "Faculty";
					break;
			case 3: userRole = "Staff";
					break;
			case 4: userRole = "Student";
					break;
			case 5: userRole = "Guest";
					break;
			}
		JOptionPane.showMessageDialog(null,"Welcome " + userRole + "!");
}
}


