/**
 * 
 * @author Natasya Virgichalia <br>
 * date 11/30/2016 <br>
 * contact nvirgichalia@gmail.com <br>
 * purpose to use the Calculator class
 */

public class Driver {
	public static void main(String[] args) {
		double [] num = new double [4];
		num [0] = 5.0;
		num [1] = 6.0;
		num [2] = 10.0;
		num [3] = 2.0;
		System.out.println("The sum of num is  " + Calculator.getSum(num));
		System.out.println("The average of num is " + Calculator.getAverage(num));
		System.out.println("The product num is  " + Calculator.getProduct(num));
	
	}
	
}
