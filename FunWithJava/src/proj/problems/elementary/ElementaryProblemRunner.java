package proj.problems.elementary;

import proj.euler.SmallestNumeratorFinder;

public class ElementaryProblemRunner {

	public static void main(String[] args) {
//		UserInputScanner scanner = new UserInputScanner();
//		String userInput = scanner.scanUserInput();
//		System.out.println(userInput + "\n");
		
		SmallestNumeratorFinder lcssf = new SmallestNumeratorFinder();
		int smallestNum = lcssf.findSmallestNumber();
		System.out.println("The smallest number is " + smallestNum + "\n");
	}

}
