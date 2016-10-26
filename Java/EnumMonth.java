import javax.swing.JOptionPane;

public class EnumMonth { 
	public enum MonthType {January, February, March, April, May, June, July, August, September, October, November, December}
	public static void main(String[] args) { 
		
	   MonthType[] choices = { MonthType.January, MonthType.February, MonthType.March, MonthType.April, MonthType.May, MonthType.June, MonthType.July, MonthType.August, MonthType.September, MonthType.October, MonthType.November, MonthType.December};
	   MonthType input = (MonthType) JOptionPane.showInputDialog(null,"Please select a month", "Month Message", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[7]); 
	   while (input!=null) { 
		   switch (input) {
     			case January:
     				JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");
     				break;
     			case February:
     				JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");
     				break;
     			case March:
     				JOptionPane.showMessageDialog(null, "Happy Spring days!");
     				break;
     			case April:
     				JOptionPane.showMessageDialog(null, "Happy Spring days!");
     				break;
     			case May:
     				JOptionPane.showMessageDialog(null, "Happy Spring days!");
     				break;
     			case June:
     				JOptionPane.showMessageDialog(null, "It's summer time!");
     				break;
     			case July:
     				JOptionPane.showMessageDialog(null, "It's summer time!");
     				break;
     			case August:
     				JOptionPane.showMessageDialog(null, "It's summer time!");
     				break;
     			case September:
     				JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
     				break;
     			case October:
     				JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
     				break;
     			case November:
     				JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
     				break;
     			case December:
     				JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");
     				break;
		   	}
            input = (MonthType) JOptionPane.showInputDialog(null,"Please select a month", "Month Message", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[7]);  
	   }
	   JOptionPane.showMessageDialog(null, "Goodbye!");
   }
}
