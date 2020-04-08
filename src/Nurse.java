
public class Nurse extends Hospital_Employee {

	public Nurse(String name, String surname, int number) {
		super(name, surname, number);
		// TODO Auto-generated constructor stub
	}
	
	public void give_medicine() {
		System.out.println("I am a nurse. "+"My name is " + getName()+". I give medicine.");
	}

}
