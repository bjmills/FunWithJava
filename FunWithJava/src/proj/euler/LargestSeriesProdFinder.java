package proj.euler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LargestSeriesProdFinder {
	private int[] series = new int[1000];
	
	public long findLargestSeriesProd() {
		readFileIntoArray();
		long biggestProd = series[0];
		for(int i = 1; i < 13; i++) {
			biggestProd *= series[i];
		}
		
		int lastNum = series[12];
		long currentProd = 0;
		for(int i = 13; i < series.length; i++) {
			//if(series[i] == 0 && i < series.length) - have to handle 0 case somehow, ugh....fml
			
			currentProd = biggestProd;
			currentProd /= lastNum;
			currentProd *= series[i];
			
			if(currentProd > biggestProd) {
				biggestProd = currentProd;
			}
			
			lastNum = series[i];
		}
		
		return biggestProd;
	}

	private void readFileIntoArray() {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("C:/Users/brand/workspace/Java/FunWithJava/doc/largestSeries.txt"));
			
			int i = 0;
			while(scanner.hasNextInt()) {
				series[i] = scanner.nextInt();
				i++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}
