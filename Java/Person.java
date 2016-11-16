/**
 * @author Natasya Virgichalia <br>
 * date: 11/14/2016 <br>
 * contact: nvirgichalia@gmail.com <br>
 * Person class composes of name and age. <br>
 */

public class Person {
	//characteristics (attributes) 
	//private = encapsulate the attributes
	private String name;
	private int age;
	
	/**
	 * construct a new Person with name = natasya and age = 17.
	 * method that initialize the value of the attributes.
	 */
	public Person() {
		name = "Natasya";
		age = 17;	
	}
	/**
	 * construct a new with the values provided from name and age parameters.
	 * @param name the name of a person 
	 * @param age the age of a person
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/**
	 * Getter method or Accessor methods to get the name of a person.
	 * @return the name of a person
	 */
	public String getName() {
		return name;
	}
	/**
	 * Getter method or Accessor methods to get the age of a person.
	 * @return the age of a person
	 */
	public int getAge() {
		return age;
	}
	/**
	 * Setter methods or Mutator methods to set the name of a person according to name parameter.
	 * @param name of a person
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Setter methods or Mutator methods to set the name of a person according to the age parameter.
	 * @param age of a person
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * Return the name and age of a peson.
	 */
	public String toString() {
		return "name: " + this.name + " and age: " + this.age + ".";
	}
 }

