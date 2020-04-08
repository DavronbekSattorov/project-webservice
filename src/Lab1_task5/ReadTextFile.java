package Lab1_task5;
import java.io.File;
import java.util.Scanner;

public class ReadTextFile {
	
	/*
	 Design	and	implement	a	program	that	compares	two	text	input	 files,	line	by	line,	 for	equality.	Print	
     any	lines	that	are	not	equivalent
	 */
	
	private Scanner file1;
	private Scanner file2;
	
	public void openFile() {
		try {
			file1 = new Scanner(new File("Lab1_task5_file1"));
			file2 = new Scanner(new File("Lab1_task5_file2"));
		}catch(Exception e) {
			System.out.println("Could not find file");
		}
	}
	
	public void readFile() {
		while(file1.hasNext() && file2.hasNext()) {
			String a = file1.next();
			String b = file2.next();
			System.out.println(a + " = " + b);
			
		}
	}
	
	public void printdifferences(){
		
		while(file1.hasNext() && file2.hasNext()) {
			String a = file1.next();
			String b = file2.next();
			if (!a.equals(b)) {
				System.out.println(a +" != " + b);
				
			}
		}
	}
	
	public void closeFile() {
		file1.close();
	}
	
	
	
	
}
