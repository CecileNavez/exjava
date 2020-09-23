import java.util.List;
import java.util.ArrayList;



public class ExC3 {
	
	public static void main(String[] args) {
		List<Integer> listOfIntegers = new List<Integer>();
		
		double average = DoMath.calculateAverage(listOfIntegers);
		System.out.println("The average is " + average);
		
		}
}