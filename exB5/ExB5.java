
import java.util.Scanner;

public class ExB5 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String answer = "Y";
	
		while (answer.equals("Y")){
			System.out.println("Welcome !");
			System.out.println("Would you like to be greeted again ? (Y/N) ");
			answer = input.nextLine().toUpperCase();
			}

			input.close();			
			
		}
}