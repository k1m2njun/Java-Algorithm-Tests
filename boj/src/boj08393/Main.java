package boj08393;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		int sum = 0;
		
		for(int i = 1; i < n+1; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
