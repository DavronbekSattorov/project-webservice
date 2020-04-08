import java.io.File;
import java.util.Scanner;

public class Lab1_task4_Readfile {
	
		private Scanner file;
		
		public void openFile() {
			try {
				file = new Scanner(new File("Lab1_task4_file"));
				
			}catch(Exception e) {
				System.out.println("Could not find file.");
		}
		
	}
		public void readFile() {
			while(file.hasNext()) {
				String week = file.nextLine();
				//String day = file.next();
				//int hour = file.nextInt();
			
					
				
					System.out.println(week+ " ");
					
				
				
			}
		}
		
		public void closeFile() {
			file.close();
		}
	}


