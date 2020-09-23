import java.util.Scanner;

public class ExC5 {
	
	public static void printInfo(String title, int numberofdays, double priceperday, boolean priorknowledge) {
				
		System.out.println("The title of the course is '" + title + "'.");
		System.out.println("The course duration is " + numberofdays + " days.");
		System.out.println("The price per day is " + priceperday + " EUR.");
		System.out.println("It is " + priorknowledge + " to think that you need prerequisite to follow the course.");
		System.out.println("The total price of the course is " + totalPrice(numberofdays, priceperday, priorknowledge) + " EUR.");
		}
		
	public static double totalPrice(int a, double b, boolean priorknowledge){ // a = number of days - b = price per day
	
		double c = a * b; // c= total price of the course without VAT
	
		if (a > 3 && priorknowledge) { 
		
			return c;
			
			} else {
			
			return c *= 1.21;
			
			}
		
		}
	
	public static void main(String[] args) {
		String title;
		int numberofdays=0;
		double priceperday;
		boolean priorknowledge;
				
		try{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the title : ");
		title = input.nextLine();

		System.out.println("Enter the number of days : ");
		numberofdays = input.nextInt();
			
				
		System.out.println("Enter the price per day : ");
		priceperday = input.nextDouble();
		
		
		System.out.println("A knowledge is pre-required (false/true) ? : ");
		priorknowledge = input.nextBoolean();
		
		input.close();
		
		ExC5.printInfo(title, numberofdays, priceperday, priorknowledge);
		
		} catch (NumberFormatException e) {
			System.out.println("Insert correct argument, try again");
		}
		
		
		
	}
}
