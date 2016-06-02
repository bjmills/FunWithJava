package proj.euler;

public class SumSquareDifferencer {
	public int differenceSumSquares() {
		int sum = 0;
		int squareSum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
			squareSum += i*i;
		}
		
		sum *= sum;
		int differenceSum = sum - squareSum;
		
		return differenceSum;
	}
}
