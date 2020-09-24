import java.io.IOException;

public class TestCourse {

	public static void main(String[] args) {
	
		try {
			
	Course c = new Course("Java", 5, 550.45, true);
	
	System.out.println(c.getTitle());
	System.out.println(c.getNumberOfDays());
	System.out.println(c.getPricePerDay());
	System.out.println(c.getPriorKnowledgeRequired());
	
	c.addInstructor("Nathan"); 
	c.addInstructor("Cecile");
	System.out.println(c.getInstructors());
	
	System.out.println(c.calculatePrice());
	
	c.printInfo();
		} catch (IOException ioe){
			  System.out.println(ioe.getMessage()); // exception for reading the txt file
		 }
	}
}	
