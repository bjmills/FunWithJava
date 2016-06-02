package proj.euler;

public class LargestPrimeFinder {
	private long number = 0;
	
	public LargestPrimeFinder(long number) {
		this.number = number;
	}
	
	public long findLargestPrime() {
		long largestPrimeFactor = 0;
		long limit = (long)Math.sqrt(number); 
		for(long i = 2; i < limit; i++) {
			if(number % i == 0) {
				if(isPrime(number/i)) {
					largestPrimeFactor = number / i;
					break;
				} else if(isPrime(i)) {
					largestPrimeFactor = i;
				}
			}
		}
		
		return largestPrimeFactor;
	}
	
	protected boolean isPrime(long factor) {
		for(int i = 2; i < factor; i++) {
			if(factor % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public long findPrime(int kthPrime) {
		long prime = 0;
		int primeCount = 0;
		for(long i = 2; i < Long.MAX_VALUE; i++) {
			if(isPrime(i)) {
				primeCount++;
			}
			
			if(primeCount == kthPrime) {
				prime = i;
				break;
			}
		}
		
		return prime;
	}
}
