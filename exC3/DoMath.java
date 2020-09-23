public class DoMath {
	
	public static double calculateAverage() {
		
		int[] listOfIntegers = {6,5,4,3,1}; 
		double total=0;
		for (int value: listOfIntegers) {
			total += value;
		}
		
		return total/listOfIntegers.length;
		}
}