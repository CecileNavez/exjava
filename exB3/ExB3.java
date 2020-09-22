import java.util.ArrayList;

public class ExB3 {
	
	public static void main(String[] args) {
	
		
		int[] listOfIntegers = new int[]{6,5,4,3,1};
		int average =0;
		for (int value: listOfIntegers) {
			average += value;
		}
		
		average = average/listOfIntegers.length;
		
		System.out.println("average is : " + average);
		
	}
}