package Daily;

//Given an integer k and a string s, find the length of the longest 
//substring that contains at most k distinct characters.
//
//For example, given s = "abcba" and k = 2, the longest substring with
//k distinct characters is "bcb".

public class LongestSubstring {
	public static void main(String[] args) {
		System.out.println(longestSubstring("abcba", 2));
	}
	
	public static String longestSubstring(String str, int k) {
		int i = 0,j = 1,distinct = 0;
		String longestSubstring = "";
		while(j < str.length() && i < str.length()) {
			
			if(str.charAt(i) != str.charAt(j)) {
				distinct++;
				if(distinct >= k) {
					i++;
					j = i + 1;
					distinct = 0;
				}
				else
					j++;
			}
			else if(str.charAt(i) == str.charAt(j)) {
				if(str.substring(i, j + 1).length() > longestSubstring.length()) {
					longestSubstring = str.substring(i, j + 1);
				}
				j++;
			}
			
		}
		System.out.println(i + " " + j );
		return longestSubstring;
	}
}
