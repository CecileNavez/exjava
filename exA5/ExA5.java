
import java.util.ArrayList;
import java.util.Scanner;

public class ExA5 {
	
	public static void main(String[] args) {
		String title = "Java";
		int numberofdays = 5;
		double priceperday = 400;
		boolean priorknowledge = false;
		
		ArrayList<String> instructorNames = new ArrayList<String>();
		
		instructorNames.add("Sandy");
		instructorNames.add("Cecile");
		instructorNames.add("Philippe");
		
		//title = args[0];
		//numberofdays = Integer.parseInt(args[1]);
		//priceperday = Double.parseDouble(args[2]);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the title : ");
		title = input.nextLine();
		System.out.println("Enter the number of days : ");
		numberofdays = input.nextInt();
		System.out.println("Enter the price per day : ");
		priceperday = input.nextDouble();
				
		double totalPriceOfTheCourse = numberofdays * priceperday * 1.21;
		
		System.out.println("The title of the course is '" + title + "', the course duration is " + numberofdays + " days, the price per day is " + priceperday + "EUR and it is " + priorknowledge + " to think that you need prerequisite to follow the course.");
		System.out.println("Number of instructors for this course : " + instructorNames.size() + ".");
		System.out.println("The total price of the course is " + totalPriceOfTheCourse + " EUR (included VAT).");
		
	}


}
