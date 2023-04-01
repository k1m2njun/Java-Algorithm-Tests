package leetCode125ValidPalindrome;

class Solution {
    public boolean isPalindrome(String s) {
        String lower = "";
		int count = 0;
		boolean tf = true;
		
		for(int i = 0; i < s.length(); i++) {
			if((s.charAt(i)>=48 && s.charAt(i)<=57) || (s.charAt(i)>=97 && s.charAt(i)<=122)) {
				lower += s.charAt(i);
			} else if(s.charAt(i)>=65 && s.charAt(i)<=90) {
				lower += (char)(s.charAt(i)+32);
			}
		}
		if(lower == " ") {
			return tf;
		} else {
			for(int i = 0; i < lower.length()/2; i++) {
				if(lower.charAt(i)==lower.charAt(lower.length()-1-i)) {
					count ++;
				}
			}
			if(count==lower.length()/2) {
				return tf;
			} else {
				tf = false;
				return tf;
			}
		}
	}
}
