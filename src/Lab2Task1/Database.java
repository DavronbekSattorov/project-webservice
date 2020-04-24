package Lab2Task1;

class Database extends Course { 
		String description ="Database and Programming"; 
		String title="DB"; 
		int number=501; 
		String department="CSEDepartment";
		 // display method of sub class 

		public void display() {
		 System.out.println("The title of the course in the Ciricuulum is "+title+" ,ID is "+number+".\nDescription: "+description+".\nThe "+department+" teaches this course" );

		 } 

}
