package chapter04;

import java.util.Scanner;

public class Study1Ex1 {
	
	public static void main(String[] args) {

		int score = 0; //점수를 저장하기 위한 변수
		char grade = ' '; //학점을 저장하기 위한 변수. 공백으로 초기화
		
		System.out.print("점수를 입력 : ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if(score >=90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		
		System.out.println("학점은 " + grade + "입니다.");
		
		
		/* ==
		
		int score = 0; 
		char grade = 'D'; //학점을 D로 초기화
		
		System.out.print("점수를 입력 : ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if(score >=90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} 
				
		System.out.println("학점은 " + grade + "입니다.");
	
		else를 없애줄 수 있음
		
		*/
	}

}
