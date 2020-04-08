package Lab1_task2;
import Hospital_Employee;

public class Receptionist extends Hospital_Employee {

	public Receptionist(String name, String surname, int number) {
		super(name, surname, number);
		// TODO Auto-generated constructor stub
	}
	public void answer_phone() {
		System.out.println("I am a receptionist. "+"My name is " + getName()+". I answer phone call.");
	}

}
