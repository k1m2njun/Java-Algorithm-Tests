package boj01157_hw;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		scanner.close();
		
		char[] sArr = new char[s.length()];
		
		// appended toUpperCase
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				sArr[i] = (char)(s.charAt(i) - 32);
			} else {
				sArr[i] = s.charAt(i);
			}
		}
		
		int count = 0;
		int temp = 0;
		char c = ' ';
		
		for(int i = 0; i < sArr.length; i++) {
			
			for(int j = i; j < sArr.length; j++) {
				if(sArr[i] != '1') {
					if(sArr[i] == sArr[j]) {
						count++;
						
					}
					System.out.println(count);
					if(temp < count) {
						temp = count;
						count = 0;
						c = sArr[i];
					} else if(temp == count) {
						c = '?';
						count = 0;
					}
					sArr[j] = '1';
				}
				
			}
			
		}
		System.out.println(c);
	}

}

