package Lab2Task1;

public class MainDriver {
	public static void main(String args[]) {
		Course obj = new Course();
		obj.displayCourse();
		Java cnobj = new Java();
		cnobj.displayCourse();
		// calling main class using subclass
		cnobj.display();
		// this will call the parent class
		Database cobj = new Database();
		cobj.display();
	}

}
