package proj.euler;

public class EulerProblemRunner {
	private static LargestPrimeFinder lpf;
	public static void main(String[] args) {
		long multSum = runMultSummer();
		System.out.println("The multiples sum is: " + multSum + "\n");
		
		long fibSum = runFibSummer();
		System.out.println("The fibs sum is: " + fibSum + "\n");
		
		long largestPrimeFactor = runLargetPrimeFactorFinder();
		System.out.println("The largest prime factor is: " + largestPrimeFactor + "\n");
		
		long largestPalindrome = runLargestPalindromeFinder();
		System.out.println("The largest palindrome is: " + largestPalindrome + "\n");
		
		SmallestNumeratorFinder lcssf = new SmallestNumeratorFinder();
		int smallestNum = lcssf.findSmallestNumber();
		System.out.println("The smallest number is " + smallestNum + "\n");
		
		SumSquareDifferencer sumDiff = new SumSquareDifferencer();
		int diff = sumDiff.differenceSumSquares();
		System.out.println("The sum square difference is " + diff + "\n");
		
		long prime = lpf.findPrime(10001);
		System.out.println("The 10001 prime is " + prime + "\n");
		
		LargestSeriesProdFinder lspf = new LargestSeriesProdFinder();
		long prod = lspf.findLargestSeriesProd();
		System.out.println("The largest prod is: " + prod + "/n");
	}
	
	private static long runMultSummer() {
		int[] multiples = {3,5};
		int sumCap = 1000;
		MultipleSummer ms = new MultipleSummer(sumCap, multiples);
		return ms.sumMultiples();
	}
	
	private static long runFibSummer() {
		int sumCap = 4000000;
		FibSummer fs = new FibSummer(sumCap);
		return fs.sumFibs();
	}
	
	private static long runLargetPrimeFactorFinder() {
		long number = 600851475143L;
		lpf = new LargestPrimeFinder(number);
		return lpf.findLargestPrime();
	}
	
	private static long runLargestPalindromeFinder() {
		LargestPalindromeFinder lpalf = new LargestPalindromeFinder();
		return lpalf.findLargestPalindrome();
	}
}
