
public class Surgeon extends Hospital_Employee {

	public Surgeon(String name, String surname, int number) {
		super(name, surname, number);
		// TODO Auto-generated constructor stub
	}
	public void cutting() {
		System.out.println("I am a surgeon. "+"My name is " + getName()+". I cut.");
	}

}
