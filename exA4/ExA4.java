
import java.util.ArrayList;

public class ExA4 {
	
	public static void main(String[] args) {
		String title = "Java";
		int numberofdays = 5;
		double priceperday = 400;
		boolean priorknowledge = false;
		
		ArrayList<String> instructorNames = new ArrayList<String>();
		
		instructorNames.add("Sandy");
		instructorNames.add("Cecile");
		instructorNames.add("Philippe");
		
		double totalPriceOfTheCourse = numberofdays * priceperday * 1.21;
		title = args[0];
		numberofdays = Integer.parseInt(args[1]);
		priceperday = Double.parseDouble(args[2]);
		
		System.out.println("The title of the course is '" + title + "', the course duration is " + numberofdays + " days, the price per day is " + priceperday + "EUR and it is " + priorknowledge + " to think that you need prerequisite to follow the course.");
		System.out.println("Number of instructors for this course : " + instructorNames.size() + ".");
		System.out.println("The total price of the course is " + totalPriceOfTheCourse + " EUR (included VAT).");
		
	}


}
