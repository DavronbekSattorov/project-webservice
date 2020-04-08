package Lab1_task2;

public class Janitor extends Hospital_Employee {

	public Janitor(String name, String surname, int number) {
		super(name, surname, number);
		// TODO Auto-generated constructor stub
	}
	public void sweep() {
		System.out.println("I am a janitor. "+"My name is " + getName()+". I do cleaning.");
	}

}
