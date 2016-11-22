
public class Car {
	private String Color;
	private int HorsePower;
	private double EngineSize;
	private String Brand;
	private static int count=0;
	
	public Car() {
		this("White", 500, 4.5, "BMW");
	}
	public Car(String Color, int HorsePower, double EngineSize, String Brand) {
		this.Color = Color;
		this.HorsePower = HorsePower;
		this.EngineSize = EngineSize;
		this.Brand = Brand;
		count++;
	}
	public void setColor(String Color) {
		this.Color = Color;
	}
	public void setHorsePower(int HorsePower) {
		this.HorsePower = HorsePower;
	}
	public void setEngineSize(double EngineSize) {
		this.EngineSize = EngineSize;
	}
	public void setBrand(String Brand) {
		this.Brand = Brand;
	}
	public String getColor() {
		return Color;
	}
	public int getHorsePower() {
		return HorsePower;
	}
	public double getEngineSize() {
		return EngineSize;
	}
	public String getBrand() {
		return Brand;
	}
	public static int getCount() {
		return count;
	}
	public boolean equals(Car car) {
		return this.Color.equals(car.Color) && this.HorsePower == car.HorsePower && this.EngineSize == car.EngineSize && this.Brand.equals(car.Brand);
	}
	public String toString() {
		return  this.Brand + ", " + this.Color + ", " + this.HorsePower + ", " + this.EngineSize;
	}
}
