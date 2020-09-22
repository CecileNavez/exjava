
import java.util.Scanner;

public class ExB4 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Which language ? ");
		String language = input.nextLine();	
		
		String welcomeMessage;
		
		switch (language) {
		case "FR":
			welcomeMessage="Bienvenue au cours 'reskilling java' !";
			break;
		case "NL":
			welcomeMessage="Welkom bij de 'reskilling java' cursus !";
			break;
		case "EN":
			welcomeMessage="Welcome to the course 'reskilling java' !";
			break;
		default:
			welcomeMessage="Bienvenue, Welkom, Welcome !";
		}
		
		System.out.println(welcomeMessage);
		
	}
}