
public class Lab1_task2 {
	
	/*
	Design	 and	 implement	 a	 set	 of	 classes	 that	 define	 the	 employees	 of	 a hospital:	 doctor,	 nurse,	
	administrator,	 surgeon,	 receptionist,	 janitor, and	 so on.	 Include	 methods	 in	 each	 class	 that	 are	
	named	 according to	 the	 services	 provided	 by	 that	 person	 and	 that	 print	 an	 appropriate message.	
	Create	a	main driver	class	to	instantiate	and	exercise	several	of	the	classes.
	*/
	public static void main(String[] args) {
		Doctor doctor = new Doctor("John","Haus", 732859247);
		Nurse nurse = new Nurse("Anna", "Kamil", 733558841);
		Janitor janitor = new Janitor("Kenny","Mercy", 734586957);
		Receptionist receptionist = new Receptionist("Mark","Brel",738654789);
		Secretary secretary = new Secretary("Willi","Flesh",734125486);
		Surgeon surgeon = new Surgeon("Mark","Lusy",731452896);
		Administrator administrator = new Administrator("Alex","Ken",731458762);
		
		
		doctor.examine_patient();
		nurse.give_medicine();
		janitor.sweep();
		receptionist.answer_phone();
		secretary.schedule_meeting();
		surgeon.cutting();
		administrator.order_equipment();
		
		
		
		
	}
	

}
