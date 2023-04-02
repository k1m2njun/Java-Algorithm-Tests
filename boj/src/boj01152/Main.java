package boj01152;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
		scanner.close();
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				if(i == 0) {
					continue;
				} else if(i == s.length()-1) {
					count++;
				} else {
					count++;
				}
			} else {
				if(i == s.length()-1) {
					count++;
				}
			}
		}	
		System.out.println(count);
	}
}