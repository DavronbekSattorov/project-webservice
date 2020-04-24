package Lab2Task1;

class Java extends Course {
	
		String description ="Java";
		String title="J"; 
		int number=502; 
		String department="Programming"; 
		// display method of sub class 

		public void display() {
			
		 System.out.println("The title of the course in the Ciricuulum is "+title+" , ID is "+number+".\nDescription: "+description+".\nThe "+department+" teaches this course" );
		 
		}
		
}


