
import java.util.HashMap;
import java.util.Scanner;

public class ExA6 {
	
	public static void main(String[] args) {
				
		HashMap<String, Integer> myMonths = new HashMap<String, Integer>();
		
		myMonths.put("January", 31);
		myMonths.put("February", 28);
		myMonths.put("March", 31);
		myMonths.put("April", 30);
		myMonths.put("May", 31);
		myMonths.put("June", 30);
		myMonths.put("July", 31);
		myMonths.put("August", 31);
		myMonths.put("September", 30);
		myMonths.put("October", 31);
		myMonths.put("November", 30);
		myMonths.put("december", 31);
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("What day is it ? ");
		int numberOfTheDay = input1.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("What Month is it ? ");
		String nameOfTheMonth = input2.nextLine();
		
		int numberOfDaysStillToGo = myMonths.get(nameOfTheMonth) - numberOfTheDay;
		System.out.println(numberOfDaysStillToGo + " days still to go.");
				
	}


}
