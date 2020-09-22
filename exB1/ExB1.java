
import java.util.ArrayList;
import java.util.Scanner;

public class ExB1 {
	
	public static void main(String[] args) {
		String title = "Java";
		int numberofdays = 5;
		double priceperday = 400;
		boolean priorknowledge = false;
		double totalPriceOfTheCourse;
		
		ArrayList<String> instructorNames = new ArrayList<String>();
		
		instructorNames.add("Sandy");
		instructorNames.add("Cecile");
		instructorNames.add("Philippe");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the title : ");
		title = input.nextLine();
		
		System.out.println("Enter the number of days : ");
		numberofdays = input.nextInt();
		
		System.out.println("Enter the price per day : ");
		priceperday = input.nextDouble();
		
		System.out.println("A knowledge is pre-required (false/true) ? : ");
		priorknowledge = input.nextBoolean();
		
		System.out.println("The title of the course is '" + title + "'.");
		System.out.println("The course duration is " + numberofdays + " days.");
		System.out.println("The price per day is " + priceperday + "EUR.");
		System.out.println("Number of instructors for this course : " + instructorNames.size() + ".");
		System.out.println("It is " + priorknowledge + " to think that you need prerequisite to follow the course.");
		
		if (numberofdays > 3 && priorknowledge == true) {
			totalPriceOfTheCourse = numberofdays * priceperday;
			System.out.println("The total price of the course is " + totalPriceOfTheCourse + " EUR (VAT ON THE HOUSE !).");
		} else {
			totalPriceOfTheCourse = numberofdays * priceperday * 1.21;
			System.out.println("The total price of the course is " + totalPriceOfTheCourse + " EUR (included VAT).");
		}
		
		
		
	}


}
