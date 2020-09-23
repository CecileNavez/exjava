import java.util.List;

public class DoMath {
	
	public static double calculateAverage(List<Integer> listOfIntegers) {
		
		double total=0;
		for (int value: listOfIntegers) {
			total += value;
		}
		
		return total/listOfIntegers.size();
		}
}