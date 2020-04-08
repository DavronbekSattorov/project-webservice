package Lab1_task3;
import Name;
import Nationality;
import Occupation;
import Lab1_task3.Lab1_task3.Age;
import Lab1_task3.Lab1_task3.Country;
import Lab1_task3.Lab1_task3.Income;

public class Lab1_task3 {
	
	public static void main(String[] args) {
		
		String[] people = new String[3];
		System.out.println(String.format("%-21s %-15s %-15s %-15s %-20s %-15s", "Name", "Age", "Country", "Nationality", "Occupation", "Income"));
		people[0] = Person("Davron ","Sattorov", 30, "Android Developer", "Kyrgyzstan", "Uzbek", 80000);
		people[1] = Person("Afrozim ","Ahmadaliev", 26, "Web Developer", "Kyrgyzstan", "Uzbek", 80000);
		people[2] = Person("Bekzot ","Mamadjonov", 25, "Doctor", "Kyrgyzstan", "Uzbek", 180000);
		
		for (int i=0; i<people.length; i++) {
			
			System.out.println(people[i]);
		}
		
		
		
		
	}
	
	
	public static String Person(String nameOfPerson, String surnameOfPerson, int ageOfPerson, String occupationOfPerson,
			String countryOfPerson, String nationalityOfPerson, double incomeOfPerson) {
		Name name = new Name(nameOfPerson,surnameOfPerson);
		Age age = new Age(ageOfPerson);
		Country country = new Country(countryOfPerson);
		Nationality nationality = new Nationality(nationalityOfPerson);
		Occupation occupation = new Occupation(occupationOfPerson);
		Income income = new Income(incomeOfPerson);
		
		

		return String.format("%-21s %-15s %-15s %-15s %-20s %-15s", name, age, country, nationality,occupation, income);
		
	}

}
