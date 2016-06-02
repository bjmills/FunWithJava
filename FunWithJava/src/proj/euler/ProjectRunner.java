package proj.euler;

public class ProjectRunner {

	public static void main(String[] args) {
		long multSum = runMultSummer();
		System.out.println("The multiples sum is: " + multSum + "\n");
		
		long fibSum = runFibSummer();
		System.out.println("The fibs sum is: " + fibSum + "\n");
		
		long largestPrimeFactor = runLargetPrimeFactorFinder();
		System.out.println("The largest prime factor is: " + largestPrimeFactor + "\n");
		
		long largestPalindrome = runLargestPalindromeFinder();
		System.out.println("The largest palindrome is: " + largestPalindrome + "\n");
	}
	
	private static long runMultSummer() {
		int[] multiples = {3,5};
		int sumCap = 1000;
		MultipleSummer ms = new MultipleSummer(sumCap, multiples);
		return ms.sumMultiples();
	}
	
	private static long runFibSummer() {
		int sumCap = 4000000;
		FibSummer ms = new FibSummer(sumCap);
		return ms.sumFibs();
	}
	
	private static long runLargetPrimeFactorFinder() {
		long number = 600851475143L;
		LargestPrimeFinder ms = new LargestPrimeFinder(number);
		return ms.findLargestPrime();
	}
	
	private static long runLargestPalindromeFinder() {
		LargestPalindromeFinder ms = new LargestPalindromeFinder();
		return ms.findLargestPalindrome();
	}
}
