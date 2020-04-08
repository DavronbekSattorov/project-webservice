
public class Doctor extends Hospital_Employee {

	public Doctor(String name, String surname, int number) {
		super(name, surname, number);
		// TODO Auto-generated constructor stub
		
		
	}
	
	public void examine_patient() {
		System.out.println("I am a doctor." + " My name is " +getName() + ". I examine a patient.");
	}

}
