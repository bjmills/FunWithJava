package proj.problems.elementary;

import java.util.HashMap;

public class SAP_Problems {
	//public String[] mismatchedBrackets(String[] str) {
	//}
	
	public int[] mergeArrays(int[] a, int[] b) {
		int[] merged = new int[a.length * 2];
		int aIndex = 0;
		int bIndex = 0;
		
		for(int i = 0; i < a.length * 2; i++) {
			if(aIndex == a.length) {
				merged[i] = b[bIndex];
				
				bIndex++;
			} else if(bIndex == b.length) {
				merged[i] = a[aIndex];
				
				aIndex++;
			} else if(a[aIndex] < b[bIndex]) {
				merged[i] = a[aIndex];
				
				aIndex++;
			} else if(b[bIndex] <= a[aIndex]) {
				merged[i] = b[bIndex];
				
				bIndex++;
			}
		}
	
	
		
		return merged;
	}
	
	public int countSubPalindromes(String str) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int palindromeCount = 0;
		int beginIndex = 0;
		int endIndex = 0;
		
		for(int i = 0; i < str.length(); i++) {
			String c = "" + str.charAt(i);
			
			if(!map.containsKey(c)) {
				palindromeCount++;
				map.put(c, 1);
			}
			
			while(beginIndex >=0 && endIndex < str.length()) {
				String substring = str.substring(beginIndex, endIndex);
				boolean isPalindrome = true;
				for(int j = 0; j < substring.length(); j++) {
					if(substring.charAt(j) != substring.charAt(substring.length()-j-1)) {
						isPalindrome = false;
					}
				}
				
				if(isPalindrome && !map.containsKey(substring)) {
					palindromeCount++;
					map.put(substring, 1);
				}
				
				beginIndex--;
				endIndex++;
			}

		}
		
		return palindromeCount;
	}
}
