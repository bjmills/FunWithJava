package proj.problems.elementary;

import java.util.Scanner;

public class UserInputScanner {
	private Scanner scanner = new Scanner(System.in);
	
	public String scanUserInput() {
		return scanner.next();		
	}
}
