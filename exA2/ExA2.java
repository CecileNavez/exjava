
import java.util.ArrayList;
import java.util.List;

public class ExA2 {
	
	public static void main(String[] args) {
		String title = "Learning Java";
		int numberofdays = 5;
		double priceperday = 800;
		Boolean priorknowledge = false;
		List<String> instructorName = new ArrayList<String>();
		instructorName.add("Sandy");
		instructorName.add("Cecile");
		instructorName.add("Philippe");
		
		
		System.out.println("The title of the course is '" + title + "', the course duration is " + numberofdays + " days, the price per day is " + priceperday + "EUR and it is " + priorknowledge + " to think that you need prerequisite to follow the course.");
		System.out.println("Number of instructors for this course : " + instructorName.size());
		
	}


}
