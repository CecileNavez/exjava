import java.util.Scanner;
import java.util.InputMismatchException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class ExD2 {
	
	public static void printInfo(String title, int numberofdays, double priceperday,boolean priorknowledge ) throws IOException{
	   BufferedWriter bw = Files.newBufferedWriter(Paths.get("printing.txt"));
	   double totalPrice = totalPrice(numberofdays, priceperday, priorknowledge );
	   bw.write("The " + title + " course takes " + numberofdays + " days and costs " + totalPrice + " euros. \nPrior knowledge required: " + priorknowledge );
	   bw.close();
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
			
		Path path = Paths.get("instructors.txt");
		try(BufferedReader br = Files.newBufferedReader(path)){
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
			
			ExD2.printInfo(title, numberofdays, priceperday, priorknowledge);
		
		} catch (InputMismatchException e) {
			System.out.println("Insert correct argument, try again");
		} catch (IOException ioe){
		  System.out.println(ioe.getMessage());
	  }
		
		
		
	}
}
