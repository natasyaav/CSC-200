/**
 * @author Natasya Virgichalia
 * date 11/30/2016
 * contact nvirgichalia@gmail.com
 * purpose to make a Calculator class that calculates the sum, average, and product of numbers with different data types
 */

public class Calculator {
/**
 * Calculate the sum with double data type
 * @param num an array of numbers with double data type
 * @return the sum of the numbers with double data type
 */
public static double getSum(double [] num) {
	double sum=0;
	for(int i=0; i<num.length; i++) {
		sum+=num[i];
	}
	return sum;
}
/**
 * Calculate the sum with String data type
 * @param num an array of numbers with string data type
 * @return the sum of the numbers with string data type
 */
public static double getSum(String [] num) {
	double [] doubleNum = new double[num.length];
	for (int i=0; i<num.length; i++) {
		doubleNum[i] = Double.parseDouble(num[i]);	
	}
	return getSum(doubleNum);
}
/**
 * Calculate the average with double data type
 * @param num an array of numbers with double data type
 * @return the average of numbers with double data type
 */
public static double getAverage(double [] num) {
	double sum=0.0;
	for(int i=0; i<num.length; i++) {
		sum+=num[i];
	}
	return(sum/num.length);
}
/**
 * Calculate the average with String data type
 * @param num an array of numbers with String data type
 * @return the average of numbers with String data tyoe
 */
public static double getAverage(String [] num) {
	double [] doubleNum = new double[num.length];
	for (int i=0; i<num.length; i++) {
		doubleNum[i] = Double.parseDouble(num[i]);
	}
	return(getSum(doubleNum)/num.length);
}
/**
 * Calculate the product with double data type
 * @param num an array of numbers with double data type
 * @return the product of the numbers with double data type
 */
public static double getProduct(double [] num) {
	double product = 1;
	for(int i=0; i<num.length; i++) {
		product = product*num[i];
	}
	return product;
}
/**
 * Calculate the product with String data type
 * @param num an array of numbers with String data type
 * @return the product of the numbers with String data type
 */
public static double getProduct(String [] num) {
	double product = 1;
	double [] doubleNum = new double[num.length];
	for (int i=0; i<num.length; i++) {
		doubleNum[i] = Double.parseDouble(num[i]);
	}
	return getSum(doubleNum)*product;
	}
}

