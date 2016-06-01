package proj.euler;

public class FibSummer {
	private int sumCap = 0;
	public FibSummer(int sumCap) {
		this.sumCap = sumCap;
	}
	
	public long sumFibs() {
		long sum = 0;
		int secondLastFib = 0;
		int lastFib = 1;
		int currentFib = 0;
		
		while(currentFib <= sumCap) {
			currentFib = lastFib + secondLastFib;
						
			if(currentFib % 2 == 0) {
				sum += currentFib;
			}
			
			secondLastFib = lastFib;
			lastFib = currentFib;
		}
		
		return sum;
	}
}
