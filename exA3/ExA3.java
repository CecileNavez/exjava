
import java.util.ArrayList;
import java.util.List;

public class ExA3 {
	
	public static void main(String[] args) {
		String title = "Learning Java";
		int numberofdays = 5;
		double priceperday = 800;
		boolean priorknowledge = false;
		
		List<String> instructorNames = new ArrayList<String>();
		instructorNames.add("Sandy");
		instructorNames.add("Cecile");
		instructorNames.add("Philippe");
		
		double totalPriceOfTheCourse = numberofdays * priceperday * 1.21;
		
		
		System.out.println("The title of the course is '" + title + "', the course duration is " + numberofdays + " days, the price per day is " + priceperday + "EUR and it is " + priorknowledge + " to think that you need prerequisite to follow the course.");
		System.out.println("Number of instructors for this course : " + instructorNames.size() + ".");
		System.out.println("The total price of the course is " + totalPriceOfTheCourse + " EUR (included VAT).");
		
	}


}
