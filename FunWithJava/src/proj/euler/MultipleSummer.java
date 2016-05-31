package proj.euler;

public class MultipleSummer {
	private int[] multiples;
	private int sumCap;
	
	public MultipleSummer(int sumCap, int[] multiples) {
		this.sumCap = sumCap;
		this.multiples = multiples;
	}
	
	public long sumMultiples() {
		long sum = 0;
		for(int i = 1; i < sumCap; i++) {
			for (int multiple : multiples) {
				if (i % multiple == 0) {
					sum += i;
					break;
				}
			}
		}
		
		return sum;
	}
}
