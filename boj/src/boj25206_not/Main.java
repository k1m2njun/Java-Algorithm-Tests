package boj25206_not;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String subject;
		double score;
		String grade;
		double totalScore = 0.0;
		int count = 0;
		
		for(int i = 0; i < 20; i++) {
		
			subject = scanner.next();
			score = scanner.nextDouble();
			grade = scanner.next();
			
			if(grade == "A+") {
				totalScore += score*4.5;
				count++;
			} else if(grade == "A0") {
				totalScore += score*4.0; 
				count++;
			} else if(grade == "B+") {
				totalScore += score*3.5; 
				count++;
			} else if(grade == "B0") {
				totalScore += score*3.0; 
				count++;
			} else if(grade == "C+") {
				totalScore += score*2.5; 
				count++;
			} else if(grade == "C0") {
				totalScore += score*2.0; 
				count++;
			} else if(grade == "D+") {
				totalScore += score*1.5; 
				count++;
			} else if(grade == "D0") {
				totalScore += score*1.0; 
				count++;
			} else if(grade == "F") {
				totalScore += score*0.5; 
				count++;
			}
		}	
		System.out.println(totalScore/count);
		scanner.close();
	}

}
