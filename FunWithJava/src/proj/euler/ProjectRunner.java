package proj.euler;

public class ProjectRunner {

	public static void main(String[] args) {
		long sum = runMultSummer();
		
		System.out.println("The sum is: " + sum + "\n");
	}
	
	private static long runMultSummer() {
		int[] multiples = {3,5};
		MultipleSummer ms = new MultipleSummer(1000, multiples);
		return ms.sumMultiples();
	}

}
