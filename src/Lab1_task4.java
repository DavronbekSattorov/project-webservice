import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab1_task4 {
	
	
	public static void main(String[] args) throws FileNotFoundException {
	//	Lab1_task4_Readfile file = new Lab1_task4_Readfile();
	//	file.readFile();
		 // pass the path to the file as a parameter 
	    int week=0;
	    
	    int[][][] hospital = new int[4][7][1];
	      
	    Scanner sc2 = null;
	    try {
	        sc2 = new Scanner(new File("Lab1_task4_file"));
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();  
	    }
	    while (sc2.hasNextLine()) {
	            Scanner s2 = new Scanner(sc2.nextLine());
	        while (s2.hasNext()) {
	            String s = s2.next();
	            
	            System.out.println(s);
	        }
	    }
	    
	    System.out.println(week);
	    
       
		
      
	}
}
