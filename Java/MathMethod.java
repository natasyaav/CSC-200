import javax.swing.JOptionPane;

public class MathMethod {
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Please enter a number for x");
        	int x = Integer.parseInt(input1);
        	String input2 = JOptionPane.showInputDialog("Please enter a number for y");
		int y = Integer.parseInt(input2);
        	String input3 = JOptionPane.showInputDialog("Please enter a number z");
        	int z = Integer.parseInt(input3);

		JOptionPane.showMessageDialog(null, "h(x) equals " + h(x));
		JOptionPane.showMessageDialog(null, "f(x,y) equals " + f(x,y));
		JOptionPane.showMessageDialog(null, "g(x,y,z) equals " + g(x,y,z));
	}
	//h(x) = x^10
	public static int h(int x) {
		int i = 1;
		int product = x;
		while(i<10) {
			product = product*x;
			i++;
		}
		return product;
	}
	//f(x,y) = x+y
	public static int f(int x, int y) {
		return x+y;
	}
	//g(x,y,z) = squrt(x) + absolute(y) + z^y
	public static double g(double x, int y, int z) {
		return Squrt(x) + absolute(y) + Power(z,y);
	}
	//absolute
	public static int absolute(int y) {
		return (y>0)?y:(-1*y);
	}
	//power to
	public static int Power(int z, int y) {
		int result = 1;
		if (y==0) {
			result = 1;
		}
		if (y<0) {
			z = (1/z);
			y = -y;
		}
		for (int i = 0; i<y; i++) {
			result = result*z;
		}
			return result;
	}
	//square root
	public static double Squrt(double x) {
		double t;
		double result = 0;
		if (x==0) {
			result = 0;
		}
		else if(x<0) {
			x = -x;
		}
		double SquareRoot = x/2;
			do {
				t = SquareRoot;
				SquareRoot = (t + (x/t))/2;
			} while ((t - SquareRoot)!=0);
			if(x>=0) {
				result = SquareRoot;
			}
			return result;
	}
	
}

