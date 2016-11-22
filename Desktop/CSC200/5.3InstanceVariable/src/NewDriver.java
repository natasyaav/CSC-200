import javax.swing.JOptionPane;

public class NewDriver {
	public static void main(String [] args) {
		String Brand = JOptionPane.showInputDialog(null, "Enter the brand of Natasya's car");
		String Color = JOptionPane.showInputDialog(null, "Enter a color for Natasya's car");
		String horsePower = JOptionPane.showInputDialog(null, "Enter the horse power of Natasya's car");
		int HorsePower = Integer.parseInt(horsePower);
		String engineSize = JOptionPane.showInputDialog(null, "Enter the engine size of Natasya's car");
		double EngineSize = Double.parseDouble(engineSize);
		
		Car natasyaCar = new Car(Color, HorsePower, EngineSize, Brand);
		JOptionPane.showMessageDialog(null, "Natasya's car: " + natasyaCar);
		
		String Brand1 = JOptionPane.showInputDialog(null, "Enter the brand of Ryan's car");
		String Color1 = JOptionPane.showInputDialog(null, "Enter a color for Ryan's car");
		String horsePower1 = JOptionPane.showInputDialog(null, "Enter the horse power of Ryan's car");
		int HorsePower1 = Integer.parseInt(horsePower1);
		String engineSize1 = JOptionPane.showInputDialog(null, "Enter the engine size of Ryan's car");
		double EngineSize1 = Double.parseDouble(engineSize1);
		
		Car ryanCar = new Car(Color1, HorsePower1, EngineSize1, Brand1);
		JOptionPane.showMessageDialog(null, "Ryan's car: " + ryanCar);
		
		String Brand2 = JOptionPane.showInputDialog(null, "Enter the brand of Angel's car");
		String Color2 = JOptionPane.showInputDialog(null, "Enter a color for Angel's car");
		String horsePower2 = JOptionPane.showInputDialog(null, "Enter the horse power of Angel's car");
		int HorsePower2 = Integer.parseInt(horsePower2);
		String engineSize2 = JOptionPane.showInputDialog(null, "Enter the engine size of Angel's car");
		double EngineSize2 = Double.parseDouble(engineSize2);
		
		Car angelCar = new Car(Color2, HorsePower2, EngineSize2, Brand2);
		JOptionPane.showMessageDialog(null, "Her car: " + angelCar);
		
		String Brand3 = JOptionPane.showInputDialog(null, "Enter the brand of Toms's car");
		String Color3 = JOptionPane.showInputDialog(null, "Enter a color for Toms's car");
		String horsePower3 = JOptionPane.showInputDialog(null, "Enter the horse power of Tom's car");
		int HorsePower3 = Integer.parseInt(horsePower3);
		String engineSize3 = JOptionPane.showInputDialog(null, "Enter the engine size of Tom's car");
		double EngineSize3 = Double.parseDouble(engineSize3);
		
		Car tomCar = new Car(Color3, HorsePower3, EngineSize3, Brand3);
		JOptionPane.showMessageDialog(null, "Her car: " + tomCar);
		
		JOptionPane.showMessageDialog(null, "Number of cars: " + Car.getCount());
		JOptionPane.showMessageDialog(null, "Is Angel's car the same as Tom's car? " + angelCar.equals(tomCar));
		
	}
}
