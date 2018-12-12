
class Person {
	//Instance variables ( data or "state)
	String name;
	int age;
	
	
	/*classes can contain
	 * 1. data in form of variables
	 * 2. Subroutines (methods)
	 */
}


public class app {
//example of subroutine in main is also called method
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("there");
		
		//Declaring variable, creating object
		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 37;
		
		
		Person person2 = new Person();
		person2.name = "Mary Jane";
		person2.age = 20;
		
		System.out.printf("My name is "+ person1.name);
		System.out.println(", My age is " + person1.age + ".");
		System.out.printf("My name is " + person2.name);
		System.out.println(", My age is " + person2.age + ".");
		
	}

}
