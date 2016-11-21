/**
 * @author Natasya Virgichalia <br>
 * date: 11/17/2016 <br>
 * contact: nvirgichalia@gmail.com <br>
 * Car class composes of the car's color, horse power, engine size, and brand <br>
 */
public class Car {
	private String Color;
	private int HorsePower;
	private double EngineSize;
	private String Brand;
	
	/**
	 * construct a new Car with color = white, horse power = 500, engine size = 4.5, brand = BMW.
	 * method that initialize the value of the attributes.
	 */
	public Car() {
		Color = "White";
		HorsePower = 500;
		EngineSize = 4.5;
		Brand = "BMW";
	}
	/**
	 * construct a new with the values provided from color, horse power, engine size, and brand  parameters.
	 * @param Color of the car
	 * @param HorsePower of the car
	 * @param EngineSize of the car
	 * @param Brand of the car
	 */
	public Car(String Color, int HorsePower, double EngineSize, String Brand) {
		this.Color = Color;
		this.HorsePower = HorsePower;
		this.EngineSize = EngineSize;
		this.Brand = Brand;
	}
	/**
	 * setter method to set the color of a car according to the color parameter.
	 * @param Color
	 */
	public void setColor(String Color) {
		this.Color = Color;
	}
	/**
	 * setter method to set the horse power of a car according to the horse power parameter.
	 * @param HorsePower
	 */
	public void setHorsePower(int HorsePower) {
		this.HorsePower = HorsePower;
	}
	/**
	 * setter method to set the engine size of a car according to the engine size parameter.
	 * @param EngineSize
	 */
	public void setEngineSize(double EngineSize) {
		this.EngineSize = EngineSize;
	}
	/**
	 * setter method to set the brand of a car according to the brand parameter.
	 * @param Brand
	 */
	public void setBrand(String Brand) {
		this.Brand = Brand;
	}
	/**
	 * getter method to get a car's color.
	 * @return the color of a car.
	 */
	public String getColor() {
		return Color;
	}
	/**
	 * getter method to get a car's horse power.
	 * @return the horse power of a car.
	 */
	public int getHorsePower() {
		return HorsePower;
	}
	/**
	 * getter method to get a car's engine size.
	 * @return the engine size of a car.
	 */
	public double getEngineSize() {
		return EngineSize;
	}
	/**
	 * getter method to get a car's brand.
	 * @return the brand of a car.
	 */
	public String getBrand() {
		return Brand;
	}
	/**
	 * return the color, horse power, engine size, and brand of a car.
	 */
	public String toString() {
		return  this.Brand + ", " + this.Color + ", " + this.HorsePower + ", " + this.EngineSize;
	}
}
