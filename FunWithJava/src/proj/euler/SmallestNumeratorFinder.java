package proj.euler;

public class SmallestNumeratorFinder {
	private int[] divisers = {11,12,13,14,15,16,17,18,19,20};
	public int findSmallestNumber() {
		boolean isSmallest = true;
		int smallestNumber = 0;
		for(int i = 20; i < Integer.MAX_VALUE; i+=20) {
			isSmallest = true;
			for(int diviser : divisers) {
				if(i % diviser != 0) {
					isSmallest = false;
					break;
				}
			}


			if(isSmallest) {
				smallestNumber = i;
				break;
			}
		}
		
		return smallestNumber;
	}
}
