import java.util.List;
import java.util.ArrayList;

public class ExE1 {
	
	public static void main(String[] args) {
	
	//System.out.println("Salary of " + firstName + " at " + startingAge + " is " + startingSalary); 
	ExE1.printSalaryHistory("Sandy", 23, 2000);

	}
	
	public static void printSalaryHistory(String firstName, int startingAge, double startingSalary){
	//The method will augment the salary with 3% every five years. After 35 years of seniority, the augmentation should stop
		int carrierDuration = 65 - startingAge;
		
		if(carrierDuration >35) {
			carrierDuration = 35;
		}
		
		double salary = startingSalary;
		
		for(int i=0; i<=carrierDuration; i=i+5) {
			int age = startingAge + i ;
			salary = salary * 1.05;
			System.out.println("Salary of " + firstName + " at " + age + " is " + salary);
		}
		System.out.println("Maximum salary reached");
	}	
}
