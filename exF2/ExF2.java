
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.IOException;

public class ExF2 {
	
	public static void main(String[] args) {
		try {
			
			Instructor instr1 = new Instructor("Cecile", "Navez", 46, 37, 3000.0);
			instr1.printSalaryHistory();
					
		}
		catch (IOException ioe){
			System.out.println(ioe.getMessage());
		}
	}	
	
}