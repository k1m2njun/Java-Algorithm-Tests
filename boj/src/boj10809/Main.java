package boj10809;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		
		boolean tf = false;
		
		for(int i = 97; i < 123; i++) {
			tf = false;
			for(int j = 0; j < s.length(); j++) {
				if((char)i == s.charAt(j)) {
					System.out.print(j+" ");
					tf = true;
					break;
				}
			}
			if(tf == false) {
				System.out.print(-1+" ");
			}
		}
	}
}