
public class Secretary extends Hospital_Employee {

	public Secretary(String name, String surname, int number) {
		super(name, surname, number);
		// TODO Auto-generated constructor stub
	}
	public void schedule_meeting() {
		System.out.println("I am a secratory. "+"My name is " + getName()+". I shedule meeting.");
	}

}
