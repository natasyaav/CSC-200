/**
 * @author Natasya Virgichalia <br>
 * date 11/17/2016 <br>
 * contact nvirgichalia@gmail.com <br>
 * purpose of the program is to use Car class
 *
 */
public class CarDriver {
	public static void main(String [] args) {
		Car myCar = new Car();
		System.out.println("My car:" + myCar);
		myCar.setColor("Blue");
		myCar.setHorsePower(650);
		myCar.setEngineSize(6.5);
		myCar.setBrand("Ferrari");
		System.out.println("My new car:" + myCar.getBrand()+ ", " + myCar.getColor() + ", " + myCar.getHorsePower() + ", " + myCar.getEngineSize());
		
		Car hisCar = new Car("Black", 400, 3.5, "Honda");
		System.out.println("His car:" + hisCar);
		hisCar.setColor("Blue");
		hisCar.setHorsePower(650);
		hisCar.setEngineSize(6.5);
		hisCar.setBrand("Ferrari");
		System.out.println("His new car:"+ hisCar.getBrand() + ", " + hisCar.getColor() + ", " + hisCar.getHorsePower() + ", " + hisCar.getEngineSize());
		
		Car herCar = new Car("Pink", 300, 2.5, "Volks");
		System.out.println("Her car:" + herCar);
		herCar.setColor("Blue");
		herCar.setHorsePower(650);
		herCar.setEngineSize(6.5);
		herCar.setBrand("Ferrari");
		System.out.println("Her new car:"+ herCar.getBrand() + ", " + herCar.getColor() + ", " + herCar.getHorsePower() + ", " + herCar.getEngineSize() + ", ");
	}

}
