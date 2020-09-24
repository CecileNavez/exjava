import java.util.Scanner;
import java.util.ArrayList;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;

import java.io.IOException;

public class ExF1 {

	public static void main(String[] args) {
			
		Path path = Paths.get("instructors.txt"); // reads the file 
		
		try (BufferedReader br = Files.newBufferedReader(path)){
			
			// collect input : title, nb of days, price per day, prerequired knowledge		
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the title : ");
			String title = input.nextLine();
			
			System.out.println("Enter the number of days : ");
			int numberofdays = Integer.parseInt(input.nextLine());
			
			System.out.println("Enter the price per day : ");
			double priceperday = Double.parseDouble(input.nextLine());
	
			input.close();
			
			boolean priorknowledge = true;
			
			
			// list of instructors
			ArrayList<String> instructorNames = new ArrayList<String>();
			String name = null;
			while((name=br.readLine()) != null) {
				instructorNames.add(name);
			}
			
			Course myCourse = new Course(title, numberofdays, priceperday, priorknowledge);
			
			double totalPriceOfTheCourse = myCourse.calculatePrice();
			
			//sets the label of the course
			String courseLabel;
			if (totalPriceOfTheCourse < 500) {
				courseLabel = "CHEAP";
			} else if (totalPriceOfTheCourse >= 500 &&  totalPriceOfTheCourse <= 1500) {
				courseLabel = "OK";
			} else {
			courseLabel = "EXPENSIVE";
			}
			
			// prints all infos
			myCourse.printInfo();
			System.out.println("Number of instructors for this course : " + instructorNames.size() + ".");
			System.out.println("the course price is " + courseLabel + ".");
		
		} catch (NumberFormatException e) {
			 System.out.println("Insert correct argument, try again");
			 
		}  catch (IOException ioe){
			  System.out.println(ioe.getMessage()); // exception for reading the txt file
		 }
		 
	}
}
