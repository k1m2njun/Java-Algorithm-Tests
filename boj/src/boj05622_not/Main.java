package boj05622_not;

import java.util.ArrayList;
import java.util.Scanner;

class Phone {
	int num;
	char[] c;
	
	public Phone(int num, char[] c) {
		this.num = num;
		this.c = c;
	}
}

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		scanner.close();
		
		int count = 0;
		
		ArrayList<Phone> arrList = new ArrayList<>();
		char[] c;
		
		for(int i = 0; i < 10; i++) {
			c = new char[4];
//			for(int j = 0; j < 26; j++) {
//				if(j!=18 || j!=) {
//					
//				}
//				if((i==7) || (i==9)) {
//					for(int k = 0; k < 4; k++) {
//						c[k] = (char)(j + k + 65);
//					}
//				} else if( i>=2 && i<=8) {
//					for(int k = 0; k < 3; k++) {
//						c[k] = (char)(j + k + 65);
//					}
//				}
//				
//			}
			arrList.add(new Phone(i, c));
		}
		System.out.println(s + arrList.get(9).c[1]);
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < arrList.size(); j++) {
				for(int k = 0; k < arrList.get(j).c.length; k++) {
					if(s.charAt(i) == arrList.get(j).c[k]) {
						count += arrList.get(j).num + 1;
					}
				}
			}
		}
		System.out.println(count);
		
	}

}