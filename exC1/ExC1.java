import java.util.ArrayList;
import java.util.Scanner;

public class ExC1 {
	
	public static void printInfo() {
		String title;
		int numberofdays;
		double priceperday;
		boolean priorknowledge;
				
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
		System.out.println("The price per day is " + priceperday + " EUR.");
		System.out.println("Number of instructors for this course : " + instructorNames.size() + ".");
		System.out.println("It is " + priorknowledge + " to think that you need prerequisite to follow the course.");
		
		}
	
	public static void main(String[] args) {
		ExC1.printInfo();
		
	}
}