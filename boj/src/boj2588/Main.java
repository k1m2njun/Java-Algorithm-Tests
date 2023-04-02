package boj2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String b = scanner.next();
		scanner.close();
		
		int sum = 0;
		
		for(int i = 0; i < b.length(); i++) {
			sum += ((int)(b.charAt(b.length()-i-1)-48) * a) * Math.pow(10, i);
			System.out.println((int)(b.charAt(b.length()-i-1)-48) * a);
		}
		System.out.println(sum);
	}
}
