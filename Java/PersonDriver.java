/**
 * @author Natasya Virgichalia<br>
 * date: 11/14/2016<br>
 * contact: nvirgichalia@gmail.com<br>
 * purpose: to use Person class and compare the first and second driver<br>
 */
public class PersonDriver {
	public static void main(String [] args) {
		Person firstDriver = new Person();
		System.out.println("default " + firstDriver);
		firstDriver.setName("Natalia");
		firstDriver.setAge(20);
		String firstName = firstDriver.getName();
		System.out.println("1st driver's name: "+ firstName);
		int firstAge = firstDriver.getAge();
		System.out.println("1st driver's age: "+ firstAge);

		Person secondDriver = new Person();
		secondDriver.setName("Lucy");
		secondDriver.setAge(25);
		String secondName = secondDriver.getName();
		System.out.println("2nd driver's name: "+ secondName);
		int secondAge = secondDriver.getAge();
		System.out.println("2nd driver's age: "+ secondAge);
		
		//if names and age are equal
		if (firstDriver == secondDriver) {
			System.out.println("The two driver's name and age are equal.");
		} else {
			System.out.println("The two driver's name and age are not equal.");
		}	
		//if the names are equal
		if (firstName == secondName) {
			System.out.println("The names are equal.");
		} else {
			System.out.println("The names are not equal.");
		}
		//if ages are equal
		if (firstAge ==  secondAge) {
			System.out.println("The ages are equal.");
		} else {
			System.out.println("The ages are not equal.");
		}
		//if one is older
		if (firstAge > secondAge) {
			System.out.println(firstName + " is older than " + secondName +".");
		} if (secondAge > firstAge) {
			System.out.println(secondName + " is older than " + firstName +".");
		} else {
		}
		//if one is younger
		if (firstAge < secondAge) {
			System.out.println(firstName + " is younger than " + secondName +".");
		} if (secondAge < firstAge) {
			System.out.println(secondName + " is younger than " + firstName +".");
		} else {
		}
	}
}

