package boj02480;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[3];
		int e = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		
		
		if ((arr[0] == arr[1]) && (arr[0] == arr[2])) {
			e = 10000 + arr[0] * 1000;
		} else if((arr[0] != arr[1]) && (arr[1] != arr[2]) && (arr[0] != arr[2])) {
			Arrays.sort(arr);
            e = arr[2] * 100;
		} else {
			if ((arr[0] == arr[1]) || (arr[0] == arr[2])) {
				e = 1000 + arr[0] * 100;
			} else {
				e = 1000 + arr[2] * 100;
			}
		}
		System.out.println(e);
	}
}
