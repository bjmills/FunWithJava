package proj.euler;

public class LargestPalindromeFinder {	
	public int findLargestPalindrome() {
		int largestPalindrome = 0;
		int firstMultiple = 999;
		
		for(int i = firstMultiple; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				int sum = i * j;
				
				if(isPalindrome(sum) && sum > largestPalindrome) {
					largestPalindrome = sum;
					//System.out.println("i:" + i + " j:" + j + "\n");
				}
			}
		}
		
		return largestPalindrome;
	}
	
	private boolean isPalindrome(int sum) {
		String reverseSumString = "";
		
		//how do i reverse an integer?
			//could covert to string, reverse, and convert back
			//read individual integers
		
		String sumString = Integer.toString(sum);
		for(int i = sumString.length(); i > 0; i--) {
			reverseSumString += sumString.charAt(i-1);
		}
		
		if(Integer.parseInt(reverseSumString) == sum) {
			return true;
		}
		
		return false;
	}
}
