package boj25314;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		for(int i = 0; i < (n/4); i++) {
			System.out.print("long ");
		}
		System.out.println("int");
	}

}
