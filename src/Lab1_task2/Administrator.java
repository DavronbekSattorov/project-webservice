package Lab1_task2;
import Hospital_Employee;

public class Administrator extends Hospital_Employee {

	public Administrator(String name, String surname, int number) {
		super(name, surname, number);
		// TODO Auto-generated constructor stub
	}
	public void order_equipment() {
		System.out.println("I am a admnistrator. "+"My name is " + getName()+". I order equipments.");
	}
	

}
