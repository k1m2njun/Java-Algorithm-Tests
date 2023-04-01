package boj2908;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String answer = "";
		
		String s = scanner.nextLine();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ') {
				if(s.charAt(i-1) > s.charAt(i+3)) {
					answer += s.charAt(i-1); 
					answer += s.charAt(i-2); 
					answer += s.charAt(i-3); 
					break;
				} else if (s.charAt(i-1) < s.charAt(i+3)){
					answer += s.charAt(i+3);
					answer += s.charAt(i+2);
					answer += s.charAt(i+1);
					break;
				} else {
					if(s.charAt(i-2) > s.charAt(i+2)) {
						answer += s.charAt(i-1); 
						answer += s.charAt(i-2); 
						answer += s.charAt(i-3);
						break;
					} else if (s.charAt(i-2) < s.charAt(i+2)){
						answer += s.charAt(i+3);
						answer += s.charAt(i+2);
						answer += s.charAt(i+1);
						break;
					} else {
						if(s.charAt(i-3) > s.charAt(i+1)) {
							answer += s.charAt(i-1); 
							answer += s.charAt(i-2); 
							answer += s.charAt(i-3);
							break;
						} else if (s.charAt(i-3) < s.charAt(i+1)){
							answer += s.charAt(i+3);
							answer += s.charAt(i+2);
							answer += s.charAt(i+1);
							break;
						}
					}
				}
			}
		}
		System.out.println(answer);
	}
}