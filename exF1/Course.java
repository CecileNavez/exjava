import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Course{
	// Variables
	
	private String title;
	private int numberOfDays;
	private double pricePerDay;
	private boolean priorKnowledgeRequired;
	
	public Course(String title, int numberOfDays, double pricePerDay, boolean priorKnowledgeRequired) {
		this.title = title;
		this.numberOfDays = numberOfDays;
		this.pricePerDay = pricePerDay;
		this.priorKnowledgeRequired = priorKnowledgeRequired;
	}

	// gets and sets

	public String getTitle() {
		return title; 
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getNumberOfDays() {
		return numberOfDays; 
	}
	
	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	
	public double getPricePerDay() {
		return pricePerDay; 
	}
	
	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	
	public boolean getPriorKnowledgeRequired() {
		return priorKnowledgeRequired; 
	}
	
	public void setPriorKnowledgeRequired(boolean priorKnowledgeRequired) {
		this.priorKnowledgeRequired = priorKnowledgeRequired;
	}
	
	//methods
	
	public void printInfo(String title, int numberOfDays, double pricePerDay,boolean priorKnowledgeRequired ) throws IOException{
	   BufferedWriter bw = Files.newBufferedWriter(Paths.get("printing.txt"));
	   double totalPrice = calculatePrice(numberOfDays, pricePerDay, priorKnowledgeRequired );
	   bw.write("The " + title + " course takes " + numberOfDays + " days and costs " + totalPrice + " euros. \nPrior knowledge required: " + priorKnowledgeRequired );
	   bw.close();
	}
	
	public double calculatePrice(int numberOfDays, double pricePerDay,boolean priorKnowledgeRequired ){
		double totalPrice = numberOfDays*pricePerDay;
		if (!(numberOfDays>3 && priorKnowledgeRequired)) {
			totalPrice*=1.21;
		}
		return totalPrice; 
	}
	
	
	
}