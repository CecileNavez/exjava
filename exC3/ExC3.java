import java.util.List;
import java.util.ArrayList;



public class ExC3 {
	
	public static void main(String[] args) {
		ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();
		
			listOfIntegers.add(5);
			listOfIntegers.add(6);
			listOfIntegers.add(3);
	
		double average = DoMath.calculateAverage(listOfIntegers);
		System.out.println("The average is " + average);
		
		}
}