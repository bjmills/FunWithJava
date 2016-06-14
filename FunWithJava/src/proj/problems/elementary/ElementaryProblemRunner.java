package proj.problems.elementary;

import proj.euler.SmallestNumeratorFinder;

public class ElementaryProblemRunner {

	public static void main(String[] args) {
//		UserInputScanner scanner = new UserInputScanner();
//		String userInput = scanner.scanUserInput();
//		System.out.println(userInput + "\n");
		
		//SmallestNumeratorFinder lcssf = new SmallestNumeratorFinder();
		//int smallestNum = lcssf.findSmallestNumber();
		//System.out.println("The smallest number is " + smallestNum + "\n");
		
		SAP_Problems sap = new SAP_Problems();
//		int[] a = {1,3,5,7};
//		int[] b = {2,4,6,8};
//		int[] c = sap.mergeArrays(a, b);
//		
//		for(int val : c) {
//			System.out.println(val);
//		}
		
		int numPals = sap.countSubPalindromes("aabaa");
		
		System.out.println(numPals);
		
		
	}

}
