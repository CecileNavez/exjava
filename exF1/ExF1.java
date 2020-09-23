import java.util.ArrayList;
import java.util.Scanner;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.IOException;

public class ExF1 {
	
	public static void main (String[] args) {
		
	  Path path = Paths.get("instructors.txt");
	  try (BufferedReader br = Files.newBufferedReader(path)){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the course title.");
		String title = sc.nextLine();
		System.out.println("Enter the number of days for this course.");
		int numberOfDays = Integer.parseInt(sc.nextLine());		
		System.out.println("What is the price per day?");
		double pricePerDay = Double.parseDouble(sc.nextLine());
		sc.close();
		
		boolean priorKnowledgeRequired = true;
		
		
		ArrayList<String> instructors= new ArrayList<>();		
		String name = null;
		while ((name=br.readLine())!= null){
		   instructors.add(name);
		}
		
		Course myCourse = new Course(title, numberOfDays, pricePerDay, priorKnowledgeRequired);
		
		double totalPrice = myCourse.calculatePrice(numberOfDays, pricePerDay, priorKnowledgeRequired );
				
		myCourse.printInfo(title, numberOfDays, pricePerDay, priorKnowledgeRequired);
		
		System.out.println("There are " + instructors.size() + " instructors for this course.");
		
		String label;
		if (totalPrice < 500) {
			label = "CHEAP";
		} else if (totalPrice >= 500 && totalPrice <=1500) {
			label = "OK";
		} else {
			label = "EXPENSIVE";
		}
		
		System.out.println("That price is " + label);
		
	  } catch (NumberFormatException nfe){
		  System.out.println("Sorry, we don't accept wrong stuff, run it again.");
	  } catch (IOException ioe){
		  System.out.println(ioe.getMessage());
	  }
	}
	 
	
	
}